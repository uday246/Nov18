package Nov10;

import java.util.Scanner;

public class RetirementGoal2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of years");
		int years = sc.nextInt();
		while (years < 0) {
			System.out.println("Enter the number if years");
			years = sc.nextInt();
		}
		System.out.println("Enter the amount saves per anum");
		double amount = sc.nextDouble();
		double sum = 0;
		for (int i = 0; i < years; i++){
			sum += amount;
		}

		System.out.printf("Amount after " + years + " yrs :%.2f " , sum);

	}
}
