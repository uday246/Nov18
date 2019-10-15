package Nov8;

import java.util.Scanner;

public class TestDistance {
	public static void main(String[] args) {

		double speed;
		int hours;
		int distance;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Viktoriia Bobrova 11/10/2018\n");

		System.out.print("Enter the vehicle's speed: ");
		speed = keyboard.nextDouble();

		while (speed <= 0) {
			System.out.print("Enter 0 or greater for speed: ");
			speed = keyboard.nextDouble();
		}

		System.out.print("Enter the number of hours the vehicle was in motion: ");
		hours = keyboard.nextInt();
		while (hours <= 0) {
			System.out.print("Enter 1 or greater for hours: ");
			hours = keyboard.nextInt();
		}

		System.out.println(" Hour Distance Travelled");
		System.out.println("---------------------------------");

		for (int i = 1; i <= hours; i++) {
				Distance d = new Distance(speed, hours);
				System.out.println(i+"\t\t"+(i*d.getSpeed()));
		}

	}

}

/*
 * Hour Distance Travelled --------------------------------- 
 * 3 0.0 3 0.0 3 0.0
 * 
 * when it should be
 * 
 * 1 40
 * 
 * 2 80 and so for
 * 
 */
class Distance {
	private double speed;
	private int hours;
	public double distance;

	public Distance(double speed, int hours) {
		this.speed = speed;
		this.hours = hours;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getSpeed() {
		return speed;
	}

	public int getHours() {
		return hours;
	}

	public double getDistance() {
		return distance = (int) (speed * hours);
	}
}
