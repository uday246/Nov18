package Prmr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class Iteratoration{
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		myList.add("Hello");
		myList.add("123");
		myList.add("Hi");
		myList.add("Bye");
		myList.add("Good morning");
		Enumeration en = Collections.enumeration(myList);
		while (en.hasMoreElements())
			System.out.print(en.nextElement() + " ");
	
	}
}
