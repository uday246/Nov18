package Nov12;

import java.util.ArrayList;
import java.util.List;

public class TestIndexes {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(2);
		l.add(3);
		l.add(12);
		l.add(15);
		System.out.println(testRange(l, 1, 3));
	}

	private static boolean testRange(List aL, int aI, int aI2) {
		return aL.get(aI).equals(aL.get(aI2));
	}
}
