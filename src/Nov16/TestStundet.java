package Nov16;
public class TestStundet{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setID(1);
		Student s2 = new Student("Koti",123,9);
		s2.setID(2);
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
class Student extends Person{
	private double GPA;
	public Student(){
		super("John Doe",12345);
		GPA=4;
	}
	public Student(String aName, int aID, double aGPA) {
		super(aName, aID);
		GPA = aGPA;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double aGPA) {
		GPA = aGPA;
	}
	@Override
	public String toString() {
		return "Name =" + getName() + ", Id =" + getID()+"GPA =" + GPA;
	}
	
	
}
class Person {
	private String name;
	private int ID;
	public Person(){
		
	}
	public Person(String aName, int aID) {
		super();
		name = aName;
		ID = aID;
	}
	public String getName() {
		return name;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int aID) {
		ID = aID;
	}
	
}
