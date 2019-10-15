package Nov8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	private double avg;

	public double getAvg() {
		return avg;
	}

	public void setAvg(double aAvg) {
		avg = aAvg;
	}

	public Student(String aName, int aSub1, int aSub2, int aSub3) {
		super();
		name = aName;
		sub1 = aSub1;
		sub2 = aSub2;
		sub3 = aSub3;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int aSub1) {
		sub1 = aSub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int aSub2) {
		sub2 = aSub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int aSub3) {
		sub3 = aSub3;
	}

}

public class StudentsInfo {
	public static void main(String[] args) throws Exception {
		ArrayList<Student> list = readData();
		display(list);
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				Double d1 = s1.getAvg();
				Double d2 = s2.getAvg();
				return -1* d1.compareTo(d2);
			}
		});
		System.out.println("To 3 Students by Avg");
		System.out.println(list.get(0).getName() + " : " + list.get(0).getAvg());
		System.out.println(list.get(1).getName() + " : " + list.get(1).getAvg());
		System.out.println(list.get(2).getName() + " : " + list.get(2).getAvg());

	}

	private static void display(ArrayList<Student> list) {
		System.out.println("Students List : ");
		for (Student s : list) {
			System.out.println(s.getName() + " : " + s.getAvg());
		}		
	}

	private static ArrayList<Student> readData() throws Exception {
		ArrayList<Student> list = new ArrayList<Student>();
		BufferedReader br = new BufferedReader(new FileReader("roster.txt"));
		String line = br.readLine();
		while (line != null) {
			String arr[] = line.split(" ");
			int m1 = Integer.parseInt(arr[1]);
			int m2 = Integer.parseInt(arr[2]);
			int m3 = Integer.parseInt(arr[3]);
			Student s = new Student(arr[0], m1, m2, m3);
			double avg = (s.getSub1() + s.getSub2() + s.getSub3()) / 3;
			s.setAvg(avg);
			list.add(s);
			line = br.readLine();
		}
		return list;
	}
}
