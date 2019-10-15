package Prmr;

import java.util.Scanner;

public class CountBoolean {
	public static void main(String[] args) {
		boolean arr[] = { true, false, true, true, false };
		System.out.println(count(arr));
		if(choice==2){
			for (String i : items){
			System.out.println(items);
			}
			System.out.println("Enter the name of the items you'd like to delete" );
			  Scanner sc = new Scanner(System.in);
			  String n=sc.nextLine();
			  items.remove(n);
			  
			
			}
	}

	private static int count(boolean[] arr) {
		int c = 0;
		for (boolean b : arr) {
			if (!b)
				c++;
		}
		return c;
	}

}
