package Nov2;

public class NumberPrompt {
	public static void main(String[] args) {
		/*Scanner scnr = new Scanner(System.in);
		int userInput;
		do {
			System.out.println("Enter a number (<100): ");
			userInput = scnr.nextInt();
		} while (userInput > 100);
		// Your Code here

		System.out.println("Your number < 100 is: " + userInput);*/
		System.out.println(test(3));
	}

	private static int test(int n) {
		int temp=0;
		if(n<=0)
			temp=0;
		else 
			temp=1+3*test(n-1);
		return temp;
	}
}
