package Nov7;

import java.util.Random;
import java.util.Scanner;

public class RandomAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		Random r = new Random();
		double sum = 0;
		System.out.println(num+" random numbers are generated");
		for (int i = 0; i < num; i++) {
			if (i % 10 == 0)
				System.out.println();
			arr[i] = r.nextInt(99)+1;
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("The Sum of random  numbers is : " + sum);
		System.out.println("The average of random  numbers is : " + (sum / num));

		double average = sum / num;
		int count = 0;
		for (int i = 0; i < num; i++) {
			if (arr[i] >= average)
				count++;
		}
		System.out.println("There are " + count + " random  numbers above the average");
		for (int i = 0; i < num; i++) {
			if (arr[i] >= average)
				System.out.print(arr[i] + " ");
		}
	}
}
