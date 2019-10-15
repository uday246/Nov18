package Nov16;

import java.util.Scanner;

public class CourseEnroll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// reading names
		int[] b = new int[5];
		int[] c = b;
		c[1] = 3;
		System.out.println(c[1]);
		System.out.println("Please enter your first name");
		String firstName = sc.nextLine();
		System.out.println("Please enter your last name");
		String lastName = sc.nextLine();
		// checking for empty strings
		if (firstName.isEmpty() || lastName.isEmpty()) {
			System.out.println("Sorry, you have to enter your name to enroll into CIS 226.");
		} else {
			System.out.println("Hello, " + firstName + " " + lastName);
			System.out.println("Welcome to CIS 226");
		}
	}
}
