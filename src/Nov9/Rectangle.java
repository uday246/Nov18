package Nov9;

import java.util.Scanner;

public class Rectangle {
	private double length;
	private double width;

	public double getLength() {
		return length;
	}

	public void setLength(double aLength) {
		length = aLength;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double aWidth) {
		width = aWidth;
	}

	public static void main(String[] aaa)

	{

		Rectangle r1 = new Rectangle();

		Rectangle r2 = new Rectangle();

		Rectangle r3 = new Rectangle();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length for rectangle 1: ");

		r1.setLength(sc.nextDouble());

		System.out.print("Enter width for rectangle 1: ");

		r1.setWidth(sc.nextDouble());

		System.out.print("Enter length for rectangle 2: ");

		r2.setLength(sc.nextDouble());

		System.out.print("Enter width for rectangle 2: ");

		r2.setWidth(sc.nextDouble());

		System.out.print("Enter length for rectangle 3: ");

		r3.setLength(sc.nextDouble());

		System.out.print("Enter width for rectangle 3: ");

		r3.setWidth(sc.nextDouble());

		System.out.println("Now lets print the rectangles:");

		System.out.println("1. width: " + r1.getWidth() + "\n" + "length: " + r1.getLength());
		System.out.println("2. width: " + r2.getWidth() + "\n" + "length: " + r2.getLength());
		System.out.println("3. width: " + r3.getWidth() + "\n" + "length: " + r3.getLength());
	}
}
