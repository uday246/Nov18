package Nov16;

public class NotAClass {
	public int letter;

	public static void main(String[] args) {
		Object [] breakfast = new Object[]{"Ontario", "Quebec"};
		Unrelated lunch = new Unrelated();
		System.out.print(((Unrelated)lunch).nameOfMethod());
	}
}

class AlsoNotAClass {
	int x;
	int y;

	public AlsoNotAClass(int x, int y) {
		x = x;
		y = y;
	}
}

class Unrelated extends AlsoNotAClass {
	public Unrelated() {
		super(0,0);
	}

	public boolean nameOfMethod() {
		int april = (int) (Math.random() * 100);
		if (april < 50) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return true;

		}
		return false;
	}
}
