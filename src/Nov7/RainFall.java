package Nov7;

import java.util.Scanner;

public class RainFall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rain fall in inches  for each ");
		double sum = 0, n = 0;
		String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		double arr[] = new double[12];
		// reading the rains fall for each month
		for (int i = 0; i < 12;) {
			System.out.println("Enter the rain fall for month " + months[i]);
			arr[i] = sc.nextDouble();
			// if it is negative, reading again the for same month
			if (arr[i] < 0) {
				System.out.println("value must be 0 or more. Please re-enter");
			} else {
				sum += arr[i];
				i++;
			}

		}
		// finding the sum
		for (double d : arr) {
			sum += d;
		}
		// finding the min 
		int min = 0;
		for (int i = 1; i < 12; i++)
			if (arr[min] > arr[i])
				min = i;
		int max = 0;
		//finding the max
		for (int i = 1; i < 12; i++)
			if (arr[max] < arr[i])
				max = i;
		System.out.println("Total rainfall for the year is " + sum);
		System.out.println("Average rainfall for the year is " + (sum / 12));
		System.out.println("The Largest amount of the rainfaill in year is " + arr[max] + " inches in " + months[max]);
		System.out.println("The smallest amount of the rainfaill in year is " + arr[min] + " inches in " + months[min]);

	}
}
