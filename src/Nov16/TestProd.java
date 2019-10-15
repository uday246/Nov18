package Nov16;

import java.util.Scanner;

class Employee {
private int number;
private String name;
Employee(int aNumber, String aName) {
	super();
	number = aNumber;
	name = aName;
}
public int getNumber() {
	return number;
}
public void setNumber(int aNumber) {
	number = aNumber;
}
public String getName() {
	return name;
}
public void setName(String aName) {
	name = aName;
}

}
class ProductionWorker extends Employee{
	private int shiftNumber;
	private double payRate;
	public ProductionWorker(int aNumber, String aName, int aShiftNumber, double aPayRate) {
		super(aNumber, aName);
		shiftNumber = aShiftNumber;
		payRate = aPayRate;
	}
	public int getShiftNumber() {
		return shiftNumber;
	}
	public void setShiftNumber(int aShiftNumber) {
		shiftNumber = aShiftNumber;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double aPayRate) {
		payRate = aPayRate;
	}
	@Override
	public String toString() {
		return "ProductionWorker [shiftNumber=" + shiftNumber + ", payRate=" + payRate + ", Number=" + getNumber()
				+ ", Name=" + getName() + "]";
	}
	
}
public class TestProd{
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter shift");
		int s=sc.nextInt();
		System.out.println("Enter pay rate");
		double p=sc.nextDouble();
		ProductionWorker prd = new ProductionWorker(id, name, s, p);
		System.out.println(prd);*/
		int k,x,sum=20;
		for(k=10;k<20;k++){
			System.out.print("Sum =\n"+sum);
			x=x;
			if(k>10)
				continue;
		}
	}
}