package Nov14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CityTemps {
	public static void main(String[] args) throws Exception {
		String inputFileName = "celsius.txt";
		String outputFileName = "fahrenheit.txt";

		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		PrintWriter pw = new PrintWriter(new FileWriter(outputFileName));
		String line=br.readLine();
		
		while(line!=null){
			String arr[]=line.split(" ");
			String month=arr[0];
			double temp=Double.parseDouble(arr[1]);
			temp=9/5 * temp+32;
			pw.println(month+" "+temp);
			line=br.readLine();
			
		}
		pw.flush();
		pw.close();
		br.close();
		
		// TODO: Open the input and output files.
		// Read records from the input file.
		// Calculate the temperature in Fahrenheit.
		// Write each line to the output file with the temperature
		// in Fahrenheit.
	}
}
