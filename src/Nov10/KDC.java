package Nov10;
import java.io.File;

import java.util.Scanner;

import org.apache.kerby.kerberos.kerb.server.SimpleKdcServer;

public class KDC {

SimpleKdcServer kdc = new SimpleKdcServer();

public void setUp() throws Exception {

String basedir = System.getProperty("basedir");

if (basedir == null) {

basedir = new File(".").getCanonicalPath();

}

// create a simple kdc server


//set its port and host

kdc.setKdcHost("localhost");

kdc.setKdcPort(5000);

//set its realm

kdc.setKdcRealm("CS.UWM.EDU");

//set its working directory at basedir + "/target", which is where krb5.conf will be created

kdc.setWorkDir(new File(basedir + "/target"));

//initialize the server

kdc.init();

//Allow TCP

kdc.setAllowUdp(false);

kdc.setAllowTcp(true);

//create two principals alice and bob in the server

kdc.createPrincipal("alice@CS.UWM.EDU", "Alice's password");

kdc.createPrincipal("bob/SERVICE@CS.UWM.EDU", "Bob's password");

//

}

public static void main(String[] args) {

try {

KDC server = new KDC();

server.setUp();

Scanner in = new Scanner(System.in);

String prompt = "Enter your command (start/stop/quit):";

System.out.println(prompt);

String cmd = in.nextLine().trim();

while(!cmd.equals("quit")) {

switch(cmd) {

case "start" :

server.kdc.start();

int port = server.kdc.getKdcPort();

String realm = server.kdc.getKdcSetting().getKdcRealm();

System.out.printf("kdc started at port %d and realm %s\n", port, realm);

break;

case "stop":

server.kdc.stop();

System.out.println("kdc stopped");

}

System.out.println(prompt);

cmd = in.nextLine().trim();

}

in.close();

} catch (Exception e) {

e.printStackTrace();

}

}

}
