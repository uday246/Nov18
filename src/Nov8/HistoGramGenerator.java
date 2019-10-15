package Nov8;

import java.util.Scanner;

public class HistoGramGenerator {
	public static void main(String[] args) {
		int num;
		String title = "";
		System.out.println("Enter Histogram title");
		Scanner sc = new Scanner(System.in);
		title = sc.nextLine();
		System.out.println("Enter number of items");
		num = sc.nextInt();
		sc.nextLine();
		int values[] = new int[num];
		String names[] = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter name " + (i + 1));
			names[i] = sc.nextLine();
			System.out.println("Enter value " + (i + 1));
			values[i] = sc.nextInt();
			sc.nextLine();
		}
		if (num == 0) {
			System.out.println("Empty histogram");
			return;
		}
		System.out.println(title);
		for (int i = 0; i < num; i++) {
			System.out.print(names[i] + " : ");
			for (int j = 0; j < values[i]; j++)
				System.out.print("@");
			System.out.println();
		}
	}
}
