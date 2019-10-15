package Prmr;

import java.util.Scanner; // Needed for the Scanner class

import java.util.Random; // Needed for the Random class

/**
 * 
 * 5 This program demonstrates the Random class.
 * 
 * 6
 */

public class MathTutor

{

	public static void main(String[] args)

	{

		int number1; // A number

		int number2; // Another number

		int sum; // The sum of the numbers

		int userAnswer; // The user's answer

		// Create a Scanner object for keyboard input.

		Scanner keyboard = new Scanner(System.in);

		// Create a Random class object.

		Random randomNumbers = new Random();

		// Get two random numbers.

		number1 = randomNumbers.nextInt(100);

		number2 = randomNumbers.nextInt(100);

		// Display an addition problem.
		userAnswer = showQuestion(number1, number2);
		// Calculate the answer.

		sum = getSum(number1, number2);

		// Display the user's results.

		result(userAnswer, sum);

	}

	private static int getSum(int aNumber1, int aNumber2) {
		return aNumber1 + aNumber2;
	}

	public static int showQuestion(int number1, int number2) {
		System.out.println("What is the answer to the " +

				"following problem?");

		System.out.print(number1 + " + " +

				number2 + " = ? ");
		// Get the user's answer.
		Scanner sc = new Scanner(System.in);

		int userAnswer = sc.nextInt();
		return userAnswer;
	}

	public static void result(int userAnswer, int sum) {
		if (userAnswer == sum)

			System.out.println("Correct!");

		else

		{

			System.out.println("Sorry, wrong answer. " +

					"The correct answer is " +

					sum);

		}
	}
}