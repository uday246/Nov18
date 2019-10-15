package Nov16;

import java.util.Scanner;

public class ReverseSubStrings {
public static void main(String[] args) {
	
	// reading string from user
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String str=sc.nextLine();
	
	String even="";
	String odd="";
// looping to get even and odd substrings
	for(int i=0;i<str.length();i++){
		if(i%2==0)
			even=even+str.charAt(i)+"";
		else
			odd=odd+str.charAt(i)+"";
	}
	// reversing the sub strings
	String rev1=new StringBuffer(even).reverse().toString();
	String rev2=new StringBuffer(odd).reverse().toString();
	System.out.println("Reversed substrings : "+rev1+","+rev2);
	System.out.println("Output : "+rev1+rev2);
}
}
