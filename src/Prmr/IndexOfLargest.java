package Prmr;

import java.util.Scanner;

public class IndexOfLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 numbers");
		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();
		int index = findIndex(arr);
		System.out.println("First Largest index : " + index);
		sc.close();
	}

	private static int findIndex(int[] aArr) {
		// assuming 0th element is max element
		int max = aArr[0], index = 0;
		// iterating through the array and checking if there any othere elements
		// greater than max
		for (int i = 1; i < aArr.length; i++) {
			if (max < aArr[i]) {
				max = aArr[i];
				index = i;
			}
		}
		return index;
	}
}
