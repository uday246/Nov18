package Nov9;

import java.util.Arrays;

public class SortSam {
	public static void main(String[] args) {
		int arr[] = { 2007, 1996, 1999, 2001, 1982, 2001, 1998, 1993, 1991 };
		System.out.println(Arrays.toString(arr));
		int year = 1999;
		sortByAgeDifference(arr, year);
		System.out.println(Arrays.toString(arr));

	}

	public static void sortByAgeDifference(int arr[], int year) {
		int i, j, temp, n = arr.length;
		// outer loop to travel through the all elements
		for (i = 0; i < n - 1; i++) {
			// inner loop to compare the outer loop elements
			for (j = 0; j < n - i - 1; j++)
				// if element at j< than j+1 than swap both
				// comparing the age difference
				if (Math.abs(arr[j] - year) > Math.abs(arr[j + 1] - year)) {
					// swap logic
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		}
	}

}
