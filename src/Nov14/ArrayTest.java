package Nov14;

import java.util.Random;

public class ArrayTest {
	public static void main(String[] args) {
		int arr[] = new int[10];
		Random r = new Random();
		for (int i = 0; i < 10; i++)
			arr[i] = r.nextInt(10);
		for (int i = 0; i < 10; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		double avg = 0, sum = 0;
		;
		for (int i = 0; i < 10; i++)
			sum += arr[i];
		avg = sum / 10;
		System.out.println("Sum : " + sum);
		System.out.println("Avg : " + avg);
		
		int ele=5,flag=-1;
		for(int i=0;i<10;i++)
			if(arr[i]==ele)
			{
				System.out.println(ele+"  found");
				flag=1;
				break;
			}
		if(flag==-1)
			System.out.println(ele+"  not found");
		
	}
}
