package Nov10;

import java.util.Scanner;

class Payroll {
	int[] empid = {56588 ,45201 ,78951 ,87775 ,84512 ,13028 ,75804};

	int[] hours = new int[7];

	double[] rate = new double[7];

	double[] wages = new double[7];

	void setHoursAt(int i, int hrs) {
		hours[i] = hrs;
	}

	void setRateAt(int i, double rt) {
		rate[i] = rt;
	}

	void setWagesAt(int i, double wg) {
		wages[i] = wg;
	}

	int getEmpidAt(int i) {
		return empid[i];
	}

	double getWagesAt(int i) {
		return wages[i];
	}

	double getGrossPayAt(int i) {
		return hours[i] * rate[i];
	}
}

public class PayrollDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Payroll p = new Payroll();
		for (int i = 0; i < 7; i++) {
			System.out.println("Enter number of hours for emp - " + p.empid[i] + " : ");
			int h = sc.nextInt();
			p.setHoursAt(i, h);
			System.out.println("Enter rate for emp - " + p.empid[i] + " : ");
			double r = sc.nextDouble();
			p.setRateAt(i, r);
			p.setWagesAt(i, h * r);

		}
		System.out.println("Emp Id \t Salary");
		for (int i = 0; i < 7; i++)
			System.out.printf(p.empid[i] + " \t %.2f\n", p.wages[i]);
	}
}
