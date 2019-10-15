package Nov12;

import java.util.Scanner;

public class NumberToWords {

	public static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	public static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		sc.close();
		if (num >= 1000) {
			System.out.println("Invalid num");
			return;
		}
		if(num>=100){
			System.out.println(units[num/100]);
			System.out.println(" hundred ");
			num=num%100;
			if(num<)
		}
	}
}