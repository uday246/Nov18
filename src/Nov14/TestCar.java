package Nov14;

import java.util.Scanner;

class Car {
	private int yearModel;
	private String make;
	private int speed;
	public Car(int aYearModel, String aMake) {
		super();
		yearModel = aYearModel;
		make = aMake;
		speed=0;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int aYearModel) {
		yearModel = aYearModel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String aMake) {
		make = aMake;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int aSpeed) {
		speed = aSpeed;
	}
	public void accelerate(){
		speed+=5;
	}
	public void brake(){
		speed-=5;
	}
	
}

public class TestCar{
	public static void main(String[] args) {
		System.out.println("Please Enter Make and Year");
		Scanner scnr = new Scanner(System.in);
		String carMake=scnr.nextLine();
		int carYear=scnr.nextInt();
		Car c= new Car(carYear, carMake);
		while(c.getSpeed()<40){
			c.accelerate();
			System.out.println("Speed : "+c.getSpeed());
			
		}
		while(c.getSpeed()>0){
			c.brake();
			System.out.println("Speed : "+c.getSpeed());
			
		}
		System.out.println("Enter Make and Year ");
		scnr.nextLine();
		carMake=scnr.nextLine();
		 carYear=scnr.nextInt();
		c= new Car(carYear, carMake);
		while(c.getSpeed()<30){
			c.accelerate();
			System.out.println("Speed : "+c.getSpeed());
			
		}
		while(c.getSpeed()>0){
			c.brake();
			System.out.println("Speed : "+c.getSpeed());
			
		}
		
		
		
	}
}