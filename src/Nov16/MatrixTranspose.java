package Nov16;

import java.util.Scanner;

import Nov11.Pixel;

public class MatrixTranspose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows, cols;
		while (true) {
			System.out.println("Enter rows and cols");
			rows = sc.nextInt();
			cols = sc.nextInt();
			if (rows >= 2 && rows <= 5 && cols >= 2 && cols <= 5)
				break;
			else
				System.out.println("Rows and cols must be between 2 and 5");
		}
		int arr[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Please enter data for  (" + (i + 1) + "," + (j + 1) + ")");
				arr[i][j] = sc.nextInt();
			}
		}
		displayArray(arr);

	      int transpose[][] = new int[cols][rows];
	     
	      for (int c = 0; c < rows; c++)
	         for (int d = 0; d < cols; d++)              
	            transpose[d][c] = arr[c][d];
	     System.out.println("After Transpose: ");
	     displayArray(transpose);
	}

	private static void displayArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
