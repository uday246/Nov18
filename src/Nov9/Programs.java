package Nov9;

import java.util.Random;
import java.util.Scanner;

public class Programs {
	public static int getMode(int arr[]) {
		int maxValue = 0, maxCount = 0;

		for (int i = 0; i < arr.length; ++i) {
			int count = 0;
			for (int j = 0; j < arr.length; ++j) {
				if (arr[j] == arr[i])
					++count;
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = arr[i];
			}
		}

		return maxValue;
	}

	public static void main(String[] args) {
		char arr[] = new char[25];
		Scanner input = new Scanner(System.in);
		int i = 0;
		System.out.println("Enter characteres, @ end");
		while (true) {
			char singleCharacter = input.next().charAt(0);
			if (singleCharacter == '@')
				break;
			arr[i++] = singleCharacter;
		}
		for (int j = 0; j < i; j++)
			System.out.print(arr[j] + " ");
		int array[] = new int[2000];
		Random randomNumberGenerator = new Random();
		double sum = 0;
		int min = 200, max = -1;
		for (i = 0; i < 2000; i++) {
			int x = randomNumberGenerator.nextInt(100) + 1;
			if (x < min)
				min = x;
			if (x > max)
				max = x;
			sum += x;
			array[i] = x;
		}
		System.out.println("\nMin Value : " + min);
		System.out.println("Max Value : " + max);
		System.out.println("Average : " + (sum / 2000));
		System.out.println("Mode : " + getMode(array));

	}
}
