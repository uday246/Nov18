package Nov3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlympicGameResults {
	static String[] countries = { "India", "Nigeria", "North Korea", "Japan", "Ghana", "Russia", "South Korea", };

	static int[][] counts = { { 0, 4, 0 }, { 0, 0, 1 }, { 0, 0, 1 }, { 1, 0, 0 }, { 0, 0, 1 }, { 0, 1, 0 }, { 0, 1, 0 },

	};

	public static String[] getCountries() {
		return countries;
	}

	public static int getGoldMedal(String str) {
		for(int i=0;i<countries.length;i++){
			if(countries[i].equalsIgnoreCase(str)){
				return counts[i][0];
			}
		}
		return 0;
	}

	public static int getSilverMedal(String str) {
		for(int i=0;i<countries.length;i++){
			if(countries[i].equalsIgnoreCase(str)){
				return counts[i][1];
			}
		}
		return 0;
	}

	public static int getBronzeMedal(String str) {
		for(int i=0;i<countries.length;i++){
			if(countries[i].equalsIgnoreCase(str)){
				return counts[i][2];
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		final int COUNTRIES = 7;
		final int MEDALS = 3;

		System.out.println("        Country    Gold Silver Bronze   Total");

		// Print countries, counts, and row totals
		for (int i = 0; i < COUNTRIES; i++) {
			// Process the ith row
			System.out.printf("%15s", countries[i]);

			int total = 0;

			// Print each row element and update the row total
				System.out.printf("%8d", getGoldMedal(countries[i]));
				System.out.printf("%8d", getSilverMedal(countries[i]));
				System.out.printf("%8d", getBronzeMedal(countries[i]));
				
				total = total + getGoldMedal(countries[i]);
				total = total + getSilverMedal(countries[i]);
				total = total + getBronzeMedal(countries[i]);

			// Display the row total and print a new line
			System.out.printf("%8d\n", total);
		}
	}
}
class MyAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent aE) {
		// TODO Auto-generated method stub
		
	}
	
}