package Nov10;

import java.util.Scanner;

public class EmpWages {
	public static void main(String[] args) {
		int[] empid = new int[6];

		int[] hours = new int[6];

		double[] rate = new double[6];

		double[] wages = new double[6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println("Enter Emp - " + (i + 1) + " id : ");
			empid[i] = sc.nextInt();
			System.out.println("Enter number of hours for emp - " + (i + 1) + " : ");
			hours[i] = sc.nextInt();
			System.out.println("Enter rate for emp - " + (i + 1) + " : ");
			rate[i] = sc.nextDouble();
			if (hours[i] > 40) {
				wages[i] = 40 * rate[i];
				wages[i] = wages[i] + (rate[i] * 1.5) * (hours[i] - 40);
			} else {
				wages[i] = hours[i] * rate[i];
			}

		}
		System.out.println("Emp Id \t Salary");
		for(int i=0;i<6;i++)
			System.out.println(empid[i]+" \t "+wages[i]);
	}
}
