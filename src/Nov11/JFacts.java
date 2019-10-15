package Nov11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFacts extends JFrame implements ActionListener {
FlowLayout flow = new FlowLayout();
JButton b = new JButton("Press to change fact");
JLabel stars = new JLabel("*******************************************************************************");
JLabel fact = new JLabel();
int index=0;
String[] quotes = new String[]{"Only seven prisoners were in the Bastille when it was stormed. ",
"A Tale of Two Cities is a novel set during the French Revolution. ",
"Perhaps 40,000 people were executed at the guillotine. ",
"A loaf of bread cost a weeks wages prior to the French Revolution. ",
"Thomas Jefferson was the U.S. Minister to France during the Revolution. ",
"Protestant and Jewish religions were illegal in France before 1879. ",
};
int counter = 0;
public JFacts() {
	setVisible(true);
	setSize(600, 400);
	add(b);
	add(stars);
	stars.setBounds(40,60,600,30);
	add(fact);
	fact.setText(quotes[index]);
	fact.setBounds(40,100,500,30);
	
	
	setLayout(null);
	b.setBounds(20, 20, 250, 30);
	b.addActionListener(this);
	
}
public static void main(String[] args) {
JFacts rFrame = new JFacts();
}
@Override
public void actionPerformed(ActionEvent e) {
	fact.setText(quotes[index%6]);
	index++;
}

}
