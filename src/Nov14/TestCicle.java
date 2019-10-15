package Nov14;

class Circle {
	private double radius;
	private String color;

	public Circle(double aRadius, String aColor) {
		super();
		radius = aRadius;
		color = aColor;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double aRadius) {
		radius = aRadius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String aColor) {
		color = aColor;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public void display() {

		System.out.println("Radius = " + radius + "\nColor = " + color);
		System.out.println("===========================");

	}
}

public class TestCicle {
	public static void main(String[] args) {
		Circle c = new Circle(10, "Red");
		c.display();
	}
}
