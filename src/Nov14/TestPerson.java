package Nov14;

import java.util.ArrayList;
import java.util.Scanner;

class Person{
	private String name;
	private String adress;
	private int hoursWorked;
	private double hourlyRate;
	public Person(String aName, String aAdress, int aHoursWorked, double aHourlyRate) {
		super();
		name = aName;
		adress = aAdress;
		hoursWorked = aHoursWorked;
		hourlyRate = aHourlyRate;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String aAdress) {
		adress = aAdress;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int aHoursWorked) {
		hoursWorked = aHoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double aHourlyRate) {
		hourlyRate = aHourlyRate;
	}
	
	public double computeGrossPay(){
		return hourlyRate*hoursWorked;
	}
	
}
public class TestPerson {
public static void main(String[] args) {
	ArrayList<Person>list= new ArrayList<Person>();
	Scanner sc = new Scanner(System.in);
	
	int arr[]={1,2,3,4};
	int m=1;
	for(int i:arr){
		m*=(i+1);
	}
	System.out.println(m);
	/*for(int i=0;i<5;i++){
		System.out.println("Enter name,address,hoursworked, hourlyrate");
		String name=sc.next();
		String addr=sc.next();
		int h=sc.nextInt();
		double r=sc.nextDouble();
		sc.nextLine();
		list.add(new Person(name, addr, h, r));
	}*/
	/*for(int i=0;i<5;i++)
		System.out.println(list.get(i).getName()+" : "+list.get(i).computeGrossPay());
	*/
}
}
