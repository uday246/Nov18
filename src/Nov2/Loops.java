package Nov2;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		int firstNum, lastNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		firstNum = sc.nextInt();
		System.out.println("Enter last number");
		lastNumber = sc.nextInt();
		if (firstNum > lastNumber) {
			System.out.println("Invalid Range");
		}
		int i = firstNum;
		int sum = 0;
		while (i <= lastNumber) {
			if (i % 2 == 1)
				sum = sum + i * i;
			i++;
		}
		System.out
				.println("Sum of the squares of odd integers between " + firstNum + " and " + lastNumber + " =" + sum);
		System.out.println("Odd integers between " + firstNum + " and " + lastNumber + " are ");
		sum = 0;
		i = firstNum;
		while (i <= lastNumber) {
			if (i % 2 == 1)
				System.out.print(i + " ");
			else
				sum += i;
			i++;
		}
		System.out.println();
		System.out.println("Sum of the  even integers between " + firstNum + " and " + lastNumber + " =" + sum);
		i = lastNumber;
		System.out.println("Number\t\tSquare of number");
		while (i >= firstNum) {
			if (i % 2 == 0)
				System.out.println(i + "\t\t" + (i * i));
			i--;
		}
		char c = 'A';
		while (c <= 'Z')
			System.out.print(c++ + " ");
	}
}
