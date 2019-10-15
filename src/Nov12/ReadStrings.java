package Nov12;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		String ch = "";
		System.out.println("Enter series of Strings ,Q to quit");
		while (!ch.equalsIgnoreCase("Q")) {
			ch = sc.nextLine();
			if (ch.equalsIgnoreCase("Q"))
				break;
			list.add(ch);
		}
		System.out.println("Enter target string");
		String target = sc.nextLine();
		boolean flag = false;
		
		System.out.println("Index of "+target+" : "+list.indexOf(target));
	}
}
