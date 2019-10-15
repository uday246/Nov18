package Nov16;

import java.util.Scanner;

public class SquareOfAsterisks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		if (n < 0 || n > 50)
			throw new IllegalArgumentException(" size must be in range 1-50");
		else
			printAsterisks(n);
	}

	private static void printAsterisks(int aN) {

		for (int i = 0; i < aN; i++) {
			for (int j = 0; j < aN; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
