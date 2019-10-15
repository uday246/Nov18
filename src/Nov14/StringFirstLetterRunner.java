package Nov14;

class StringFirstLetterCheck {
	String wordOne, wordTwo;

	public StringFirstLetterCheck() {

	}

	public StringFirstLetterCheck(String one, String two) {
		wordOne = one;
		wordTwo = two;
	}

	public void setWords(String one, String two) {
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkFirstLetter() {
		return wordOne.charAt(0) == wordTwo.charAt(0);
	}

	public String toString() {
		if (checkFirstLetter()) {
			return wordOne + " does not have the same first letter as " + wordTwo;
		} else {
			return wordOne + "  have the same first letter as " + wordTwo;
		}

	}

}

public class StringFirstLetterRunner {
	public static void main(String[] args) {
		StringFirstLetterCheck sfc = new StringFirstLetterCheck("Hello", "Good");
		System.out.println(sfc);
		sfc = new StringFirstLetterCheck("Hello", "Hi");
		System.out.println(sfc);
	}
}
