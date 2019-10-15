package Nov9;

public class Student {

	private String name;
	private String ssn;
	private double gpa;

	public Student() {

	}

	public Student(String name, String ssn, double gpa) {
		setName(name);
		setSsn(ssn);
		setGpa(gpa);
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public double getGpa() {
		return gpa;
	}

	public void setName(String name) {
		if (name.length() < 2)
			name = null;
		else if (name.length() > 50)
			name = name.substring(0, 50);

		this.name = name;
	}

	public void setSsn(String ssn) {
		if (ssn.length() == 11 && ssn.charAt(3) == '-' && ssn.charAt(6) == '-') {
			this.ssn = ssn;
		} else {
			this.ssn = "000-00-0000";
		}
	}

	public void setGpa(double gpa) {
		if (gpa < 0 || gpa > 4)
			gpa = 0;

		this.gpa = gpa;
	}

	public String toString() {
		return String.format("%s:%30s%3dcr", name, ssn, gpa);
	}

}