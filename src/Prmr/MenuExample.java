package Prmr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MenuExample implements ActionListener{
	JMenu menu;
	JMenuItem i1, i2, i3;

	MenuExample() {
		JFrame f = new JFrame("Menu and MenuItem Example");
		JMenuBar mb = new JMenuBar();
		menu = new JMenu("Menu");
		i1 = new JMenuItem("New");
		i2 = new JMenuItem("Opem");
		i3 = new JMenuItem("Exit");
		i3.addActionListener(this);
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new MenuExample();
	}

	@Override
	public void actionPerformed(ActionEvent aE) {
		System.exit(0);
	}
}
