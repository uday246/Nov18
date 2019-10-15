package Nov2;

import java.io.BufferedReader;
import java.io.FileReader;
class Devide{
	private String make;
	private String model;
	private double price;
	
	
}
public class ReadFile {
	public static void main(String[] args) throws Exception {
		String str="My First Java Progeam";
		System.out.println(str.substring(2,12));
		BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
		String line = br.readLine();
		String arr[] = line.split(" ");
		String fname = arr[0];
		String lname = arr[1];
		double payRate = Double.parseDouble(arr[2]);
		int hours = Integer.parseInt(arr[3]);
		System.out.println(fname + " " + lname + " Salary : $" + payRate * hours);
	}
}
