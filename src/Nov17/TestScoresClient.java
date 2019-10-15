package Nov17;

class TestScores {
	// array to store scores
	private int scores[];

	// constructor to assign array
	public TestScores(int arr[]) {
		scores = arr;
	}
	// method returns the avg of scores
	public double getAvg() {
		double sum = 0;
		// iterating through the array
		for (int i = 0; i < scores.length; i++) {
			// if score is invalid throwing exception
			if (scores[i] < 0 || scores[i] > 100)
				throw new InvalidTestScore("Scores must in range 0-100");
			// if it is valid adding
			sum += scores[i];
		}
		// returns avg
		return sum / scores.length;
	}

}



public class TestScoresClient {
	public static void main(String[] args) {
			// sample array to test
			int scores[]={98,76,-34,65,66,98};
			// creating object with array
			TestScores t = new TestScores(scores);
			System.out.println("Avg : "+t.getAvg());
	}
}

// creating InvalidTestScore custom exception
class InvalidTestScore extends IllegalArgumentException {
	// variable to hold message 
	private String msg;

	public InvalidTestScore(String aMsg) {
		super(aMsg);
		msg = aMsg;
	}

}