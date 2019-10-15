package Nov20;

public class Employee {
private String firstName;
private String lastName;
private String position;
private double salary;
// constructor to initialize the values
public Employee(String aFirstName, String aLastName, String aPosition, double aSalary) {
	super();
	firstName = aFirstName;
	lastName = aLastName;
	position = aPosition;
	salary = aSalary;
}
//constructor to initialize the values
public Employee(String aFirstName, String aLastName) {
	super();
	firstName = aFirstName;
	lastName = aLastName;
	position="volunteer";
	salary=0;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String aFirstName) {
	firstName = aFirstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String aLastName) {
	lastName = aLastName;
}
public String getPosition() {
	return position;
}
public void setPosition(String aPosition) {
	position = aPosition;
}
public double getSalary() {
	return salary;
}
// toString return the string representation of object
@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", position=" + position + ", salary="
			+ salary + "]";
}
// raise method to update the salary
public void raise(double a){
	salary+=a;
}
// returns the daily pay
public double dailyPay(int d){
	return salary/d;
}

}
