package Nov7;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		int arr[] = new int[10];
		Random r = new Random();
		int num, min = 1000, max = -1;
		for (int i = 0; i < 10; i++) {
			arr[i] = r.nextInt(100);
		}
		for (int i = 0; i < 10; i++) {
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
			arr[i] = arr[i];
			System.out.println(arr[i] + " ");
		}
		System.out.println("Min value : " + min);
		System.out.println("Max value : " + max);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to search");
		num = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < 10; i++) {
			if (arr[i] == num) {
				found = true;
				break;
			}
		}
		sc.close();
		if (found)
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	}
}
