package Nov11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

class StringStats {
	// variable to hold current line
	private String currentLine;

	// constructor to to initialize the value
	public StringStats(String aCurrentLine) {
		super();
		currentLine = aCurrentLine;
	}

	public String getCurrentLine() {
		return currentLine;
	}

	public void setCurrentLine(String aCurrentLine) {
		currentLine = aCurrentLine;
	}

	// method that returns the words in current line
	public int wordCount() {
		return currentLine.split(" ").length;
	}
}

public class StringStatsDriver {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// reading file name from user
		System.out.println("Enter fileName");
		String name = sc.nextLine();
		// opening the file
		BufferedReader br = new BufferedReader(new FileReader(name));
		// reading the first line
		String line = br.readLine();
		StringStats s = null;
		int words = 0;
		int lines = 0;
		// loop untill reaches end of file
		while (line != null) {
			// if line is not empty
			if (line.trim().length() > 0) {
				// create object for Stringstats
				s = new StringStats(line);
				// getword count for currentline
				words += s.wordCount();
				// increse line count
				lines++;
			}
			line = br.readLine();

		}
		System.out.println("Total Lines = " + lines + " Total Words = " + words);
	}
}
