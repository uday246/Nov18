package Nov9;

import java.util.Scanner;

class GradeException extends Exception {
}

public class TestGrade {
	public static void main(String args[]) throws Exception {
		Scanner input = new Scanner(System.in);
		int[] ids = { 1234, 1245, 1267, 1278, 2345, 1256, 3456, 3478, 4567, 5678 };
		char[] grades = new char[10];
		String gradeString = new String("ABCDFI");
		final int HIGHLIMIT = 100;
		String inString, outString="";
		int flag = 0;
		for (int x = 0; x < ids.length; ++x) {
			System.out.println("Enter letter grade for student id number: " + ids[x]);
			inString = input.next().toUpperCase();
			grades[x] = inString.charAt(0);
			if (!gradeString.contains(grades[x] + "")) {
				try {
					throw new GradeException();
				} catch (GradeException e) {
					System.out.println("Invalid grade");
					grades[x] = 'I';
				}
			}
			// Write your code here
		}
		for (int x = 0; x < ids.length; ++x)
			outString = outString + "ID #" + ids[x] + " Grade " + grades[x] + "\n";
		System.out.println(outString);
	}
}
