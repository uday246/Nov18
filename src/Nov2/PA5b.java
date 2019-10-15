package Nov2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PA5b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String ch = "";

		do {

			double avg = getAverage(sc);

			System.out.printf("The average is: %.2f%n", avg);

			System.out.println("Do you want to compute another average (y/n)? ");

			sc.nextLine();

			ch = sc.nextLine();

		} while (!ch.equalsIgnoreCase("N"));

	}

	private static double getAverage(Scanner aSc) {

		double sum = 0.00;

		double count = 0, num = 0.00;

		System.out.println("Enter a stream of non negative numbers (negative number when finished): ");

		while (true) {
			try{
			num = aSc.nextDouble();

			if (num < 0)

				break;

			sum += num;

			count++;
			}
			catch(InputMismatchException e){
				System.out.println("Entered letter instead of number.. Bye Bye..");
				return 0;
			}

		}

		Float avg = (float) sum / (float) count;

		if (count == 0)

			return 0.00;

		else

			return avg;

	}
}
