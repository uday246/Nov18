package Nov10;

import java.util.Scanner;

public class DiscountRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The original Bill amount : ");
		double amount = sc.nextDouble();
		System.out.println("Bill after discount : " + Discount.getDiscountedBill(amount));
		sc.close();
	}
}

class Discount {
	public static double getDiscountedBill(double amount) {
		if (amount > 2000)
			return amount - amount * 0.15;
		return amount;
	}
}
