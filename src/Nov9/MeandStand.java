package Nov9;

import java.util.Scanner;

public class MeandStand {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start and end range");
		int start = sc.nextInt();
		int end = sc.nextInt();

		double sum = 0;
		double mean, sta;
		for (int i = start; i <= end; i++)
			sum += i;
		int count=end-start+1;
		mean = sum / count;
		sum = 0;
		for (int i = start; i <= end; i++)
			sum += (mean - i) * (mean - i);
		
		sta = Math.sqrt(sum);
		System.out.printf("Mean : %.2f" , mean);
		System.out.printf("\nStandr deviation : %.2f" , sta);
	}
}
