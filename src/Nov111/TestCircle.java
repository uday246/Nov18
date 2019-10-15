package Nov111;

import java.util.Scanner;

class Circle {
	private double radius;
	private final double PI = 3.14159;

	// constructors
	public Circle(double aRadius) {
		super();
		radius = aRadius;
	}

	// getters and setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double aRadius) {
		radius = aRadius;
	}

	// returns area of circle
	public double getArea() {
		return PI * radius * radius;
	}

	// returns circumference of circle
	public double getCircumference() {
		return 2 * PI * radius;
	}

	// returns diameter
	public double getDiameter() {
		return 2 * radius;
	}

	// returns string representation of object
	public String toString() {
		return "Radius : " + getRadius() + " Diameter : " + getDiameter() + " Area : " + getArea() + " Circumference : "
				+ getCircumference();

	}
}

public class TestCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double r = sc.nextDouble();
		Circle c = new Circle(r);
		System.out.println(c);

	}
}
