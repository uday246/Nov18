package Nov14;

import java.awt.event.*;
import javax.swing.*;

public class Timing implements ActionListener{
    JButton button1;
    JLabel label1;
    public int minutes=3;//initial time
    public int time=minutes*60;//total amount of time in seconds only
    public int seconds=time%60;
    public String defaulttimeset="0"+Integer.toString(minutes)+":0"+Integer.toString(seconds);

    public static void main(String[] args) {
        Timing move=new Timing();
        move.go();
    }
    public void go(){
        JFrame frame=new JFrame();
        frame.setBounds(50,50,400,400);
        JPanel panel2=new JPanel();
        button1=new JButton("Start Time");
        panel2.add(button1);
       
        button1.setBounds(30,50,150,170);
        frame.getContentPane().add(button1);
       
        button1.addActionListener(this);
       
        label1=new JLabel(defaulttimeset);
        panel2.add(label1);       
        frame.getContentPane().add(panel2);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ev){
    	minutes=0;
    	minutes=3;//initial time
        time=minutes*60;//total amount of time in seconds only
        seconds=time%60;
    	new T(this).start();
    }
}
class T extends Thread{
	Timing t;
	public T(Timing aTiming) {
		t=aTiming; 
		
	}

	public void run(){
		for (int i=0;i<t.time;i++){
            String mi,s;
            if(t.seconds==0)
            {
            	t.minutes--;
            	t.seconds=60;
            }
            t.seconds--;
            mi="0"+Integer.toString(t.minutes);
            if (t.seconds<10){
                s="0"+Integer.toString(t.seconds);
            }
            else{
                s=Integer.toString(t.seconds);
            }
            t.defaulttimeset=mi+":"+s;
            t.label1.setText(t.defaulttimeset);

            try{
                Thread.sleep(1);
            }
            catch(Exception ex){System.out.println("how is this a countdown?");
            }
        }
    }
}
