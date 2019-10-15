package Nov8;

import java.util.Scanner;

public class Validation {

	public static void main(String ar[])

	{

		System.out.println("Validation by me");

		Scanner in = new Scanner(System.in);

		String prompt = "Enter your name";

		int maxLength = 20;

		Validation.getString(in, prompt, maxLength);

		prompt = "Enter your age: ";

		int lower = 0;

		int upper = 80;

		Validation.getInteger(in, prompt, lower, upper);

	}

	public static String getString(Scanner in, String prompt, int maxLength)

	{

		boolean valid = true;

		String s = "";

		System.out.print(prompt);

		System.out.print(" : ");

		do

		{

			s = in.nextLine();

			if (s.length() > 0) // ignore blank lines

			{

				if (s.length() < maxLength)

				{

					valid = true;

				}

				else

				{

					System.out.printf("Minimum length is %d characters. Try again.");

				}

			}

		} while (!valid);

		return s;

	}

	public static int getInteger(Scanner in, String prompt, int lower, int upper)

	{

		boolean valid = false, outOfRange = false;

		int input = -1;

		do

		{

			System.out.print(prompt);

			if (outOfRange)
				System.out.printf(" [between %d and %d inclusive]", lower, upper);

			System.out.print(": ");

			while (in.hasNextInt())

			{

				in.nextDouble();

				System.out.println("Please enter an integer.");

			}

			input = in.nextInt();

			if (input >= 0 && input <= 100)

			{

				valid = true;

			}

			else

			{

				System.out.println("Value is out of range.");

				outOfRange = true;

			}

		} while (!valid);

		return input;

	}

}