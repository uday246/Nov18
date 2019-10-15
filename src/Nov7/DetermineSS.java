package Nov7;

import javax.swing.JOptionPane;

public class DetermineSS {
	public static void main(String[] args) {
		// reading age and converting it into integer
		int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter you age"));
		if (age >= 65)
			JOptionPane.showMessageDialog(null, "You qualify for social security");
		else
			JOptionPane.showMessageDialog(null, "You do not qualify for social security");

	}
}
