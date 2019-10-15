package Nov10;

class Person {
	private String name;

	public Person() {
		this("No name yet");
		// can also say this("No name yet"); // calls the other constructor
	}

	public Person(String initialName) {
		name = initialName;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void writeOutput() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Name: " + name;
	}

	public boolean hasSameName(Person otherPerson) {
		return this.name.equalsIgnoreCase(otherPerson.name);
	}
}

public class Doctor extends Person {
	/* declare the officeFee and specialty instance variables here */
	private double officeFee;
	private String specialty;

	/*
	 * write the no parameter and three parameter constructors here; reuse
	 * Person's constructors via super() calls
	 */

	public double getOfficeFee() {
		return officeFee;
	}

	public void setOfficeFee(double aOfficeFee) {
		officeFee = aOfficeFee;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String aSpecialty) {
		specialty = aSpecialty;
	}

	public Doctor() {
		specialty="None";
	}

	public Doctor(String aInitialName, double aOfficeFee, String aSpecialty) {
		super(aInitialName);
		officeFee = aOfficeFee;
		specialty = aSpecialty;
	}

	/* write getters and setters for officeFee and specialty here */

	@Override
	public String toString() {
		return "name :" + getName() + ", office fee:" + officeFee + ", specialty:" + specialty;
	}

	public boolean equals(Doctor otherDoctor) // you can also use parameter
												// Object other
	{
		return this.getName().equals(otherDoctor.getName()) && this.officeFee == otherDoctor.officeFee
				&& this.specialty.equals(otherDoctor.specialty);

	}

	public static void main(String[] args) {
		/* DO NOT MODIFY THIS MAIN METHOD */

		Doctor drNo = new Doctor();
		System.out.println("Using default constructor:");
		System.out.println();
		System.out.println("Verify:");
		System.out.println("No name yet.");
		System.out.println("$150");
		System.out.println("None given");
		System.out.println();
		System.out.println(drNo);
		System.out.println();
		System.out.println("===============================");

		System.out.println("Constructor with name, office fee, and specialty:");
		Doctor drHoliday = new Doctor("Holiday", 5.25, "Dentist");
		System.out.println();
		System.out.println("Verify:");
		System.out.println("Holiday");
		System.out.println("$5.25");
		System.out.println("Dentist");
		System.out.println();
		System.out.println(drHoliday);
		System.out.println();
		System.out.println();
		System.out.println("===============================");

		// Test the three set methods

		System.out.println("Set name test:");
		System.out.println();
		System.out.println("Parameter values before set:");
		drNo.toString();
		System.out.println();
		drNo.setName("Yes");
		System.out.println("Parameter values after set:");
		System.out.println("Verify Name: Yes");
		System.out.println();
		System.out.println(drNo);
		System.out.println();
		System.out.println();
		System.out.println("===============================");

		System.out.println("Set office fee test:");
		System.out.println();
		System.out.println("Parameter values before set:");
		drNo.toString();
		System.out.println();
		drNo.setOfficeFee(987.65);
		System.out.println("Parameter values after set:");
		System.out.println("Verify Office Fee: $987.65");
		System.out.println();
		System.out.println(drNo);
		System.out.println();
		System.out.println();
		System.out.println("===============================");

		System.out.println("Set specialty test:");
		System.out.println();
		System.out.println("Parameter values before set:");
		drNo.toString();
		System.out.println();
		drNo.setSpecialty("Psychiatry");
		System.out.println("Parameter values after set:");
		System.out.println("Verify Specialty: Psychiatry");
		System.out.println();
		System.out.println(drNo);
		System.out.println();
		System.out.println();
		System.out.println("===============================");

		// Test the three get methods

		System.out.println("Get name test:");
		System.out.println();
		System.out.println("Verify Yes");
		System.out.println();
		System.out.println(drNo.getName());
		System.out.println();
		System.out.println();
		System.out.println("===============================");

		System.out.println("Get office fee test:");
		System.out.println();
		System.out.println("Verify 987.65");
		System.out.println();
		System.out.println(drNo.getOfficeFee());
		System.out.println();
		System.out.println();
		System.out.println("===============================");

		System.out.println("Get specialty test:");
		System.out.println();
		System.out.println("Verify Psychiatry");
		System.out.println();
		System.out.println(drNo.getSpecialty());
		System.out.println();
		System.out.println();
		System.out.println("===============================");

		// test equals

		System.out.println("equals test 1:");
		System.out.println();
		// Create second Doctor with same values as drNo
		Doctor drYes = new Doctor("Yes", 987.65, "Psychiatry");
		System.out.println("First Doctor's parameter values:");
		System.out.println();
		System.out.println(drNo);
		System.out.println();
		System.out.println("Second Doctor's parameter values:");
		System.out.println();
		System.out.println(drYes);
		System.out.println("Verify true");
		System.out.println();
		System.out.println(drNo.equals(drYes));
		System.out.println();
		System.out.println();
		System.out.println("===============================");

		System.out.println("equals test 2:");
		System.out.println();
		// Change office fee of drYes
		drYes.setOfficeFee(987.66);
		System.out.println("First Doctor's parameter values:");
		System.out.println();
		System.out.println(drNo);
		System.out.println();
		System.out.println("Second Doctor's parameter values:");
		System.out.println();
		System.out.println(drYes);
		System.out.println("Verify false");
		System.out.println();
		System.out.println(drNo.equals(drYes));
		System.out.println();
		System.out.println();
		System.out.println("===============================");

		System.out.println("equals test 3:");
		System.out.println();
		// Change office fee back to 987.65
		// and specialty to psychology
		drYes.setOfficeFee(987.65);
		drYes.setSpecialty("Psychololgy");
		System.out.println("First Doctor's parameter values:");
		System.out.println();
		System.out.println(drNo);
		System.out.println();
		System.out.println("Second Doctor's parameter values:");
		System.out.println();
		System.out.println(drYes);
		System.out.println("Verify false");
		System.out.println();
		System.out.println(drNo.equals(drYes));
		System.out.println();
		System.out.println();
		System.out.println("===============================");
	}
}