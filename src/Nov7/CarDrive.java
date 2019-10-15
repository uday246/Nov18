package Nov7;

import java.util.Scanner;

class MotorCycle {
	private int earModel;
	private String make;
	private double speed;

	public MotorCycle() {

	}

	public MotorCycle(int aEarModel, String aMake, double aSpeed) {
		super();
		earModel = aEarModel;
		make = aMake;
		speed = aSpeed;
	}

	public int getEarModel() {
		return earModel;
	}

	public void setEarModel(int aEarModel) {
		earModel = aEarModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String aMake) {
		make = aMake;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double aSpeed) {
		speed = aSpeed;
	}

	void accelerate() {
		speed += 8;
	}

	void brake() {
		speed -= 8;
	}

	@Override
	public String toString() {
		return "MotorCycle [earModel=" + earModel + ", make=" + make + ", speed=" + speed + "]";
	}

}

public class CarDrive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year model:");
		int year = sc.nextInt();
		System.out.println("Enter make : ");
		sc.nextLine();
		String make = sc.nextLine();
		System.out.println("Current status of motor cycle");
		MotorCycle m = new MotorCycle(year, make, 0);
		System.out.println(m);
		for (int i = 0; i < 10; i++)
			m.accelerate();
		System.out.println("Speed is : " + m.getSpeed());
		for (int i = 0; i < 6; i++)
			m.brake();
		System.out.println("Speed is : " + m.getSpeed());

	}
}
