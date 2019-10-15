package Nov14;

import java.util.Scanner;

public class Comparison {
	public static void main(String[] args) {
		String str1;
		String str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		str1 = sc.nextLine().toLowerCase();
		str2 = sc.nextLine().toLowerCase();
		System.out.println("Enter number of chars to compare");
		int n = sc.nextInt();
		System.out.println("Enter the starting position");
		int p = sc.nextInt();
		if (str1.regionMatches(p, str2, p, n))
			System.out.println("the characters are equal");
		else
			System.out.println("the characters not are equal");

	}
}
