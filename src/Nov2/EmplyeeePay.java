package Nov2;

import java.util.Scanner;

public class EmplyeeePay {
	public static void main(String[] args) {
		int empId;
		double hours;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter employee id");
			empId = sc.nextInt();
			if(empId==0)
				break;
			System.out.println("Enter worked hours");
			hours = sc.nextDouble();
			double grossPay = getGrossPay(hours);
			double deductions = getDeductions(grossPay);
			double net = grossPay - deductions;
			System.out.println("Emp No \t\t: " + empId);
			System.out.println("Gross Amount\t: " + grossPay);
			System.out.println("Deductions\t: " + deductions);
			System.out.println("Net Amount\t: " + net);

		} while (empId != 0);
		System.out.println("Bye bye...");

	}

	private static double getDeductions(double aGrossPay) {
		if (aGrossPay < 50)
			return aGrossPay * 0.01;
		if (aGrossPay >= 50 && aGrossPay < 200)
			return aGrossPay * 0.05;

		return aGrossPay * 0.08;
	}

	private static double getGrossPay(double aHours) {
		return aHours * 8.25;
	}
}
