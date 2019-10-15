package Nov7;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = "y";
		while (ch.equalsIgnoreCase("y")) {
			System.out.println("Enter name");
			String name = sc.nextLine();
			System.out.println("Enter age");
			int age = sc.nextInt();
			System.out.println("Enter weight in lbs");
			double w = sc.nextDouble();
			System.out.println("Enter height in fts");
			double h = sc.nextDouble();

			healthStatus(name, age, w, h);
			System.out.println("Do you want to continue (y)");
			sc.nextLine();
			ch = sc.nextLine();
		}

	}

	private static void healthStatus(String aName, int aAge, double w, double h) {

		w = lbsToKg(w);
		h = ftToM(h);
		double bmi = bmi(w, h);
		System.out.println(aName + " : ");
		if (bmi < 18.5) {
			System.out.println("You are underweight");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("You are normal");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("You are overweight");
		} else {
			System.out.println("Your obese");
		}

	}

	private static double bmi(double aW, double aH) {
		return aW / (aH * aH);
	}

	public static double lbsToKg(double w) {
		return w * .45;
	}

	public static double ftToM(double h) {
		return h * 0.3;
	}
}
