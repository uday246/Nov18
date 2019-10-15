package Nov10;

class SquareRootArgumentException extends IllegalArgumentException {
	public SquareRootArgumentException() {
	}

	public SquareRootArgumentException(String msg) {
		super(msg);
	}

}

public class SquareRooter {
	public static void main(String[] args) {
		try {
			System.out.println("sqr root of 4 is " + sqrRoot(4));
			System.out.println("sqr root of -1 is " + sqrRoot(-1));

		} catch (SquareRootArgumentException e) {
			e.printStackTrace();
		}
	}

	private static double sqrRoot(int a) {
		if (a <= 0)
			throw new SquareRootArgumentException("cannot calculate square root of negatives");
		return Math.sqrt(a);
	}
}
