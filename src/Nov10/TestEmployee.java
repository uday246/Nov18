package Nov10;

class Employee{
	
	
	private String name;
	private int id;
	private double salary;
	private static int employeeCount;
	public Employee(){
		name="";
		id=++employeeCount;
		salary=0;
	}
	
	public Employee(int aI, String aString, int aI2) {
		name = aString;
		id = aI2;
		salary = aI;
		employeeCount++;
		}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getId() {
		return id;
	}

	public void setId(int aId) {
		id = aId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double aSalary) {
		salary = aSalary;
	}

	public String display() {
		return "Name  :  " + name + "\nId  : " + id + "\nSalary  : " + salary + "";
	}

	public static int getEmployeeCount() {
		return employeeCount;
	}

	public static void setEmployeeCount(int aEmployeeCount) {
		employeeCount = aEmployeeCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	
}

public class TestEmployee {
public static void main(String[] args) {
	Employee e1 = new Employee();
	Employee e2 = new Employee();
	System.out.println(e1.getId());
	System.out.println(e2.getId());
	System.out.println(Employee.getEmployeeCount());
	Employee e3 = new Employee(810,"Alice",5);
	Employee e4 = new Employee(810,"Alice",5);
	System.out.println(e3.equals(e4));
}
}
