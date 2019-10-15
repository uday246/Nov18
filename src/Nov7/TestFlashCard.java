package Nov7;

class FlashCard {

	private String question;
	private String answer;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String aQuestion) {
		question = aQuestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String aAnswer) {
		answer = aAnswer;
	}

	@Override
	public String toString() {
		return "Question : " + question + ",\nAnswer : " + answer;
	}

	public FlashCard(String aQuestion, String aAnswer) {
		super();
		question = aQuestion;
		answer = aAnswer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlashCard other = (FlashCard) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		return true;
	}

}

public class TestFlashCard {
	public static void main(String[] args) {
		FlashCard c[] = new FlashCard[3];
		c[0] = new FlashCard("Data type to stores int value", "Integer");
		c[1] = new FlashCard("Method to find length of string", "length()");
		c[2] = new FlashCard("how to find length of array", "using length variable");
		for (int i = 0; i < 3; i++)
			System.out.println(c[i]);

	}
}
