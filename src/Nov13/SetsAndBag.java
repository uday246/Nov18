package Nov13;

import java.util.*;

public class SetsAndBag {

	public static void main(String[] args) {

		partA();

		partB();

		partC();

	}

	public static void partA() {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");

		int n = in.nextInt();

		Set sets = new TreeSet();

		for (int i = 1; i <= n; i++) {

			if (n % i == 0)

				sets.add(i);

		}

		System.out.println("The factors of " + n + " are: " + sets);

	}

	public static void partB() {

		Scanner in = new Scanner(System.in);

		System.out.print("\nEnter a number: ");

		int n = in.nextInt();

		int t = n;

		Bag bags = new Bag();

		int f = 2;

		bags.add(1);

		while (t > 1) {

			if (t % f == 0) {

				bags.add(f);

				t = t / f;

			}

			else

				f++;

		}

		System.out.println("The prime factors of " + n + " are: " + bags());

	}

	private static String bags() {

		// TODO Auto-generated method stub

		return null;

	}

	public static void partC() {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter first number: ");

		int n1 = in.nextInt();

		System.out.print("Enter second number: ");

		int n2 = in.nextInt();

		int g = gcd(n1, n2);

		int l = lcm(n1, n2);

		System.out.println("The GCD is " + g);

		System.out.println("The LCM is " + l);

	}

	public static int gcd(int a, int b) {

		if (a == 0 || b == 0)

			return 0;

		if (a == b)

			return a;

		if (a > b)

			return gcd(a - b, b);

		return gcd(a, b - a);

	}

	public static int lcm(int n1, int n2) {

		int lcm = (n1 > n2) ? n1 : n2;

		while (true)

		{

			if (lcm % n1 == 0 && lcm % n2 == 0)

			{

				break;

			}

			++lcm;

		}

		return lcm;

	}

}
