package Nov1;

import javax.swing.JOptionPane;

public class SumProd {
	public static void main(String[] args) {
		int n1, n2, again;
		String res1, res2;
		do {

			n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1"));
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2"));
			res1 = "The sum of " + n1 + " , " + n2 + " is " + (n1 + n2);
			res2 = "The product of " + n1 + " , " + n2 + " is " + (n1 * n2);
			JOptionPane.showMessageDialog(null, res1 + "\n" + res2);
			again = JOptionPane.showConfirmDialog(null, "Try another pair?");
		} while (again == JOptionPane.YES_OPTION);
	}
}
