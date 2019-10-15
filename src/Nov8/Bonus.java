package Nov8;

import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last name:");
		String fname = sc.nextLine();
		System.out.println("Enter first  name:");
		String lname = sc.nextLine();
		System.out.println("Enter this year's units:");
		int y1 = sc.nextInt();
		System.out.println("Enter last  year's units:");
		int y2 = sc.nextInt();
		int bonus = 0;
		if (y1 >= y2) {
			if (y1 <= 1000)
				bonus = 25;
			else if (y1 <= 3000)
				bonus = 50;
			else if (y1 <= 5000)
				bonus = 100;
			else
				bonus = 200;
		}
		System.out.println(lname+","+fname);
		System.out.println("Bonus is $" + bonus);
	}
}
