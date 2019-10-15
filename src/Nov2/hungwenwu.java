package Nov2;

import java.util.Random;
import java.util.Scanner;

public class hungwenwu

{
	public int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x) {
				return mid;
			}

			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

	void bubbleSort(int arr[])

	{

		int n = arr.length;

		for (int i = 0; i < n - 1; i++)

			for (int j = 0; j < n - i - 1; j++)

				if (arr[j] > arr[j + 1])

				{

					int temp = arr[j];

					arr[j] = arr[j + 1];

					arr[j + 1] = temp;

				}

	}

	void printArray(int arr[])

	{

		int n = arr.length;

		for (int i = 0; i < n; ++i)

			System.out.print(arr[i] + " ");

		System.out.println();

	}

	public static void main(String args[])

	{

		try

		{

			Scanner scan = new Scanner(System.in);

			System.out.println("Enter minimum random number:");

			int min = scan.nextInt();

			System.out.println("Enter maximum random number:");

			int max = scan.nextInt();

			System.out.println("Enter total number of random numbers to be sorted:");

			int totalRandomNumber = scan.nextInt();

			int arr[] = new int[totalRandomNumber];

			System.out.println("Do you want to print sorted and unsorted array? ('Y' OR 'N')");

			char isPrintArray = scan.next().charAt(0);

			hungwenwu ob = new hungwenwu();
			if (totalRandomNumber > 0)

			{

				Random random = new Random();

				for (int i = 0; i < totalRandomNumber; i++)

				{

					arr[i] = random.nextInt(max - min + 1) + min;

				}

				if (isPrintArray == 'Y' || isPrintArray == 'y')

				{

					System.out.println("Unsorted array:");

					ob.printArray(arr);

				}

				ob.bubbleSort(arr);

				if (isPrintArray == 'Y' || isPrintArray == 'y')

				{

					System.out.println("Sorted array");

					ob.printArray(arr);

				}

			}

			else

			{

				System.out.println("Invalid input.");

			}
			System.out.println("Enter element to find");
			int num = scan.nextInt();
			int n = ob.binarySearch(arr, 0, arr.length - 1, num);
			if (n != -1)
				System.out.println(num + " located at " + (n+1));
			else
				System.out.println(num + " does not exist");

		}

		catch (Exception e)

		{

			e.printStackTrace();

		}

	}

}
