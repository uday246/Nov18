package Nov2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) throws Exception {
		ArrayList<String> lines = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		try {

			File file = new File("student_grade.txt");
			input = new Scanner(file);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				lines.add(line);
			}
			double avg;
			for (int i = 1; i <= 11; i++) {
				double low = Integer.MAX_VALUE, high = Integer.MIN_VALUE, total = 0;
				for (String line : lines) {
					double data = Double.parseDouble(line.split(" ")[i]);
					if (low > data) {
						low = data;
					}
					if (high < data) {
						high = data;
					}
					total += data;
				}
				System.out.println("The student with low score are : ");
				for (String line : lines) {
					double data = Double.parseDouble(line.split(" ")[i]);
					if (data == low) {
						System.out.println(line.split(" ")[0] + " " + line.split(" ")[i]);
					}
				}
				System.out.println("The student with high score are : ");
				for (String line : lines) {
					double data = Double.parseDouble(line.split(" ")[i]);
					if (data == high) {
						System.out.println(line.split(" ")[0] + " " + line.split(" ")[i]);
					}
				}
				avg = (double) total / lines.size();
				System.out.printf("The average is %.2f: " , avg);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
