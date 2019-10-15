package Nov10;

import java.util.ArrayList;
import java.util.Collections;

class GradeList {
	ArrayList<Integer> list;

	public GradeList() {
		super();
		list = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getList() {
		return list;
	}

	public void addGrade(int g) {
		list.add(g);
	}

	public void printGrades() {
		for (int i : list) {
			System.out.print(i + " ");
		}
	}

	public void sortGrades() {
		Collections.sort(list);
	}

	public int findMaxGrade() {
		int max = -1;
		for (int i : list) {
			if (max < i)
				max = i;
		}
		return max;
	}

	public boolean removeGrades(int g) {
		if (list.remove(new Integer(g)))
			removeGrades(g);
		return true;
	}
}

public class TestGradeList {
	public static void main(String[] args) {
		GradeList gl = new GradeList();
		gl.addGrade(10);
		gl.addGrade(9);
		gl.addGrade(10);
		gl.addGrade(11);
		gl.addGrade(12);
		gl.addGrade(10);
		gl.addGrade(21);
		System.out.println("Grades : ");
		gl.printGrades();
		gl.sortGrades();
		System.out.println("\nGrades : ");
		gl.printGrades();

		gl.removeGrades(10);
		System.out.println("\nGrades : ");
		gl.printGrades();

	}
}
