package Nov2;

import java.util.Scanner;

public class AverageGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade = "";
		int count = 0;
		double sum = 0;
		while (true) {
			System.out.println("Enter grade  (Q to quit)");
			grade = sc.nextLine();
			if (grade.equalsIgnoreCase("Q"))
				break;
			count++;
			sum += getValue(grade);
		}
		System.out.printf("Average GPA is %.2f: ",(sum/count));
	}

	private static double getValue(String line) {
		line=line.toUpperCase();
		double gpa = 0;
		if (line.equals("A+"))
			gpa = 4.35;
		if (line.equals("A"))
			gpa = 4;
		if (line.equals("A-"))
			gpa = 3.65;
		if (line.equals("B+"))
			gpa = 3.35;
		if (line.equals("B"))
			gpa = 3;
		if (line.equals("B-"))
			gpa = 2.65;
		if (line.equals("C+"))
			gpa = 2.35;
		if (line.equals("C"))
			gpa = 2;
		if (line.equals("C-"))
			gpa = 1.65;
		if (line.equals("D+"))
			gpa = 1.35;
		if (line.equals("D"))
			gpa = 1;
		if (line.equals("D-"))
			gpa = .65;

		if (line.equals("F"))
			gpa = 0;
		return gpa;
	}
}
