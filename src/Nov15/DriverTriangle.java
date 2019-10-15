package Nov15;

import java.util.Scanner;

class Triangle {
	int side1;
	int side2;
	int side3;

	public Triangle() {
		side1 = 0;
		side2 = 0;
		side3 = 0;
	}

	public Triangle(int aSide1, int aSide2, int aSide3) {
		super();
		side1 = aSide1;
		side2 = aSide2;
		side3 = aSide3;
	}

	public int getSide1() {
		return side1;
	}

	public void setSide1(int aSide1) {
		side1 = aSide1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int aSide2) {
		side2 = aSide2;
	}

	public int getSide3() {
		return side3;
	}

	public void setSide3(int aSide3) {
		side3 = aSide3;
	}

	public boolean is_scalene() {
		return side1 != side2 && side2 != side3;
	}
}

public class DriverTriangle {
	public static void main(String[] args) {
		int side1 = 0, side2 = 0, side3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 sides");
		side1 = sc.nextInt();
		side2 = sc.nextInt();
		side3 = sc.nextInt();
		Triangle myTri = new Triangle(side1, side2, side3);

		if (myTri.is_scalene())

			System.out.println("Triangle is scalene - no 2 sides have the same length!");

		else

			System.out.println("Triangle is NOT scalene - at least 2 sides have the same length!");
	}
}
