package Nov2;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = "";
		do {
			double avg = getAverage(sc);
			System.out.println("The average is : " + avg);
			System.out.println("Do you want to compute another average");
			sc.nextLine();
			ch=sc.nextLine();
		} while (!ch.equalsIgnoreCase("N"));
	}

	private static double getAverage(Scanner aSc) {
		double sum = 0;
		int count = 0;
				double num = 0;
		System.out.println("Enter a stream of non negative numbers,(negative number when finished) ");
		while (true) {
			try{
			num = aSc.nextDouble();
			if (num < 0)
				break;
			sum += num;
			count++;
			}
			catch(Exception e){
				return 0;
			}
		}
		return sum / count;
	}
}
