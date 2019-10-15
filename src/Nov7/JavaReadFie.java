package Nov7;

import java.io.BufferedReader;
import java.io.FileReader;

public class JavaReadFie {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		String line = br.readLine();
		while (line != null) {
			// iterating through each line and check if the string is starting with char print string from there using substring
			for (int i = 0; i < line.length(); i++)
				// if it is char than print string from here
				if (Character.isAlphabetic(line.charAt(i))) {
					System.out.println(line.substring(i));
				}
			line = br.readLine();
		}
	}
}
