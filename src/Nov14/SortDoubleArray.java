package Nov14;

import java.util.Arrays;

public class SortDoubleArray {
	// TODO: Add your sortDoubleArray() method here.

	public static void sortDoubleArray(double arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			swap(arr, min_idx, i);
		}
	}

	private static void swap(double[] arr, int min_idx, int i) {
		double temp = arr[min_idx];
		arr[min_idx] = arr[i];
		arr[i] = temp;
	}

	/**
	 * Main method to provide test input to swapInArray().
	 * 
	 * @param args
	 *            ignored.
	 */
	public static void main(String[] args) {
		double[] array1 = { 5.5, 4.4, 3.3, 2.2, 1.1 };
		System.out.println(Arrays.toString(array1));
		sortDoubleArray(array1);
		System.out.println(Arrays.toString(array1));

		double[] array2 = { 3.14, 1.59, 2.65, 3.58, 9.79, 3.23 };
		System.out.println(Arrays.toString(array2));
		sortDoubleArray(array2);
		System.out.println(Arrays.toString(array2));
	}
}
