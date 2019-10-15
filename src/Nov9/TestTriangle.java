package Nov9;

import java.util.Scanner;

abstract class GeometricObject {
	public abstract double area();

	public abstract double perimeter();

	private String color;
	private boolean filled;

	public String getColor() {
		return color;
	}

	public void setColor(String aColor) {
		color = aColor;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean aFilled) {
		filled = aFilled;
	}

	public GeometricObject() {
		filled = false;
	}

	public GeometricObject(String aColor, boolean aFilled) {
		super();
		color = aColor;
		filled = aFilled;
	}

}

class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}

	public Triangle(String aColor, boolean aFilled, double aSide1, double aSide2, double aSide3) {
		super(aColor, aFilled);
		side1 = aSide1;
		side2 = aSide2;
		side3 = aSide3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double aSide1) {
		side1 = aSide1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double aSide2) {
		side2 = aSide2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double aSide3) {
		side3 = aSide3;
	}

	@Override
	public double area() {
		double s = (side1 + side2 + side3) / 2;
		double t = s * (s - side1) * (s - side2) * (s - side3);

		return Math.sqrt(t);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return side1 + side2 + side3;
	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

}

public class TestTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s1, s2, s3;
		System.out.println("Enter three sides of triangle");
		s1 = sc.nextDouble();
		s2 = sc.nextDouble();
		s3 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter color");
		String color = sc.nextLine();
		System.out.println("Is triangle filled");
		boolean b = sc.nextBoolean();
		GeometricObject g = new Triangle(color, b, s1, s2, s3);
		System.out.println(g);
		System.out.println("Area : "+g.area());
		System.out.println("Perimeter : "+g.perimeter());
		
	}
}
