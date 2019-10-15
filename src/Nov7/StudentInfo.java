package Nov7;

import java.io.File;
import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the file name?");
		String file = sc.nextLine();
		System.out.println("Which gender do you want? f or m");
		String gender = sc.nextLine().toLowerCase();
		sc = new Scanner(new File(file));
		String id = "";
		String name = "";
		String g = "";
		String avg = "";
		while (sc.hasNextLine()) {
			id = sc.next();
			name = sc.next();
			g = sc.next();
			avg = sc.next();
			if (g.trim().equalsIgnoreCase(gender))
				System.out.println(id + " " + name + " " + g + " " + avg);
		}
	}
}
