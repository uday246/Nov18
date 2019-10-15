package Nov9;

import java.util.Scanner;

public class DoubleArrays {
	public static void main(String[] args) {
		int s1, s2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter set1 size");
		s1 = sc.nextInt();
		double set1[] = new double[s1];
		System.out.println("Enter " + s1 + " Elements for Set1");
		for (int i = 0; i < s1; i++)
			set1[i] = sc.nextDouble();
		System.out.println("Enter set2 size");
		s2 = sc.nextInt();
		double set2[] = new double[s2];
		System.out.println("Enter " + s2 + " Elements for Set2");
		for (int i = 0; i < s2; i++)
			set2[i] = sc.nextDouble();
		boolean flag = true;
		if (s1 != s2) {
			System.out.println("Both sets are not equal");
			return;
		} else {
			for (int i = 0; i < s1; i++) {
				if (Math.abs(set1[i] - set2[i]) > 0.001) {
					System.out.println("Both sets are not equal");
					flag = false;
					break;
				}
			}
		}
		if (flag)
			System.out.println("Both sets are  equal");

	}
}
