package Nov8;

import java.util.Scanner;

public class Lab7 {
	/**
	 * @param args
	 *            the command line arguments
	 */

	public static void main(String[] args) {
		BookClubPoints objBookClubPoint = new BookClubPoints();
		objBookClubPoint.bookStoreMessage();
	}
}

class BookClubPoints {
	Scanner scanner = new Scanner(System.in);

	public void bookStoreMessage() {
		int point0 = 0;
		int point1 = 5;
		int point2 = 15;
		int point3 = 30;
		int point4 = 60;
		int input;
		System.out.println("How many books you have purchased this month? ");
		input = scanner.nextInt();
		BookCalculation objBookCal = new BookCalculation(point0,point1,point2,point3,point4);
		
		if (input == 0) {
			System.out.println("You have earned " + point0 + " point");
		}
		if (input == 1) {
			System.out.println("You have earned " + point1 + " point");
		}
		if (input == 2) {
			System.out.println("You have earned " + point2 + " points");
		}
		if (input == 3) {
			System.out.println("You have earned " + point3 + " points");
		}
		if (input >= 4) {
			System.out.println("You have earned " + point4 + " point");
		}
		System.exit(0);

	}
}

class BookCalculation {

	int point0;
	int point1;
	int point2;
	int point3;
	int point4;
	int input;

	public BookCalculation(int total) {
		this.point0 = 0;
		this.point1 = 5;
		this.point2 = 15;
		this.point3 = 30;
		this.point4 = 60;
	}

	public BookCalculation(int aPoint0, int aPoint1, int aPoint2, int aPoint3, int aPoint4) {
		super();
		point0 = aPoint0;
		point1 = aPoint1;
		point2 = aPoint2;
		point3 = aPoint3;
		point4 = aPoint4;
	}

	BookCalculation() {
	}

	public int getPoint0() {
		return this.point0;
	}

	public int getPoint1() {
		return this.point1;
	}

	public int getPoint2() {
		return this.point2;
	}

	public int getPoint3() {
		return this.point3;
	}

	public int getPoint4() {
		return this.point4;
	}

	public void setPoint0(int pointGiven) {
		this.point0 = pointGiven;
	}

	public void setPoint1(int pointGiven) {
		this.point1 = pointGiven;
	}

	public void setPoint2(int pointGiven) {
		this.point2 = pointGiven;
	}

	public void setPoint3(int pointGiven) {
		this.point3 = pointGiven;
	}

	public void setPoint4(int pointGiven) {
		this.point4 = pointGiven;
	}

}
