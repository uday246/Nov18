package Nov7;

import java.util.Scanner;

public class PrintGrades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter class size");
		int n = sc.nextInt();
		int grades[] = new int[n];
		int g = 0;
		System.out.println("Enter " + n + " grades");
		for (int i = 0; i < n;) {
			g = sc.nextInt();
			if (g >= 0 && g <= 100) {
				grades[i++] = g;
			}
		}
		displayGrades(grades);
	}

	private static void displayGrades(int[] aGrades) {
		for (int i = 0; i < aGrades.length; i++) {
			System.out.println("Student " + i + " score is " + aGrades[i] + " and grade is " + getGrade(aGrades[i]));
		}
	}

	private static String getGrade(int g) {
		if (g >= 90)
			return "A";
		if (g >= 80)
			return "B";
		if (g >= 70)
			return "C";
		if (g >= 60)
			return "D";

		return "F";
	}
}
