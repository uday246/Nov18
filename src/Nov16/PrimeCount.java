package Nov16;

public class PrimeCount {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++)
			if (isPrime(i))
				System.out.print(i + " ");
	}

	private static boolean isPrime(int aI) {
		for (int i = 2; i < aI; i++)
			if (aI % i == 0)
				return false;
		return true;
	}
}
