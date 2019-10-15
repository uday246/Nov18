package Nov12;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		//generating random number
		int rand = r.nextInt(100);
		System.out.println("Ranom number generated from 1-100");
		int count = 0;
		while (true) {

			System.out.println("Enter your guess");
			// taking number from user
			int num = sc.nextInt();
			//validating if the given number is in range
			if (num < 0 || num > 100) {
				System.out.println("Number must be between 1-100");
				continue;
			}
			//checking if both are equal
			if (num == rand) {
				System.out.println("Good guess");
				break;
			} else if (num < rand) {
				System.out.println("Low.. try again");
			} else {
				System.out.println("High.. try again");

			}
		}
		sc.close();
	}
}
