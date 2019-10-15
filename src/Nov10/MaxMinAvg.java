package Nov10;

import java.util.Scanner;

public class MaxMinAvg {
	public static void main(String[] args) {
		int arr[] = new int[10];
		int max = -1, smax = 0, min = 10000;
		double sum = 0, avg;
		System.out.println("Enter 10 elements");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int t = sc.nextInt();
			if (max < t) {
				smax = max;
				max = t;
			}
			if (min > t)
				min = t;
			sum += t;
		}
		avg = sum / 10;
		System.out.println("Largest : " + max);
		System.out.println("Second Largest : " + smax);
		System.out.println("Smallest : " + min);
		System.out.println("Sum : " + sum);
		System.out.println("Avg : " + avg);
	}
}
