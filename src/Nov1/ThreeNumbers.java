package Nov1;

import java.util.Scanner;

public class ThreeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// reading three numbers from user
		System.out.println("Enter three numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		// checking if n1 is small and
		if (n1 < n2 && n1 < n3 && n2 < n3)
			System.out.println(n1 + " " + n2 + " " + n3);
		else if (n1 < n2 && n1 < n3 && n2 > n3)
			System.out.println(n1 + " " + n3 + " " + n2);
		// checking if n2 is small
		else if (n2 < n1 && n2 < n3 && n1 < n3)
			System.out.println(n2 + " " + n1 + " " + n3);
		else if (n2 < n1 && n2 < n3 && n1 > n3)
			System.out.println(n2 + " " + n3 + " " + n1);
		// checking if n3 is small
		else if (n3 < n1 && n3 < n2 && n1 < n2)
			System.out.println(n3 + " " + n1 + " " + n2);
		else if (n3 < n1 && n3 < n2 && n1 > n2)
			System.out.println(n3 + " " + n2 + " " + n1);

	}
}
