package Nov14;

public class FindSmallestInArray {
	// method to find smallest element in array in given range
	// TODO: Add the findSmallestInArray() method. And add Javadoc for it.
	public static int findSmallestInArray(double[] a, int one, int two) {
		//assuming 1st element as small element and compare with others
		double min = a[one];
		int index = 0;
		for (int i = one; i < two; i++) {
			if (min > a[i]) {
				min = a[i];
				index = i;
			}
		}
		return index;
	}

	/**
	 * Main method to provide test input to findSmallestInArray().
	 * 
	 * @param args
	 *            ignored.
	 */
	public static void main(String[] args) {
		double[] array1 = { 5.5, 4.4, 3.3, 2.2, 1.1 };
		int index1 = findSmallestInArray(array1, 1, 4);
		System.out.println("Index = " + index1); // Expect 3

		double[] array2 = { 3.14, 1.59, 2.65, 3.58, 9.79, 3.23 };
		int index2 = findSmallestInArray(array2, 0, 3); // Expect 1.
		System.out.println("Index = " + index2);
	}
}