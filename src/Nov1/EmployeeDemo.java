package Nov1;

class Employee {
	private String name;
	private int hoursWorked;
	private double hourRate;
	private double bonusRate;

	public Employee() {
		super();
		name = "";
		hoursWorked = 0;
		hourRate = 0;
		bonusRate = 0;
	}

	public Employee(String aName, int aHoursWorked, double aHourRate, double aBonusRate) {
		super();
		name = aName;
		hoursWorked = aHoursWorked;
		hourRate = aHourRate;
		bonusRate = aBonusRate;
	}

	public double getBonusRate() {
		return bonusRate;
	}

	public void setBonusRate(double aBonusRate) {
		bonusRate = aBonusRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int aHoursWorked) {
		hoursWorked = aHoursWorked;
	}

	public double getHourRate() {
		return hourRate;
	}

	public void setHourRate(double aHourRate) {
		hourRate = aHourRate;
	}

	public double calcRegularPay() {
		return hourRate * hoursWorked;
	}

	public double calcBonus() {
		double t = bonusRate / 100;
		return calcRegularPay() * t;
	}

	public double calcGrossPay() {
		return calcBonus() + calcRegularPay();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", hoursWorked=" + hoursWorked + ", hourRate=" + hourRate + ", bonusRate="
				+ bonusRate + ", RegularPay = " + calcRegularPay() + ", Bonus = " + calcBonus() + ", GrossPay = "
				+ calcGrossPay() + "]";
	}

}

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee("Koteswari", 10, 15, 10);
		System.out.println(e1);
	}
}
