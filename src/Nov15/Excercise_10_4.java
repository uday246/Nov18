package Nov15;

import java.util.Scanner;

public class Excercise_10_4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String str=sc.nextLine();
	System.out.println("Enter number");
	int n=sc.nextInt();
	String res="";
	String data="abcdefghijklmnopqrstuvwxyz";
	for(int i=0;i<str.length();i++){
		int t=str.charAt(i)-97;
		t+=n;
		t=t%26;
		res+=data.charAt(t);
	}
	System.out.println(res);
}
}
