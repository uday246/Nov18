package Nov14;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input odd or even");
		String str = sc.nextLine();
		int val = 0;
		// reading input
		if (str.equalsIgnoreCase("odd"))
			val = 1;
		else if (str.equalsIgnoreCase("even"))
			val = 2;
		else {
			System.out.println("Invalid input");
			return;
		}
		int count=0;
		// looping til 50 and increasing by 2 get next odd or even num
		for(;val<=50;val+=2){
			// counter for line break
			count++;
			System.out.printf("%3d",val);
			// break line 
			if(count%5==0)
				System.out.println();
		}

	}
}
