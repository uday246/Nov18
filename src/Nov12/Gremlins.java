package Nov12;

public class Gremlins {

	public static void main(String[] args) {

		System.out.println(f2(2, 0));

	}

	public static int f2(int n, int result) {

		if (n == 0)

			return 0;

		else

			return f2(n - 1, n + result);

	}

}
