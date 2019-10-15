package Nov13;

import java.util.*;

abstract class CalculatorNumVals {
	int num1, num2;

	CalculatorNumVals(int value1, int value2) {
		num1 = value1;
		num2 = value2;
	}

	public String toString() {
		return "Numbers are " + num1 + "\t" + num2 + "\n";
	}

	abstract void add();

	abstract void subtract();

	abstract void multiply();

	abstract void division();
}

class CalFunctions extends CalculatorNumVals {
	CalFunctions(int value1, int value2) {
		super(value1, value2);
	}

	void add() {
		int ans;
		ans = num1 + num2;
		System.out.println("Addition of two numbers is " + ans);
		System.out.println();
	}

	void subtract() {
		int ans;
		ans = num1 - num2;
		System.out.println("Subtraction of two numbers is " + ans);
		System.out.println();
	}

	void multiply() {
		int ans;
		ans = num1 * num2;
		System.out.println("Multiplication of two numbers is " + ans);
		System.out.println();
	}

	void division() {
		double ans = 0;
		try {
			ans = (double) num1 / num2;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Division of two numbers is " + ans);
		System.out.println();
	}
}

class CalculatorDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int val1, val2, choice = 0;

		while (choice != -1) {
			System.out.println("\nOperations of Calculator :");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n 5 Exit");
			System.out.println("-----------------------------------------------------------------\n");

			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			if (choice == -1)
				break;

			System.out.print("\nEnter number 1 : ");
			val1 = sc.nextInt();
			System.out.print("Enter number 2 : ");
			val2 = sc.nextInt();
			System.out.println();
			CalFunctions cal = new CalFunctions(val1, val2);
			System.out.println(cal);

			switch (choice) {
			case 1:
				cal.add();
				break;
			case 2:
				cal.subtract();
				break;
			case 3:
				cal.multiply();
				break;
			case 4:
				cal.division();
				break;
			case 5:
				choice = -1;
				break;

			default:
				System.out.println("Invalid case\n");
				break;
			}
		}
	}
}
