package Prmr;

class Employee {
	private String first;
	private String last;
	private String ssn;

	public Employee() {

	}

	public Employee(String aFirst, String aLast, String aSsn) {
		super();
		first = aFirst;
		last = aLast;
		ssn = aSsn;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String aFirst) {
		first = aFirst;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String aLast) {
		last = aLast;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String aSsn) {
		ssn = aSsn;
	}

	@Override
	public String toString() {
		return first + " " + last + " " + ssn;
	}

}

class HourlyEmployee extends Employee {
	private double wage;
	private int hoursWorked;

	public HourlyEmployee(String aFirst, String aLast, String aSsn, double aWage, int aHoursWorked) {
		super(aFirst, aLast, aSsn);
		if(aWage>=0)
			wage = aWage;
		if(aHoursWorked>=0 && aHoursWorked<=160)
			hoursWorked = aHoursWorked;
	}

	public HourlyEmployee() {

	}

	public double getWage() {
		return wage;
	}

	public void setWage(double aWage) {
		if(aWage>=0)
			wage = aWage;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int aHoursWorked) {
		if(aHoursWorked>=0 && aHoursWorked<=160)
			hoursWorked = aHoursWorked;
	}

	@Override
	public String toString() {
		return String.format("hourly employee: %s\n%s: %.1f \n%s: %.2f \n%s: %.2f", super.toString(), "hours",
				getHoursWorked(), "wage", getWage(), "earnings", earnings());
	}

	private double earnings() {
		return getWage() * getHoursWorked();
	}

}

public class Final {
	public static void main(String[] args) {
		Employee e = new Employee("Koti", "Induri", "123");
		System.out.println(e);
		HourlyEmployee he = new HourlyEmployee("Koti", "Induri", "123", 40, 15);
		System.out.println(he);
	}
}
