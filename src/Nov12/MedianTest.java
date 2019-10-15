package Nov12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MedianTest {
	public static void main(String[] args) {
		int arr[]=getArray();
		int temp[]=new int[5];
		for(int i=0;i<5;i++)
			temp[i]=arr[i];
		Arrays.sort(temp);
		Scanner sc = new Scanner(System.in);
		int guess;
		int median=temp[temp.length/2];
		String ch="";
		while(true){
			System.out.print("What is the median of these numbers: ");
			for(int i=0;i<5;i++)
				System.out.print(arr[i]+" ");
			guess=sc.nextInt();
			if(guess==median){
				System.out.println("You Correct... Do you want play again [Y/N]");
				sc.nextLine();
				ch=sc.nextLine();
				if(ch.equalsIgnoreCase("y")){
					arr=getArray();
					temp=new int[5];
					for(int i=0;i<5;i++)
						temp[i]=arr[i];
					Arrays.sort(temp);
					 median=temp[temp.length/2];
				}
				else{
					break;
				}
				
			}
			else{
				System.out.println("Your answer is not correct.Do you want to see the answer (Y/N): ");
				sc.nextLine();
				ch=sc.nextLine();
				if(ch.equalsIgnoreCase("Y")){
					
					System.out.println("Correct Answer is : "+median);
					arr=getArray();
					temp=new int[5];
					for(int i=0;i<5;i++)
						temp[i]=arr[i];
					Arrays.sort(temp);
					 median=temp[temp.length/2];
				}
			}
			
		}
	}

	private static int[] getArray() {
		Random r = new Random();
		int arr[]=new int [100];
		int res[]=new int [5];
		
		int temp=0;
		for(int i=0;i<5;){
			temp=r.nextInt(90)+10;
			if(arr[temp]==0){
				res[i++]=temp;
				arr[temp]=1;
			}
		}
		return res;
	}
}
