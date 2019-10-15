package Prmr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame extends JFrame {
	private JButton myButton;

	JLabel lblStudentName;

	public MyJFrame(){

	initializeComponents();
	}
	// write your codd here

	private void initializeComponents() {
		myButton = new JButton("name that student");
		myButton.setBounds(100,50,150,30);
		add(myButton);
		myButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	// to close the frame
            	lblStudentName.setText("Steve");
            }
        });
		lblStudentName= new JLabel();
		lblStudentName.setBounds(100,100,130,30);
		setSize(300, 300);  
		add(lblStudentName);
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setVisible(true);  
	}
	public static void main(String[] args) {
		new MyJFrame();
	}
}
