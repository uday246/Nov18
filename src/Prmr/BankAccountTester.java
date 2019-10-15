package Prmr;

import java.util.Scanner;

class BankAccount {

	private double balance;
	// deposits the amount to the bank
	public void deposit(double aBalance) {

		balance += aBalance;

	}
	// withdraws amount from the bank
	public void withdraw(double aAmount) {

		//checking if amount is valid
		if (aAmount <= balance && aAmount > 0) {

			balance -= aAmount;

		} else {

			System.out.println("Not valid amount");

		}

	}
	public double get() {

		return balance;

	}

}

public class BankAccountTester {

	public static void main(String[] args) {

		int ch = 0;

		double amount = 0;

		BankAccount b = new BankAccount();

		Scanner sc = new Scanner(System.in);

		do {
			// displaying menu to user
			System.out.println("-----------");
			System.out.println("1 Deposit");

			System.out.println("2 Withdraw");

			System.out.println("3 Print");

			System.out.println("4 Quit");
			System.out.println("-----------");
			System.out.println("Your choice: ");
			//reading user choic
			ch = sc.nextInt();

			switch (ch) {

			case 1:
				//reading amount
				System.out.println("Amount");

				amount = sc.nextDouble();
				//calling deposit

				b.deposit(amount);

				break;

			case 2:
				//reading amount

				System.out.println("Amount");
				//calling withdraw

				amount = sc.nextDouble();

				b.withdraw(amount);

				break;

			case 3:

				System.out.println("Your balance : " + b.get());

				break;

			case 4:
				ch=10;

				break;


			}

		} while (ch <4);
		System.out.println("Thank you");

	}

}