package Nov20;

public class Number {
	private int sum;

	public Number() {
		sum = 0;
		printCount(2);
	}

	private void printCount(int num) {
		int count = 0;
		int[] numArray = { 0, 1, 1, 2 };
		while (count < numArray.length) {
			sum = sum + numArray[count] + num;
			num++;
			count++;
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		new Number();
	}
}