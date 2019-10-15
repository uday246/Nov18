package Nov9;

import java.util.Scanner;

public class Expenses {
public static void main(String[] args) {
	double arr[]=new double[10];
	arr[0]=60;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter expenses");
	for(int i=1;i<8;i++){
		arr[i]=sc.nextDouble();
		arr[0]=arr[0]-arr[i];
	}
	for(int i=0;i<8;i++){
		System.out.printf("%.2f ",arr[i]);
	}
	System.out.println("\nRemaining Bal : "+arr[0]);
	
	
}
}
