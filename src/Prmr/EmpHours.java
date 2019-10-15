package Prmr;

import java.util.Random;

public class EmpHours {
	public static void main(String[] args) {
		int grades[][] = new int[4][4];
		Random r = new Random();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				grades[i][j] = r.nextInt(101);
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				System.out.print(grades[i][j] + " ");
			System.out.println();
		}
		minMaxAvg(grades);

	}

	private static void minMaxAvg(int[][] grades) {
		double sum=0;
		int min=1000,max=-1;
		// iterating through grades to find min and max and avg of grades
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++){
				sum+=grades[i][j];
				if(min>grades[i][j])
					min=grades[i][j];
				if(max<grades[i][j])
					max=grades[i][j];
			}
				
		}
		System.out.println("Highest grade in class : "+max);
		System.out.println("Lowest grade in class : "+min);
		System.out.println("Avg grade in class : "+(sum/16));
		

	}
}
