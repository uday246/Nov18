package Nov3;

import java.util.Random;

public class DiceGame {
	public static void main(String[] args) {
		Random r = new Random();
		//rolling dice
		int d1 = r.nextInt(6) + 1;
		int d2 = r.nextInt(6) + 1;
		//finding sum
		int sum = d1 + d2;
		int points=0;
		int i=0;
		while (true) {
			System.out.println("Sum is : " + sum);
			//checking if sum is 11 or 7 in the first throw
			
			if (points==0 && (sum == 7 || sum == 11)) {
				System.out.println("Player losses");
				break;
			}
			//checking if sum is 2 3 12 in the first throw
			if(sum==2|| sum==3||sum==12){
				if(i==0)
				System.out.println("House wins");
				break;
			}
			i++;
			if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
				points=sum;
			}
			d1 = r.nextInt(6) + 1;
			d2 = r.nextInt(6) + 1;
			sum = d1 + d2;
			System.out.println("Player rolled "+d1+"+"+d2+" = "+sum);
		}
	}
}
