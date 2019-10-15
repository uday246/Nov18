package Prmr;

import java.util.Scanner;

public class NumberTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		int d = (int) num;
		System.out.println("Is it Integer : " + (num - d == 0));
		System.out.println("Is it Double : " + (num - d != 0));
		System.out.println("Is it Positive : " + (num > 0));
		System.out.println("Is it Negative: " + (num < 0));
		System.out.println("Is it Even : " + (num % 2 == 0));
		System.out.println("Is it Odd: " + (num % 2 == 1));
		System.out.println("Is it Prime: " + isPrime(num));
		System.out.println("Is it Perfect Square: " + isPerfectSquare(num));
		System.out.println("Factors:");
		if(num<0)
			System.out.println("(Not a positive Integer");
		else{
			for(int i=1;i<num;i++)
				if(num%i==0)
					System.out.print(i+" ");
		}
			

	}

	private static boolean isPerfectSquare(double x) {
		double sr = Math.sqrt(x); 
		  
		  return ((sr - Math.floor(sr)) == 0); 
	}

	private static boolean isPrime(double aNum) {
		if (aNum == 2)
			return true;
		if (aNum % 2 == 0)
			return false;

		for (int i = 2; i < aNum; i++)
			if (aNum % i == 0)
				return false;
		return true;
	}
}
