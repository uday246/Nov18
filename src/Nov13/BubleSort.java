package Nov13;

public class BubleSort extends Thread {
	public synchronized void run(){
		
	}
	public static void bubbleSort(int arr[], int n) {
		int i, j, temp;
		// outer loop to travel through the all elements
		for (i = 0; i < n - 1; i++) {
			// inner loop to compare the outer loop elements
			if(i==3)
				printArray(arr);
			for (j = 0; j < n - i - 1; j++)
				// if element at j< than j+1 than swap both
				if (arr[j] > arr[j + 1]) {
					// swap logic
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			printArray(arr);
		}
		
	}

	private static void printArray(int[] aArr) {
		for(int i=0;i<aArr.length;i++)
			System.out.print(aArr[i]+",");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]={25,36,24,29,12,37};
		System.out.println("Before Sort");
		
		printArray(arr);
		bubbleSort(arr, arr.length);
		System.out.println("After Sort: ");
		printArray(arr);
		
	}
}
