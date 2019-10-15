package Nov12;

import java.util.Scanner;

public class Pharse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println("Enter pharse: ");
		String str = sc.next();
		//iterating the pharse and adding the given number
		for (int i = 0; i < str.length(); i++)
			System.out.println((char)(str.charAt(i) + n));
	}
}
