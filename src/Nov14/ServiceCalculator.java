package Nov14;

import java.util.Scanner;

public class ServiceCalculator {
	public static void main(String[] args) {

		// scanner to read data from user
		Scanner sc = new Scanner(System.in);
		char Package;
		double GBUsed;
		double monthlyBill = 0;
		// starting infinite loop to get valid inputs from user
		while (true) {

			// reading type of package from user
			System.out.print("Enter Package (A/B/C) :");
			Package = sc.next().charAt(0);
			// reading data from user
			System.out.print("Enter GB Used :");
			GBUsed = sc.nextDouble();
			// checking if inputs are valid than comes out of the loop
			if ((Package == 'A' || Package == 'B' || Package == 'C') && (GBUsed >= 0 && GBUsed <= 50)) {
				break;
			} else {
				System.out.println("\nInvalid Input\n\nEnter the details again\n--------------------");
			}
		}
		// starting to switch to calculate based user selected package
		switch (Package) {
		// if selected type is A
		case 'A':
			// checking if user used less than 5 GB else calculating additional charges
			if (GBUsed <= 5) {
				monthlyBill = 50;
			} else {
				monthlyBill = 50 + ((GBUsed - 5) * 15);
			}
			break;
		case 'B':
			// checking if user used less than 10 GB else calculating additional charges
			if (GBUsed <= 10) {
				monthlyBill = 65;
			} else {
				monthlyBill = 65 + ((GBUsed - 10) * 10);
			}
			break;
		case 'C':
			monthlyBill = 75;
			break;
		}
		System.out.printf("\nMonthly bill = $%.2f\n", monthlyBill);
		// based on usage suggesting Package type for user
		if (GBUsed <= 5) {
			if (Package != 'A')
				System.out.println("Suitable package for your usage is 'A'");
			else
				System.out.println("You have choosen correct package for your usage");
		} else if (GBUsed <= 10) {
			if (Package != 'B')
				System.out.println("Suitable package for your usage is 'B'");
			else
				System.out.println("You have choosen correct package for your usage");
		} else if (GBUsed > 10) {
			if (Package != 'C')
				System.out.println("Suitable package for your usage is 'C'");
			else
				System.out.println("You have choosen correct package for your usage");
		}
	}
}
