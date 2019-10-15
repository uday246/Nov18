package Nov11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JFrameDisableButton extends JFrame implements ActionListener {
	final int SIZE = 180;
	Container con = getContentPane();
	JButton button = new JButton("Press Me");
	int count = 0;
	final int MAX = 8;
	JLabel label = new JLabel("That's enough!");

	public JFrameDisableButton() {
		// Write your code here
		setVisible(true);
		setSize(400, 400);
		add(button);
		setLayout(null);
		button.setBounds(20, 20, 100, 30);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		if (count == 8) {
			button.setEnabled(false);
			add(label);
			label.setBounds(50, 50, 100, 30);
		}
	}

	public static void main(String[] args) {
		JFrameDisableButton frame = new JFrameDisableButton();
	}
}
