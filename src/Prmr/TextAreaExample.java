package Prmr;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaExample {
	TextAreaExample() throws Exception {
		JFrame f = new JFrame();
		JTextArea area = new JTextArea(5,5);
		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		String line=br.readLine();
		String msg="";n
		while(line!=null){
			msg+=line;
			line=br.readLine();
		}
		area.setText(msg);
		area.setBounds(10, 30, 200, 200);
		f.add(area);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]) throws Exception {
		new TextAreaExample();
	}
}