package Nov1;

import java.util.Scanner;

/*
 * This is program is going to print 5 fibonacci numbers from given n positions
 * Ex: if i gave 5 than it will print 5th,6th,7th,8th,9th,10th position fib numbers and calculates the time how 
 * much time it is taking to find for each position
 */
public class FibonacciTimer {

	public static void main(String[] arg) {
		// reading number from the user

		System.out.print("Enter a positive integer: ");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		// noting the starting time

		long currentTime = System.currentTimeMillis();
		long prevTime;
		long elapsedTime = 0;

		for (int k = 0; k <= 5; k++) {
			// noting the starting time
			prevTime = currentTime;

			System.out.print("The Fibonacci term at position ");

			System.out.print((num + k) + " is ");
			// calling fib() to find the number at nth position

			System.out.println(fib(num + k));
			// storing the current time

			currentTime = System.currentTimeMillis();
			// finding how many sec it took to complete the function

			elapsedTime = (currentTime - prevTime) / 1000;

			System.out.println("Computed in " + elapsedTime + " seconds. ");

		}

	}

	public static long fib(long n) {
		// array to store fib series
		long fib[] = new long[(int) (n + 1)];

		fib[0] = 0;

		fib[1] = 1;

		// iterating through array to fill the fib series
		for (int i = 2; i <= (int) n; ++i) {
			// filling the fib series

			fib[i] = fib[i - 1] + fib[i - 2];

		}
		// returning the fib number at given position
		return fib[(int) n];

	}

}
