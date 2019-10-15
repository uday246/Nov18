package Nov8;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		String answers[] = { "A", "D", "B", "B", "C", "B", "A", "B", "C", "D", "A", "C", "D", "B", "D", "C", "C", "A",
				"D", "B" };

		String users[] = new String[20];
		readResponse(users);
		int score = 0;
		int wrongAnswers[]=new int[20];
		int wrongCount=0;
		for (int i = 0; i < 20; i++) {
			if (answers[i].equalsIgnoreCase(users[i])) {
				score++;
			} else {
				wrongAnswers[wrongCount++]=i+1;
			}
		}
		System.out.println("Your Score : " + score);
		if (score >= 15)
			System.out.println("You Passed...!!!");
		else
			System.out.println("You Failed");
		System.out.println("Total Correct Answers : " + score);
		System.out.println("Total Worng Answers : " + wrongCount);
		System.out.println("Incorrectly Answered Questions : ");
		for(int i:wrongAnswers)
			System.out.print(i+" ");
	}

	private static void readResponse(String[] aUsers) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your answers");
		for (int i = 0; i < aUsers.length;) {
			aUsers[i] = sc.nextLine().toUpperCase();
			if(!(aUsers[i].charAt(0)>='A' && aUsers[i].charAt(0)<='D')){
				System.out.println("Invalid Input. Valid answers A B C D");
			}
			else{
				i++;
			}
		}
	}
}
