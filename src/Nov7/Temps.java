package Nov7;

import java.util.Scanner;

public class Temps

{

	// --------------------------------------------------

	// Reads in a sequence of temperatures and finds the

	// maximum and minimum read in.

	// --------------------------------------------------

	public static void main(String[] args) {

		final int HOURS_PER_DAY = 24;

		int temp; // a temperature reading

		Scanner scan = new Scanner(System.in);

		// print program heading

		System.out.println();

		System.out.println("Temperature Readings for 24 Hour Period");

		System.out.println();
		int maxTemp = -1000;
		int minTemp = 1000;
		for (int hour = 0; hour < HOURS_PER_DAY; hour++) {

			System.out.print("Enter the temperature reading at " + hour + " hours: ");

			temp = scan.nextInt();
			if (maxTemp < temp)
				maxTemp = temp;
			if (temp < minTemp)
				minTemp = temp;
		}
		System.out.println("Max temprature : " + maxTemp);
		System.out.println("Min temprature : " + minTemp);

		// prints the result

	}

}
