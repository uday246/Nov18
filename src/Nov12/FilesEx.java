package Nov12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilesEx {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name");
		String name = sc.nextLine();
		PrintWriter pw = new PrintWriter(new FileWriter(name));
		double temp = 0;
		System.out.println("Enter salaries,-1 to quit");
		while (true) {
			try {
				temp = sc.nextDouble();
				if (temp < 0)
					break;
				pw.println(temp);
			} catch (Exception e) {
				System.out.println("Invalid salary");
			}
		}
		pw.close();
		BufferedReader br = new BufferedReader(new FileReader("ages.txt"));
		String line=br.readLine();
		int count=0;
		int aCount=0;
		double sum=0;
		while(line!=null){
			count++;
			double t= Double.parseDouble(line.split(" ")[1]);
			if(t>0){
				sum+=t;
				aCount++;
			}
			line=br.readLine();
		}
		System.out.printf("Average :%.2f ",(sum/aCount));
		System.out.println("Total number lines read from file : "+count);
		
	}
}
