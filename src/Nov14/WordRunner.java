package Nov14;

class WordFun {
	private String word;

	public WordFun() {

	}

	public WordFun(String s) {
		word = s;
	}

	public void setWord(String w) {
		word = w;
	}

	public void makeUpper() {
		word = word.toUpperCase();
	}

	public void addHyphen() {
		word = word.split(" ")[0] + "-" + word.split(" ")[1];
	}

	public String toString() {
		return word;
	}

}

public class WordRunner {
	public static void main(String[] args) {
		WordFun test = new WordFun("Hello World");
		System.out.println(test);
		test.makeUpper();
		System.out.println(test);
		test.addHyphen();
		System.out.println(test);

		test = new WordFun("Good morning");
		System.out.println(test);
		test.makeUpper();
		System.out.println(test);
		test.addHyphen();
		System.out.println(test);

	}
}
