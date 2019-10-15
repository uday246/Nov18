package Nov1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class PossibleRoute {
public static void main(String[] args) {
try {
	System.out.println(routeExist("map.txt","A","G"));
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
}

private static boolean routeExist(String aString, String aString2, String aString3) throws Exception {
	BufferedReader br = new BufferedReader(new FileReader(aString));
	boolean res=false;
	String line = br.readLine();
	HashMap<String,String> map= new HashMap<String,String>();
	while(line!=null){
		String arr[] = line.split(" ");
		map.put(arr[0], arr[1]);
		line = br.readLine();
	}
	String key=aString2;
	System.out.println(map);
	while(true){
		String r  = map.get(key);
		if(r==null)
			break;
		if(r.equalsIgnoreCase(aString3)){
			res=true;
			break;
		}
		else{
			key=r;
		}
	}
		
	return res;
}
}
