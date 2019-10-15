package Nov2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class FinancialAid {
	public static void main(String[] args) {
		final int NUM_MIN_DEPENDENTS = 0;
		final int NUM_MAX_DEPENDENTS = 9;

		/*
		 * #1: Create code that will call the method you created in #3 below to
		 * get the number of dependents, factoring in the minimum and maximum
		 * number of dependents allowed
		 */
		int dependents = getDependents();
		if (dependents < NUM_MIN_DEPENDENTS || dependents > NUM_MAX_DEPENDENTS) {
			System.out.println("Dependents must in range from 0-9");
			return;
		}
		double aid = getIncome(dependents);

		/*
		 * #2: Create code that will call the method you created in #4 below to
		 * calculate the amount of aid that will be earned based on the number
		 * of dependents gathered.
		 */

		printFinancialAid(aid);
	}

	public static int getDependents() {
		System.out.println("Enter number of dependents");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	/*
	 * #3: Create a method to get and return the number of dependents, factoring
	 * in the minimum and maximum number of dependents allowed
	 */

	private static double getIncome(int d) {
		if (d == 2)
			return 2 * 1500;
		else if (d == 3)
			return 3 * 2500;
		else if (d == 4)
			return 4 * 2000;

		return 0;
	}
	/*
	 * #4: Create a method to calculate and return the amount of financial aid
	 * that will be earned based on the number of dependents gathered
	 */

	public static void printFinancialAid(double aid) {
		JOptionPane.showMessageDialog(null,
				"The amount of financial aid your family is eligible for is: $" + String.format("%.2f", aid));
	}
}
