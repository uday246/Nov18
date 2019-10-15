package Nov14;

public class ArrayPrint {
	public static void main(String[] args) {
		double[] myList = { 1.9, 2.9, 3.4, 4.3, 5.7, 6.1, 7.9, 8.4 };
		double average = 0;
		// Print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}

		// Summing all elements
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.printf("\nTotal is :%.2f" , total);

		average = total / myList.length;
		System.out.printf("\nAverage is : %.2f" , average);

		// Finding the largest element
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
		}
		System.out.println("\nMax is : " + max);
	}
}
