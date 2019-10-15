package Nov11;

import java.util.Random;

public class Die {
	Random r = new Random();
	public Die(){
		
	}
	int roll(){
			return r.nextInt();
	}
	double evenRoll(double numberOfRolls){
		double count=0;
		for(int i=0;i<numberOfRolls;i++)
			if(roll()%2==0)
				count++;
		return count/numberOfRolls;
	}
}
