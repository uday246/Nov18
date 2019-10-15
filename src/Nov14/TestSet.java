package Nov14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeSet;

public class TestSet {
	private TreeSet<String> lexicon;
	private boolean lexLoaded;

	public static void main(String[] args) {
		TestSet t = new TestSet();
		t.loadLexicon("file1.txt");
		System.out.println(t.lexicon);
	}

	public void loadLexicon(String fileName) {

		if (fileName == null) {

			throw new IllegalArgumentException();
		}

		lexicon = new TreeSet<String>();

		try {
			Scanner s = new Scanner(new BufferedReader(new FileReader(new File(fileName))));
			while (s.hasNext()) {

				String str = s.next();
				boolean added = lexicon.add(str.toUpperCase());
				s.nextLine();
			}

			lexLoaded = true;
		}

		catch (Exception e) {

			throw new IllegalArgumentException("Error loading word list: " + fileName + ": " + e);
		}
	}
}
