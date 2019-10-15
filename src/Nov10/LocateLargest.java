package Nov10;

import java.util.Scanner;

public class LocateLargest {
	public static void main(String[] args) {
		// created array
		int arr[][] = new int[3][4];
		Scanner sc = new Scanner(System.in);
		int maxRow = 0, maxCol = 0, maxEle = -1;
		System.out.println("Enter 12 elements into the array");
		// reading elements into the array and finding the max element
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
				// if max is small than swap max with the element
				if (maxEle < arr[i][j]) {
					maxEle = arr[i][j];
					maxRow = i;
					maxCol = j;
				}
			}
		}
		// printing the 2D array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("First largest value is located at row " + maxRow + " and column " + maxCol);
	}
}
