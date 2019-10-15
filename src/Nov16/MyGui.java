package Nov16;

import java.awt.event.KeyEvent;
import java.util.TreeSet;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class Student1{
	
}
public class MyGui {
public static void main(final String args[]) {
	TreeSet<Student1>t = new TreeSet<Student1>();
	t.add(new Student1());
	t.add(new Student1());
	t.add(new Student1());
	
JFrame frame = new JFrame("Computer Science");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JMenuBar menuBar = new JMenuBar();

// File Menu, S - Mnemonic
JMenu fileMenu = new JMenu("Student");
fileMenu.setMnemonic(KeyEvent.VK_S);
menuBar.add(fileMenu);

// File->New, N - Mnemonic
JMenuItem newMenuItem = new JMenuItem("Name", KeyEvent.VK_N);
fileMenu.add(newMenuItem);

// Separator
fileMenu.addSeparator();

// File->Save, C - Mnemonic
JMenuItem saveMenuItem = new JMenuItem("Course", KeyEvent.VK_C);
fileMenu.add(saveMenuItem);

frame.setJMenuBar(menuBar);
frame.setSize(400, 400);
frame.setVisible(true);
}
}
