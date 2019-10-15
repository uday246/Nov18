package Nov15;

import java.io.File;
import java.util.Scanner;

public class JavaLab12  {
public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(new File("messages.txt"));
	String res="";
	int index=0;
	while(sc.hasNextLine()){
		String arr[]=sc.nextLine().split(" ");
		for(int i=0;i<arr.length;i++){
			if(index++%5==0)
				res+=arr[i].toUpperCase().charAt(0);
		}
	}
	System.out.println(res);
}	
}
