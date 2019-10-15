package Nov1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Connect4GUI extends JFrame
{
JButton button1,
button2,
button3,
button4;
//private static final int BUTTON_LOCATION_X = 100;
//private static final int BUTTON_LOCATION_Y = 300;

public Connect4GUI() {

//JFrame properties
this.setSize (400,400);
this.setVisible(true);
this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
this.setTitle ("Connect Four");

//create panel and welcome label
JPanel panel = new JPanel();
JLabel label1 = new JLabel("Welcome to Connect Four! Choose player 1 below!");   
panel.add (label1);
this.add (panel);

//create player type buttons for user to click
button1 = new JButton("Human");
button2 = new JButton("Computer w/ random moves");
button3 = new JButton("Computer w/ look ahead moves");
button4 = new JButton("Exit game");
panel.add (button1);
panel.add (button2);
panel.add (button3);
panel.add (button4);
button1.setBounds(100, 50, 200, 30);
button2.setBounds(100, 90, 200, 30);
button3.setBounds(100, 130, 215, 30);
button4.setBounds (100, 170, 100, 30);
button1.addActionListener (new Action());
button2.addActionListener (new Action());
button3.addActionListener (new Action());
button4.addActionListener (new Action());
}

private class Action implements ActionListener
{   
public Action() {
		// TODO Auto-generated constructor stub
	}

public void actionPerformed(ActionEvent e) {
if (e.getSource() == button1) {
//choose human player
JOptionPane.showMessageDialog (null," Player 1 is a human.");
new GameFrame();
}
  
if (e.getSource() == button2) {
// choose comp w/ random moves
JOptionPane.showMessageDialog (null, "Player 1 is a computer");
}
  
//choose number of lookahead moves for comp
if (e.getSource() == button3) {
String compMoves = JOptionPane.showInputDialog (null, "Enter computer look ahead moves between 1 and 6.");
  
//check for non integers and invalid integers
try {
int foo = Integer.parseInt (compMoves);
if (foo < 1 || foo > 6)
{
JOptionPane.showMessageDialog(null, "Must be between 1 and 6!");
}
} catch (NumberFormatException nfe) {
JOptionPane.showMessageDialog(null, "Enter an integer!");
}
}  
  
//exit game
if (e.getSource() == button4) {
System.exit (0);
}
}
}
  
public static void main (String [] args)
{
new Connect4GUI();
}

}

class GameFrame extends JFrame{
	public GameFrame() {
		this.setSize (400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		this.setTitle ("Game Frame");
		}
}
