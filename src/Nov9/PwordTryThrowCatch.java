package Nov9;

import java.util.Scanner;

class PasswordNotAccepted extends Exception {
	private String msg;

	public PasswordNotAccepted(String s) {
		msg = s;
	}

	public String toString() {
		return msg;
	}
}

public class PwordTryThrowCatch {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String pword;

		System.out.println(
				"Enter a password containing 8 characters, " + "1 numeric digit, 1 upper case character, 1 lower "
						+ "case character, and 1 special character (!@#$%&*:;).");
		pword = scnr.nextLine();

		try {
			checkLength(pword);
			checkUpperCase(pword);
			checkLowerCase(pword);
			checkSpecialCharacter(pword);
			System.out.println("Valid password");
		}

		catch (PasswordNotAccepted e) {
			System.out.println(e);
		}

	}

	public static void checkLength(String pword) throws PasswordNotAccepted {

		if (pword.length() < 8)
			throw new PasswordNotAccepted("Length must be greater than 8");

	}

	public static void checkUpperCase(String pword) throws PasswordNotAccepted {
		boolean flag = false;
		for (int i = 0; i < pword.length(); i++) {
			if (Character.isUpperCase(pword.charAt(i))) {
				flag = true;
				break;
			}
		}
		if (flag == false)
			throw new PasswordNotAccepted("Password should contain atleast 1 uppercase letter");

	}

	public static void checkLowerCase(String pword) throws PasswordNotAccepted {

		boolean flag = false;
		for (int i = 0; i < pword.length(); i++) {
			if (Character.isLowerCase(pword.charAt(i))) {
				flag = true;
				break;
			}
		}
		if (flag == false)
			throw new PasswordNotAccepted("Password should contain atleast 1 lowercase letter");

	}

	public static void checkSpecialCharacter(String pword) throws PasswordNotAccepted {

		String temp = "(!@#$%&*:;).";
		boolean flag = false;
		for (int i = 0; i < pword.length(); i++) {
			if (temp.contains(pword.charAt(i) + "")) {
				flag = true;
				break;
			}
		}
		if (flag == false)
			throw new PasswordNotAccepted("Password should contain atleast 1 special (!@#$%&*:;). char letter");

	}

}
