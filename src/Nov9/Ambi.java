package Nov9;

abstract class Shape {
	public void printMe() {

		System.out.println("I'm a shape.");
	}

	public abstract double computeArea();
}

class Circle extends Shape {

	private double rad = 10;

	public void printMe() {

		System.out.println("I'm a circle.");
	}

	public double computeArea() {

		return rad * rad * 3.14;
	}
}

class Ambiguous extends Shape {
	private double area = 10;

	public double computeArea() {
		return area;
	}
}

public class Ambi {
	public static void main(String[] args)

	{
		Shape[] shapes = new Shape[2];
		Circle circle = new Circle();
		Ambiguous ambiguous = new Ambiguous();
		shapes[0] = circle;
		shapes[1] = ambiguous;
		for (Shape s : shapes) {
			s.printMe();
			System.out.println(s.computeArea());
		}
	}
}