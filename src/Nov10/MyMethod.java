package Nov10;

import java.util.Scanner;

public class MyMethod {
	public static void main(String[] args) {
		int noOfScore = 3;
		MyMethod m = new MyMethod();
		String name = m.getName();
		double avg = m.getAvg(noOfScore);
		char letterGrade = m.getGrade(avg);
		System.out.println(name + " avg of 3 score is " + avg + " and " + letterGrade);
	}

	public double getAvg(int n) {
		double score = 0;
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Enter score " + (i + 1) + " : ");
			score += keyboard.nextDouble();
		}
		return (score / n);
	}

	public String getName() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Student name");
		String name = keyboard.nextLine();
		return name;
	}

	public char getGrade(double avg) {
		char letterGrade;
		if (avg > 89)
			letterGrade = 'A';
		else if (avg > 79)
			letterGrade = 'B';
		else if (avg > 69)
			letterGrade = 'C';
		else if (avg > 59)
			letterGrade = 'D';
		else
			letterGrade = 'F';
		return letterGrade;

	}
}
