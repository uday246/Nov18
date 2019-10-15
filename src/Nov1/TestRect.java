package Nov1;

class Rectangle {
	private double width;
	private double height;

	// constructor which takes arguments widht and height
	public Rectangle() {
		width = 0;
		height = 0;
	}

	public Rectangle(double aWidth, double aHeight) {
		super();
		width = aWidth;
		height = aHeight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double aWidth) {
		width = aWidth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double aHeight) {
		height = aHeight;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", Area = " + getArea() + ", Perimeter = "
				+ getPerimeter() + "]";
	}

}

public class TestRect {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5, 15);
		System.out.println(r2);
	}
}
