package Nov2;

import java.util.Random;

public class Employee {
	private int id;
	private String name="";
	private int dept;
	private int year;

	Random r = new Random();
	public Employee() {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		int y[] = { 2008, 2009, 2010, 2011, 2012, 2012, 2013, 2014, 2015, 2016, 2017, 2018 };
		id = r.nextInt(99999999);
		int l = r.nextInt() % 6 + 5;
		for (int i = 0; i < l; i++)
			name += letters.charAt(r.nextInt(26));
		dept = r.nextInt(4) + 1;
		year = y[r.nextInt(10)];
	}

	public int getId() {
		return id;
	}

	public void setId(int aId) {
		id = aId;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int aDept) {
		dept = aDept;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int aYear) {
		year = aYear;
	}

	public Random getR() {
		return r;
	}

	public void setR(Random aR) {
		r = aR;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", year=" + year +"]";
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e);
	}
}
