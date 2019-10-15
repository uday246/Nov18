package Nov20;

import java.util.ArrayList;
import java.util.Random;

public class StreamTest {

	public static void main(String[] args) {

 ArrayList<Integer> int_arr = new ArrayList<>();
 Random randomGenerator = new Random();
 int t = randomGenerator.nextInt(10);
 int i=0;
 while(i < randomGenerator.nextInt(1000)){
 int_arr.add(randomGenerator.nextInt(10));
 i++;
 }
 	for(Integer in:int_arr){
 		System.out.println(in);
 	}
 }
}