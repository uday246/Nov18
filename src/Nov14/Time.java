package Nov14;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//class definition
public class Time extends JFrame{
    //variables
    JComboBox cb1,cb2,cb3,cb4,cb5,cb6;
    JLabel lb1,lb2,lb3,lb4,lb5,lb6;
    JButton jb1,jb2,jb3,jb4,jb5;
    JTextField tf;
    GridBagConstraints c;
    //constructor
    public Time() {
        //initiallizing the variables
        String str1[]=new String[24];
        for(int i=0;i<24;i++){
            str1[i]=""+i;
        }
        cb1=new JComboBox(str1);
        String str2[]=new String[60];
        for(int i=0;i<60;i++){
            str2[i]=""+i;
        }
        cb2=new JComboBox(str2);
        cb3=new JComboBox(str2);
        String str3[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        cb4=new JComboBox(str3);
        String str4[]=new String[31];
        for(int i=0;i<31;i++){
            str4[i]=""+i;
        }
        cb5=new JComboBox(str4);
        String str5[]=new String[201];
        for(int i=0;i<=200;i++){
            str5[i]=""+(i+1900);
        }
        cb6=new JComboBox(str5);
        lb1=new JLabel("Hour");
        lb2=new JLabel("Minute");
        lb3=new JLabel("Second");
        lb4=new JLabel("Month");
        lb5=new JLabel("Day");
        lb6=new JLabel("Year");
      
        jb1=new JButton("Set");
        jb2=new JButton("Incr Day");
        jb3=new JButton("Decr Day");
        jb4=new JButton("Incr Second");
        jb5=new JButton("Decr Second");

        tf=new JTextField("                             ");
        tf.setEditable(false);
        //setting layout as gridbag layout and adding the component
        setLayout(new GridBagLayout());
        c = new GridBagConstraints();
        c.ipadx=5;
        c.gridx = 2;
        c.gridy = 0;
        add(lb1,c);
        c.gridx = 3;
        c.gridy = 0;
        add(cb1,c);
        c.gridx = 2;
        c.gridy = 1;
        add(lb2,c);
        c.gridx = 3;
        c.gridy = 1;
        add(cb2,c);
        c.gridx = 2;
        c.gridy = 2;
        add(lb3,c);
        c.gridx = 3;
        c.gridy = 2;
        add(cb3,c);
        c.gridx = 2;
        c.gridy = 3;
        add(lb4,c);
        c.gridx = 3;
        c.gridy = 3;
        add(cb4,c);
        c.gridx = 2;
        c.gridy = 4;
        add(lb5,c);
        c.gridx = 3;
        c.gridy = 4;
        add(cb5,c);
        c.gridx = 2;
        c.gridy = 5;
        add(lb6,c);
        c.gridx = 3;
        c.gridy = 5;
        add(cb6,c);
        c.gridx = 0;
        c.gridy = 6;
        add(jb1,c);
        c.gridx = 1;
        c.gridy = 6;
        add(jb2,c);
        c.gridx = 2;
        c.gridy = 6;
        add(jb3,c);
        c.gridx = 3;
        c.gridy = 6;
        add(jb4,c);
        c.gridx = 4;
        c.gridy = 6;
        add(jb5,c);
        c.gridx = 2;
        c.gridy = 7;
        add(tf,c);

    }

    //main method definition
    public static void main(String[] args) {
        //creating object
        Time t=new Time();
        //setting the size og gui
        t.setSize(500,500);
        //making the gui visible
        t.setVisible(true);
        //creating object of watch class
        Watch wt=new Watch();
        //setting the text of the text field
        t.tf.setText(wt.showWatch());
    }
}
