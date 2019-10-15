package Nov3;

public class OverloadMethods {
	public static void main(String[] args) {
		System.out.println("Circle Area : "+area(5));
		System.out.println("Rectangle Area : "+area(5,5));
		System.out.println("Cylinder  Area : "+area(5.5,5));
			
	}

	public static double area(double radius) {
		return Math.PI * radius * radius;

	}

	public static double area(int l, int b) {
		return l * b;
	}

	public static double area(double r, double h) {
		return Math.PI * r * r * h;
	}
}
