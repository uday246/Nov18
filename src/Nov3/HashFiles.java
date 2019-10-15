package Nov3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class HashFiles {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("words.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("HashValuesAnswers.txt"));
		String line = br.readLine();
		int i = 0;
		while (line != null) {

			int hash = (int) line.charAt(0) + (int) line.charAt(1);
			hash = hash % 121;
			String temp = i + " " + line + " " + hash;
			System.out.println(temp);
			i++;
			pw.println(temp);
			line = br.readLine();
		}
		pw.flush();
		pw.close();
		br.close();
	}
}
