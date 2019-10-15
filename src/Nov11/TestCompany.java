package Nov11;

import java.util.HashMap;
import java.util.Scanner;

class Employee {

	private String name;
	private int id;
	private double salary;
	private static int employeeCount;

	public Employee() {
		name = "";
		id = ++employeeCount;
		salary = 0;
	}

	public Employee(int aI, String aString) {
		name = aString;
		id = ++employeeCount;
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

	public String toString() {
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

public class TestCompany {
	public static void main(String[] args) {
		Company c = new Company();
	}
}

class Company {

	HashMap<Integer, Employee> employeeDataBase = new HashMap<Integer, Employee>();

	Company() {
		populateEmplpyeDataBase();
		System.out.println(employeeDataBase);
	}

	public void addEmployee(String name, int sal) {
		Employee e = new Employee(sal, name);
		employeeDataBase.put(e.getId(), e);
	}

	public void addEmployee(int id) {
		Employee e = employeeDataBase.get(id);
		e.setSalary(e.getSalary() + 500);
		employeeDataBase.put(id, e);
	}

	private void populateEmplpyeDataBase() {
		Scanner sc = new Scanner(System.in);
		String name;
		int sal;
		String ch = "y";
		for (int i = 0; i < 4; i++) {
			name = sc.nextLine();
			sal = Integer.parseInt(name.split(",")[1]);
			name=name.split(",")[0];
			Employee e = new Employee(sal, name);
			employeeDataBase.put(e.getId(), e);
		}
	}

}
