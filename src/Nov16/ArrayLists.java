package Nov16;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		System.out.println("Enter " + size + " elements");
		for (int i = 0; i < size; i++)
			list.add(sc.nextInt());
		System.out.println("\nElements : ");
		for (int i = 0; i < size; i++)
			System.out.print(list.get(i) + ",");
		System.out.println("\nReverse Elements : ");
		for (int i = list.size() - 1; i >=0; i--)
			System.out.print(list.get(i) + ",");
		System.out.println("\nOdd numbers : ");
		for (int i = 0; i < size; i++)
			if (list.get(i) % 2 == 1)
				System.out.print(list.get(i) + ",");
		System.out.println("\nOdd indexes : ");
		for (int i = 1; i < size; i += 2)
			System.out.print(list.get(i) + ",");
		int max = list.get(0);
		for (int i = 1; i < size; i += 2)
			if (max < list.get(i))
				max = list.get(i);
		System.out.println("\nMax : " + max);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i < size; i += 2)
			if (n == list.get(i))
				count++;
		System.out.println(n + " Occurs " + count + " times");
	}
}
