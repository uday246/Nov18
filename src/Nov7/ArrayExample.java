package Nov7;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		while (num > 10) {
			System.out.println("Number can't be greater than 10");
			num = sc.nextInt();
		}
		int arr[] = new int[num];
		System.out.println("Enter " + num + " elements");
		int max = -1,min=Integer.MAX_VALUE;
		for (int i = 0; i < num; i++) {
			arr[i]=sc.nextInt();
			if (min > arr[i])
				min = arr[i];
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println("Max element in array : " + max);
		System.out.println("Min element in array : " + min);

		int rev[] = new int[num];
		for (int i = 0; i < num; i++)
			rev[i] = arr[num-1-i];
		System.out.println("Original Array :");
		for (int i = 0; i < num; i++)
			System.out.print(arr[i] + " ");
		System.out.println("\nReverse Array :");
		for (int i = 0; i < num; i++)
			System.out.print(rev[i] + " ");

	}
}
