package Nov9;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int a[] = new int[num];
		int b[] = new int[num];
		int c[] = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = i;
			b[i] = i + 1;
			c[i] = b[i] + a[i];
			System.out.print(c[i] + " ");
		}

	}
}
