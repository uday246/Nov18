package Nov9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Enter three integers : ");
		while (true) {
			try {
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				n3 = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Incorrect input, re-enter three integers:");
				sc=new Scanner(System.in);
			}
		}
		sc.close();
		double sum = n1 + n2 + n3;
		System.out.println("Average : " + (n1 + n2 + n3) / 3);
	}
}
