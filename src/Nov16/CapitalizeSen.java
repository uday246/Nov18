package Nov16;

import java.util.Scanner;

public class CapitalizeSen {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Sentense ");
	String line=sc.nextLine();
	System.out.println(capitalize(line));
}

private static String capitalize(String aLine) {
	String arr[]=aLine.split(" ");
	String res="";
	boolean flag=true;
	for(String s:arr){
		s=s.trim();
		String temp=s.charAt(0)+"";
		temp=temp.toUpperCase();
		if(flag){
			res=temp+s.substring(1);
			flag=false;
		}else
		res=res+" "+temp+s.substring(1);
	}
	return res.trim();
}
}
