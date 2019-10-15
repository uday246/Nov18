package Nov20;

import java.util.Scanner;

public class PowerRange {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter range");
	int start=sc.nextInt();
	int end=sc.nextInt();
	printRange(start,end);
}

private static void printRange(int aStart, int aEnd) {
	for(int i=aStart;i<=aEnd;i++){
		System.out.println("2 to the power of "+i+" is "+(i*i));
	}
}
}
