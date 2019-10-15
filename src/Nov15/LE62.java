package Nov15;

import java.util.Scanner;

class SportsTeams {
	int size;

	public SportsTeams() {
	}

	public SportsTeams(int n) {
		size = n;
	}

	Scanner input = new Scanner(System.in);

	public int arraySize() {

		System.out.printf("How many sports are you interested in? ");
		int n = input.nextInt();
		input.nextLine();
		return n;
	} // end method arraySize()

	public String[] setFavoriteSports() {

		String sport[] = new String[size];
		System.out.printf("Enter sport: ");
		for (int i = 0; i < size; i++) {
			System.out.printf("Enter sport: #%d. ", i + 1);
			sport[i] = input.nextLine();
		} // end for loop
		return sport;
	} // end method setFavoriteSports

	public String[] setFavoriteTeams(String sports[]) {

		String teams[] = new String[size];

		for (int i = 0; i < size; i++) {
			System.out.printf("Enter favorite teams for %s : ", sports[i]);
			System.out.printf("%d. ", i + 1);
			teams[i] = input.nextLine();
		} // end for loop
		return teams;
	} // end method setFavoriteTeams

	public int[] setLastChampionship(String teams[]) {
		int years[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.printf("Enters the year of last championship year for %s: ", teams[i]);
			System.out.printf("%d. ", i + 1);
			years[i] = input.nextInt();

		} // end for loop
		return years;
	} // end method setLastChampionship

	public void printSportsTeams(String sports[], String teams[], int years[]) {

		for (int i = 0; i < size; i++) {
			System.out.printf("Sport: %s ", sports[i]);
			System.out.printf("Team: %s ", teams[i]);
			System.out.printf("Last championship: %d ", years[i]);

		} // end for loop

	} // end method printSportsTeams

}

public class LE62 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		SportsTeams sp = new SportsTeams();
		sp.size = sp.arraySize();

		String sport[] = new String[sp.size];
		String teams[] = new String[sp.size];
		int year[] = new int[sp.size];

		sport = sp.setFavoriteSports();
		teams = sp.setFavoriteTeams(sport);
		year = sp.setLastChampionship(teams);

		sp.printSportsTeams(sport, teams, year);

	} // end method main

}
