package Nov9;

class Employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;

	public Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}

	public Employee(String aName, int aIdNumber, String aDepartment, String aPosition) {
		super();
		name = aName;
		idNumber = aIdNumber;
		department = aDepartment;
		position = aPosition;
	}

	public Employee(String aName, int aIdNumber) {
		super();
		name = aName;
		idNumber = aIdNumber;
		department = "";
		position = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int aIdNumber) {
		idNumber = aIdNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String aDepartment) {
		department = aDepartment;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String aPosition) {
		position = aPosition;
	}

}

public class TestEmp {
	public static void main(String[] args) {
		Employee e1 = new Employee("Susan Meyers",47899,"Accouting","Vice Precsident");
		Employee e2 = new Employee("Mark Jones",39119,"It","Programmer");
		Employee e3 = new Employee("Joy Rogers",91774,"Manufacturing","Engineer");
		
		System.out.println("Name\t\t\tID Number \t\t Department \t\tPosition");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(e1.getName()+"\t\t"+e1.getIdNumber()+"\t\t\t"+e1.getDepartment()+"\t\t"+e1.getPosition());
		System.out.println(e2.getName()+"\t\t"+e2.getIdNumber()+"\t\t\t"+e2.getDepartment()+"\t\t\t"+e2.getPosition());
		System.out.println(e3.getName()+"\t\t"+e3.getIdNumber()+"\t\t\t"+e3.getDepartment()+"\t\t"+e3.getPosition());
		
		
		
	}
}
