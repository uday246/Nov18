package Nov16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileT {

	static class Main {

		public static void main(String args[]) throws IOException, FileNotFoundException {

			Scanner scann = new Scanner(System.in);

			System.out.println("Enter the file name: ");

			// Reading the filename from user

			String fileName = scann.next();
			if (fileName.contains(".txt")) {

				System.out.println("Correct form of file name.");

			}

			else {

				System.out.print("Invalid extension.");
				return;

			}

			// Initializing bufferedReader for reading the data from a file

			BufferedReader br = null;

			br = new BufferedReader(new FileReader(new File(fileName)));

			String tem = "";

			// Keep reading all the lines of data

			

			while ((tem = br.readLine()) != null) {

				// Split the string read

				String[] w = tem.split(" ");

				String answer = "";

				int i = 0;

				for (int i1 = 0; i1 < w.length; i1++) {

					if (i++ % 5 == 0)

						answer += w[i1].toUpperCase().charAt(0);

				}

				System.out.println(answer);

			}

		}

	}

}
