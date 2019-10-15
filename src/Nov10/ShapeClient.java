package Nov10;

import java.util.ArrayList;

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
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		return 0;
	}
}

public class ShapeClient

{

	public static void main(String[] args) {

		ArrayList<Shape> shapeList = new ArrayList<Shape>();

		Shape s1 = new Circle("circle 1", 10);

		shapeList.add(s1);

		Shape s2 = new Rectangle("rectangle 2", 100, 100);

		shapeList.add(s2);

		Shape s3 = new Triangle("Triangle 3", 11, 12, 10);// these are sides
															// that need to be
		Triangle t= (Triangle)(s3);												// compared
		if(t.getSize1()==t.getSize2() && t.getSize2()==t.getSize3()){
			shapeList.add(s3); // this is where i am stuck
		}

		if (!s1.getClass().isInstance(s2)) {

			System.out.println("Actual types of s1 and s2 are different");

		}


	}

	

}
