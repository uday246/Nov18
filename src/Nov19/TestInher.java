package Nov19;
class Person {
	private String name, address, email, phone;

	public Person() {
	}

	public Person(String nm, String ad, String em, String pn) {
		name = nm;
		address = ad;
		email = em;
		phone = pn;
	}

	public void setName(String nm) {
		name = nm;
	}

	public void setAddress(String ad) {
		address = ad;
	}

	public void setEmail(String em) {
		email = em;
	}

	public void setPhone(String pn) {
		phone = pn;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String toString() {
		return "Name: " + name + "\t\tAddress: " + address + "\t\tEmail: " + email + "\t\tPhone Number: " + phone;
	}
}

class Student extends Person {
	private String ident, major;
	private double gpa, tuition;
	private int credits;

	public Student() {
	}

	public Student(String nm, String id, String ad, String em, String pn, String mj, double g, double tu, int cr) {
		super(nm, ad, em, pn);
		ident = id;
		major = mj;
		credits = cr;
		gpa = g;
		tuition = tu;
	}

	public void setIdent(String id) {
		ident = id;
	}

	public void setID(String mj) {
		major = mj;
	}

	public void setGPA(double g) {
		gpa = g;
	}

	public void setTuition(double tu) {
		tuition = tu;
	}

	public void setCredits(int cr) {
		credits = cr;
	}

	public String getMajor() {
		return major;
	}

	public String getID() {
		return ident;
	}

	public double getGPA() {
		return gpa;
	}

	public double getTuition() {
		return tuition;
	}

	public int getCredits() {
		return credits;
	}

	public String toString() {
		return super.toString() + "\t\tID:" + ident + "\t\tMajor: " + major + "\t\tGPA: " + gpa + "\t\tTuition: "
				+ tuition + "\t\tCredits: " + credits;
	}

}
public class TestInher {
public static void main(String[] args) {
	Student s = new Student("Koti", "123", "Hyd", "koti@123.com", "123", "CSE", 9, 10, 7);
	System.out.println(s);
}
}
