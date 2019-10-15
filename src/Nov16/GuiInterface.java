package Nov16;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiInterface {
	// Note: Typically the main method will be in a
	// separate class. As this is a simple one class
	// example it's all in the one class.
	// public static void main(String[] args) {
	// new GuiInterface();
	// }
	public GuiInterface() {
		JFrame guiFrame = new JFrame();
		// make sure the program exits when the frame closes
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Example GUI");
		guiFrame.setSize(300, 250);
		// This will center the JFrame in the middle of the screen
		guiFrame.setLocationRelativeTo(null);
		// Options for the JComboBox
		String[] votingOption = { "Yes", "No" };
		// The first JPanel contains a JLabel and JCombobox
		final JPanel comboPanel = new JPanel();
		JLabel comboLbl = new JLabel("Do you Vote for Pedro?:");
		JComboBox vote = new JComboBox(votingOption);
		comboPanel.add(comboLbl);
		comboPanel.add(vote);

		JButton pedroVote = new JButton("Submit");
		// listPanel.setVisible(true);
		// The ActionListener class is used to handle the
		// event that happens when the user clicks the button.
		// As there is not a lot that needs to happen we can
		// define an anonymous inner class to make the code simpler.
		pedroVote.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				// When the fruit of veg button is pressed
				// the setVisible value of the listPanel and
				// comboPanel is switched from true to
				// value or vice versa.

				System.out.println("you voted:"+vote.getSelectedItem().toString());
				comboPanel.setVisible(!comboPanel.isVisible());
				guiFrame.setVisible(false);
			}
		});
		// The JFrame uses the BorderLayout layout manager.
		// Put the two JPanels and JButton in different areas.
		guiFrame.add(comboPanel, BorderLayout.NORTH);
		guiFrame.add(pedroVote, BorderLayout.SOUTH);
		// make sure the JFrame is visible
		guiFrame.setVisible(true);
	}
	public static void main(String[] args) {
		new GuiInterface();
	}
}
