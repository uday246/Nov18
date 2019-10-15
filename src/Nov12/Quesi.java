package Nov12;


class Question2 {

	private int a;

	protected int b;

	public int c;

	public Question2() {

		a = 1;
		b = 1;
		c = 1;

		System.out.println(toString());
	}

	public Question2(int p, int q, int r) {

		a = p;
		b = q;
		c = r;

		System.out.println(toString());
	}

	public String toString() {

		return ("*** " + a + " " + b + " " + c);
	}
}

class Exam2 extends Question2 {

	private int d;

	public Exam2() {

		super(2, 3, 4);

		System.out.println(toString() + " " + d);
	}

	public Exam2(int m, int n, int o, int p) {

		super(m, n, o);

		d = p;

		System.out.println(toString() + " " + d);

		// statement 1

	}
}

public class Quesi {

	public static void main(String[] args) {

		Question2 q2;

		Exam2 e2;

		q2 = new Question2();

		q2 = new Question2(6, 7, 8);

		e2 = new Exam2();

		e2 = new Exam2(6, 7, 8, 9);
	}
}
