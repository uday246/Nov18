package Nov17;

import java.util.Scanner;


public class QuizTime_BDS {
	public static void main(String[] args) {
		Quiz_BDS quiz = new Quiz_BDS();

		quiz.add("What is 1+2?", "3");
		quiz.add("What is 11*2?", "22");
		quiz.add("What is 9+18?", "27");
		quiz.add("What is 56*8?", "448");
		quiz.add("What is 33-8?", "25");
		quiz.add("What is 70-90?", "-20");
		quiz.add("What is 3090+10?", "3100");
		quiz.add("What is 55*2?", "110");
		quiz.add("What is 20*9?", "180");
		quiz.add("What is 13+25?", "38");
		quiz.giveQuiz();
	}
}

class Question{
	private String question,ans;

	public Question(String aQuestion, String aAns) {
		super();
		question = aQuestion;
		ans = aAns;
	}

	public boolean answerCorrect(String aAnswer) {
		// TODO Auto-generated method stub
		return aAnswer.equalsIgnoreCase(ans);
	}

	public Object getQuestion() {
		return question;
	}
	
	
	
}
class Quiz_BDS {
	// required attributes
	private Question[] questions;
	private int correctAnswers;
	private int incorrectAnswers;
	private int count;

	public Quiz_BDS() {
		questions = new Question[25];
		correctAnswers = 0;
		incorrectAnswers = 0;
		count = 0;

	}

	public void add(String quest, String ans) {

		Question question = new Question(quest, ans);
		if (count < questions.length) {
			questions[count] = question;
			count++;
		}
	}

	public void giveQuiz() {

		Scanner scanner = new Scanner(System.in);
		String answer;
		for (int i = 0; i < count; i++) {
			System.out.printf("Question (%d): %s\n", (i + 1), questions[i].getQuestion());
			answer = scanner.nextLine();
			if (questions[i].answerCorrect(answer)) {
				System.out.println("Right answer!");
				correctAnswers++;
			} else {
				System.out.println("Incorrect answer!");
				incorrectAnswers++;
			}
		}

		System.out.println("Quiz completed!");
		System.out.println("Total questions: " + count);
		System.out.println("Correct answers: " + correctAnswers);
		System.out.println("Incorrect answers: " + incorrectAnswers);
	}

	public int getNumCorrect() {
		return correctAnswers;
	}

	public int getNumIncorrect() {
		return incorrectAnswers;
	}
}
