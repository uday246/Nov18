package Nov2;

import java.util.Scanner;

public class CourseCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter course code");
		String str = sc.next();
		boolean flag = false;
		if(str.length()<5)
		{
			System.out.println("Length must be 5 digits");
		}
		if (str.startsWith("i") || str.startsWith("I")) {
			flag = true;
		} else {
			System.out.println("First character is not i or I");
			flag = false;
		}
		
		if (str.charAt(1) == 't' || str.charAt(1) == 'T') {
			if (flag)
				flag = true;
		} else {
			System.out.println("Second character is not t or T");
			flag = false;
		}
		if (Character.isDigit(str.charAt(2))) {
			if (flag)
				flag = true;
		} else {
			System.out.println("Third char is not a digit");
			flag = false;
		}
		if (Character.isDigit(str.charAt(3))) {
			if (flag)
				flag = true;
		} else {
			System.out.println("Fourth char is not a digit");
			flag = false;
		}
		if (Character.isDigit(str.charAt(4))) {
			if (flag)
				flag = true;
		} else {
			System.out.println("Fifth char is not a digit");
			flag = false;
		}

		if (flag) {
			System.out.println(str + " is valid course code");
		}
	}
}
