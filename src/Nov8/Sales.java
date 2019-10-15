package Nov8;

import java.util.Scanner;

public class Sales {
	public static void main(String[] args) {
		String names[] = { "mild", "medium", "sweet", "hot", "zesty" };
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5;) {
			System.out.println("Enter sales for " + names[i]);
			arr[i] = sc.nextInt();
			if (arr[i] < 0) {
				System.err.println("Invalid value");
			} else {
				i++;
			}
		}
		int max = arr[0], min = arr[0];
		int maxIndex = 0, minIndex = 0;
		System.out.println(names[0] + "\t\t" + arr[0]);
		for (int i = 1; i < 5; i++) {
			System.out.println(names[i] + "\t\t" + arr[i]);
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
			if (min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
		System.out.println("Highest selled Prodcut  : " + names[maxIndex]);
		System.out.println("Lowest selled Prodcut  : " + names[minIndex]);

	}
}
