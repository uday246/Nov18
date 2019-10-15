package Nov13;

import java.util.ArrayList;
import java.util.Scanner;

public class RosterTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Uday");
		list.add("Virat");
		list.add("Koti");
		System.out.println(list);
		classRoaster(list, 1);
		classRoaster(list, 2);
		System.out.println(list);
	}

	public static void classRoaster(ArrayList<String> list, int ch) {
		Scanner sc = new Scanner(System.in);
		// if 1 adding to list
		if (ch == 1) {
			System.out.println("Enter student name to add");
			String n = sc.nextLine();
			list.add(n);
			// 2 removing from the list
		} else if (ch == 2) {
			while (true) {
				System.out.println("Enter student name to remove");
				String n = sc.nextLine();
				if (list.remove(n))
					break;
				else
					System.out.println(n + " does exist: ");
			}
		}
		else{
			System.out.println("Invalid command...!!!");
		}
			
	}
}
