package Nov9;

import java.util.Scanner;

public class TempTest {
	public static void main(String[] args) {
		System.out.println(avgTemp());
	}

	private static String avgTemp() {
		double t = 0;
		double sum = 0;
		double count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temparatures");
		while (true) {
			t = sc.nextDouble();
			if (t < 0)
				break;
			count++;
			sum += t;
		}
		double avg = sum / count;
		if (avg < 65)
			return "cold";
		if (avg < 80)
			return "Moderate";

		return "warm";
	}
}
