package Nov13;

import java.io.BufferedReader;
import java.io.FileReader;

class Reader extends Thread {
	private String name;

	public Reader(String aName) {
		super();
		name = aName;
	}

	public void run() {
		try {
			System.out.println("Processing : " + name);
			BufferedReader br = new BufferedReader(new FileReader(name));
			String line = br.readLine();
			int count = 0;
			while (line != null) {
				String temp[] = line.split(" ");
				if (temp != null)
					count += temp.length;
				line = br.readLine();
			}
			System.out.println(name + " : " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class MutlitFileReader {
	public static void main(String[] args) {
		Reader r1 = new Reader("file1.txt");
		Reader r2 = new Reader("file2.txt");
		Reader r3 = new Reader("file3.txt");
		Reader r4 = new Reader("file4.txt");
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		System.out.println("Done in main");
	}
}
