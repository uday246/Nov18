package Nov8;

import java.util.Scanner;

public class BeautyString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = "";
		String max = "";
		int maxB = -1;
		while (!str.equalsIgnoreCase("Q")) {
			System.out.println("Enter String or Q to Quit");
			str = sc.nextLine();
			int sum = 0;
			String temp = str.toUpperCase();
			for (int i = 0; i < str.length(); i++) {
				if(Character.isAlphabetic(temp.charAt(i)))
				sum = sum + temp.charAt(i) - 64;
			}
			if (maxB < sum) {
				maxB = sum;
				max = str;
			}
		}
		System.out.println("Most Beauty String : " + max);
		System.out.println("Beauty : " + maxB);
	}
}
