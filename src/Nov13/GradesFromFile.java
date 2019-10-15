package Nov13;

import java.io.BufferedReader;
import java.io.FileReader;

public class GradesFromFile {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("Grades.txt"));
		String line = br.readLine();
		int count=Integer.parseInt(line.trim());
		double totlaSum = 0;
		int number=0;
		double sum = 0;
		while (line != null) {
			sum = 0;
			number++;
			line=br.readLine();
			if(line==null)
				break;
			String arr[] = line.split(" ");
			for (int i = 1; i < arr.length; i++)
				sum = sum + Double.parseDouble(arr[i].trim());
			totlaSum+=sum;
			System.out.printf(arr[0] + " %.1f " + getLetterGrade(sum, arr.length - 1)+"\n", sum / (arr.length - 1));
		}
		number--;
		number*=count;
		System.out.printf("Class Average : %.1f",(totlaSum/number));
	}

	private static String getLetterGrade(double aSum, int aI) {
		double avg = aSum / aI;
		if (avg >= 90)
			return "A";
		if (avg >= 80)
			return "B";
		if (avg >= 70)
			return "C";
		if (avg >= 60)
			return "D";

		return "F";

	}
}
