
import java.util.Scanner;

public class Q3 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter The Phone Number (In Letters): ");
		while (!input.hasNext("[A-Za-z]+")) {
			System.out.println("Please enter only alphabets.");
			return;
		}
		String initial_phone_number = input.nextLine();
		initial_phone_number = initial_phone_number.toUpperCase();
		String phone_number_final = full_number(initial_phone_number);
		System.out.printf("%nOutput phone number for '%s' is '%s'", initial_phone_number, phone_number_final);
	}

	public static String full_number(String initial_phone_number) {
		String number = "";
		int strLen = initial_phone_number.length();
		for (int currCharacter = 0; currCharacter < strLen; currCharacter++) {
			char ch = initial_phone_number.charAt(currCharacter);
			if (Character.isLetter(ch)) {
				switch (ch) {
				case 'A':
				case 'B':
				case 'C':
					number += 2;
					break;
				case 'D':
				case 'E':
				case 'F':
					number += 3;
					break;
				case 'G':
				case 'H':
				case 'I':
					number += 4;
					break;
				case 'J':
				case 'K':
				case 'L':
					number += 5;
					break;
				case 'M':
				case 'N':
				case 'O':
					number += 6;
					break;
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
					number += 7;
					break;
				case 'T':
				case 'U':
				case 'V':
					number += 8;
					break;
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					number += 9;
					break;
				}
			} else if (Character.isDigit(ch)) {
				number += Character.getNumericValue(ch);
			}
			if (number.length() == 3) {
				number += "-";
			}
			if (number.length() >= 8) {
				break;
			}
		}
		return number;
	}
}
