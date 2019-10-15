package Nov13;

public class SumOfOddNumber {
	public static void main(String[] args) {
		System.out.println("Sum : " + sumIteration(3));
		System.out.println("Sum : " + sumRecursion(3));

	}

	private static int sumRecursion(int aI) {

		return oddSum(1, aI);
	}

	private static int oddSum(int aI, int aI2) {
		if (aI2 == 0)
			return 0;
		return aI + oddSum(aI + 2, aI2 - 1);
	}

	private static int sumIteration(int aI) {
		int sum = 0;
		int count = 0;
		for (int i = 1;; i += 2, count++) {
			if (count == aI)
				break;
			System.out.println(i);
			sum += i;
		}
		return sum;
	}
}
