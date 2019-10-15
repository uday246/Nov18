package Nov8;

import java.util.Scanner;

class Addtion extends Thread {
	int num1;
	int num2;

	public Addtion(int aNum1, int aNum2) {
		super();
		num1 = aNum1;
		num2 = aNum2;
	}

	public void run() {
		System.out.println("The result of the addition operation on " + num1 + " and " + num2 + " is " + (num1 + num2));
	}
}

class Subtraction extends Thread {
	int num1;
	int num2;

	public Subtraction(int aNum1, int aNum2) {
		super();
		num1 = aNum1;
		num2 = aNum2;
	}

	public void run() {
		System.out.println(
				"The result of the Subtraction operation on " + num1 + " and " + num2 + " is " + (num1 - num2));
	}
}

class Mulitplication extends Thread {
	int num1;
	int num2;

	public Mulitplication(int aNum1, int aNum2) {
		super();
		num1 = aNum1;
		num2 = aNum2;
	}

	public void run() {
		System.out.println(
				"The result of the Mulitplication operation on " + num1 + " and " + num2 + " is " + (num1 * num2));
	}
}

class Division extends Thread {
	int num1;
	int num2;

	public Division(int aNum1, int aNum2) {
		super();
		num1 = aNum1;
		num2 = aNum2;
	}

	public void run() {
		System.out.println("The result of the Division operation on " + num1 + " and " + num2 + " is " + (num1 / num2));
	}
}

public class TestThreads {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first integer");
		int n1 = sc.nextInt();
		System.out.println("Please enter second integer");
		int n2 = sc.nextInt();
		Addtion a = new Addtion(n1, n2);
		Subtraction s = new Subtraction(n1, n2);
		Mulitplication m = new Mulitplication(n1, n2);
		Division d = new Division(n1, n2);
		a.start();
		s.start();
		m.start();
		d.start();

	}
}
