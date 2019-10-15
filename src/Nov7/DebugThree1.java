package Nov7;

public class DebugThree1 {
	public static void main(String args[]) {
		// created variable with value 50
		double myCheck = 50.00;
		// created variable with value 19.95
		double yourCheck = 19.95;
		System.out.println("Tips are");
		// calling tips method by passing myCheck
		calcTip(myCheck);
		// calling tips method by passing yourCheck
		calcTip(yourCheck);
	}

	// calcTips method calcualte tip based on bill
	public static void calcTip(double bill) {
		// declared tip rate in double variable
		final double RATE = 0.15;
		// calulating tip
		int tip = (int) (bill * RATE);
		// printing tip
		System.out.println("The tip should be at least " + tip);
	}
}
