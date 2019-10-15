package Nov16;

import java.util.Random;

public class ArrayRandom {
	public static void main(String[] args) {
		int arr[] = randArr(40);
		for (int i : arr)
			System.out.print(i + " ");
	}

	private static int[] randArr(int n) {
		int arr[] = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++)
			arr[i] = r.nextInt(6) + 1;
		return arr;
	}
}
