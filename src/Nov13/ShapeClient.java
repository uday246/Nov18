package Nov13;

import java.util.Scanner;

abstract class Shape {
	private String name;

	public Shape(String name) {
		this.name = name;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public String getName() {
		return name;
	}
}

class Circle extends Shape {
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {

		return 2 * Math.PI * radius;
	}

}

class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle(String name, double width, double length) {
		super(name);
		this.width = width;
		this.length = length;
	}

	@Override
	public double getArea() {
		return width * length;
	}

	@Override
	public double getPerimeter() {
		return 2 * (length + width);
	}

}

class Square extends Shape {
	private double side;

	public Square(String name, double h) {
		super(name);
		side = h;
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

}

class Triangle extends Shape {
	private double size1;
	private double size2;
	private double size3;

	public double getSize1() {
		return size1;
	}

	public void setSize1(double aSize1) {
		size1 = aSize1;
	}

	public double getSize2() {
		return size2;
	}

	public void setSize2(double aSize2) {
		size2 = aSize2;
	}

	public double getSize3() {
		return size3;
	}

	public void setSize3(double aSize3) {
		size3 = aSize3;
	}

	public Triangle(String name, double size1, double size2, double size3) {
		super(name);
		this.size1 = size1;
		this.size2 = size2;
		this.size3 = size3;
	}

	public boolean isEquilateral() {
		return (size1 == size2 && size2 == size3);
	}

	@Override
	public double getArea() {
		double s, area;
		s = (size1 + size2 + size3) / 2;
		area = Math.sqrt(s * (s - size1) * (s - size2) * (s - size3));
		return area;
	}

	@Override
	public double getPerimeter() {
		return size1 + size2 + size3;
	}
}

public class ShapeClient

{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			String co="";
			System.out.println("Choose Shape\n1. Circle\n2.Rectangle\n3.Square\n4.Triangle");
			int ch = sc.nextInt();
			Shape s = null;
			if (ch == 1) {
				System.out.println("Enter radius of Circle ");
				double r = sc.nextDouble();
				s = new Circle("Circle", r);
			}
			if (ch == 2) {
				System.out.println("Enter Length and width of Rectangle");
				double l = sc.nextDouble();
				double w = sc.nextDouble();
				s = new Rectangle("Rectangle", l, w);
			}
			if (ch == 3) {
				System.out.println("Enter side of square");
				double si = sc.nextDouble();
				s = new Square("Square", si);
			}
			if (ch == 4) {
				System.out.println("Enter 3 sides of triangle");
				double s1 = sc.nextDouble();
				double s2 = sc.nextDouble();
				double s3 = sc.nextDouble();

				s = new Triangle("Triangle", s1, s2, s3);
			}
			System.out.println("Area of : " + s.getName() + " : " + s.getArea());
			System.out.println("Perimeter of : " + s.getName() + " : " + s.getPerimeter());
			System.out.println("Do you want to coninue? y or n");
			co=sc.nextLine();
			if(co.equalsIgnoreCase("n"))
				break;
		}
	}
}
