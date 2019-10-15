package Nov15;

import java.util.ArrayList;
import java.util.Scanner;

public class P3A2_BRANDT_4005916

{

	public static void main(String[] args)

	{

		String name;

		String answer;

		Scanner phantom = new Scanner(System.in);

		System.out.println("Hello, What is your name?");

		name = phantom.nextLine();

		System.out.println("Welcome " + name + "!\n");

		System.out.println("My name is Danielle Brandt. "

				+ "This is a quiz program that will test your JAVA knowledge"

				+ "with multiple choice questions!\n\n");

		System.out.println("Lets start the quiz!\n\n");

		ArrayList<String> questions = new ArrayList<String>();
		questions.add("Which of the following is considered an input device?\n"

				+ "(a)Speakers\n(b)Printer\n(c)Central Processing Unit\n(d)Keyboard");
		questions.add("What variable is Legal in Java?\n"

+ "(a)dayOfWeek\n(b)3dGraph\n(c)mixture#3\n(d)week day\n");
		ArrayList<String> answers = new ArrayList<String>();
		answers.add("d");
		answers.add("a");
		int correct = 0, incorrect = 0;
		for (int i = 0; i < questions.size(); i++) {
			System.out.println(questions.get(i));
			String ans = answers.get(i);
			String user = phantom.nextLine();
			if (user.equalsIgnoreCase(ans)) {
				System.out.println("This is correct");
				correct++;
			} else {
				System.out.println("This is not correct");
				incorrect++;
			}

		}
		System.out.println("Total Correct : "+correct);
		System.out.println("Total Incorrect :"+incorrect);
	}

}
