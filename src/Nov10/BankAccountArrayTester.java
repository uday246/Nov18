package Nov10;

import java.util.Random;

class BankAccount {
	private double balance;

	public BankAccount(double aBalance) {
		super();
		balance = aBalance;
	}

	public void deposit(double aBalance) {
		balance += aBalance;
	}

	public void withdraw(double aAmount) {
		if (aAmount <= balance && aAmount > 0) {
			balance -= aAmount;
		} else {
			System.out.println("Invalid amount");
		}
	}

	public double getBalance() {
		return balance;
	}
}

public class BankAccountArrayTester {
	public static void main(String[] args) {
		// creating 10 BankAccount objects
		BankAccount[] bankArray = new BankAccount[10];
		Random r = new Random();
		// creating BankAccount objects with random balance using Random class
		for (int i = 0; i < 10; i++)
			bankArray[i] = new BankAccount(r.nextInt(10000));
// looping to print the 10 BankAccount objects balance
		for (int i = 0; i < 10; i++)
			System.out.println("Balance is : " + bankArray[i].getBalance());
	}
}
