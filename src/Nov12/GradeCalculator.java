package Nov12;

import java.io.File;
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(new File("Grades.txt"));
		double g = 0;
		double min = 200;
		double max = -1;
		double sum = 0;
		int count = 0;

		while (sc.hasNextLine()) {
			g = sc.nextDouble();
			sum += g;
			count++;
			if (max < g)
				max = g;
			if (min > g)
				min = g;

		}
		sum = sum / count;
		System.out.println("Class Grade : " + getLetterGrade(sum));
		System.out.println("Class minimum : " + getLetterGrade(min));
		System.out.println("Class maximum : " + getLetterGrade(max));

	}

	public static String getLetterGrade(double avg) {
		if (avg >= 93)
			return "A";
		if (avg >= 90)
			return "A-";

		if (avg >= 87)
			return "B+";
		if (avg >= 83)
			return "B";
		if (avg >= 80)
			return "B-";

		if (avg >= 77)
			return "C+";
		if (avg >= 73)
			return "C";
		if (avg >= 70)
			return "C-";

		if (avg >= 67)
			return "D+";
		if (avg >= 64)
			return "D";

		return "F";
	}

}
