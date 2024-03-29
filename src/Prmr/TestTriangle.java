package Prmr;

import javax.swing.JButton;
import javax.swing.JLabel;

class Triangle {

	private double side1;

	private double side2;

	private double side3;

	public Triangle() {

		super();

		this.side1 = 1.0;

		this.side2 = 1.0;

		this.side3 = 1.0;
		JButton j;
		JLabel l;
		l.

	}

	public Triangle(double side1, double side2, double side3) {

		if ((side1 + side2) > side3)

			this.side1 = side1;

		this.side2 = side2;

		this.side3 = side3;

	}

	public double getSide1() {

		return side1;

	}

	public void setSide1(double side1) {

		this.side1 = side1;

	}

	public double getSide2() {

		return side2;

	}

	public void setSide2(double side2) {

		this.side2 = side2;

	}

	public double getSide3() {

		return side3;

	}

	public void setSide3(double side3) {

		this.side3 = side3;

	}

	public double getArea() {

		double s = (this.side1 + this.side2 + this.side3);

		double area = Math.sqrt((s * (s - this.side1) * (s - this.side2) * (s - this.side3)));

		return area;

	}

	public double getPerimeter() {

		return (this.side1 + this.side2 + this.side3);

	}

	@Override
	public String toString() {
		return "Triangle side1 =" + side1 + ", side2 =" + side2 + ", side3 =" + side3;
	}

}

public class TestTriangle {
	public static void main(String[] args) {
		Triangle tr = new Triangle(5,8,12);
		System.out.println(tr);
	}
}
