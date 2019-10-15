package Nov8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ReadFile {
	int a;
	public static void main(String[] args) {
		
		
		
	
		int a;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("names.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String arr[] = new String[100];
		String line = "";
		int index = 0;
		try {
			while ((line = br.readLine()) != null) {
				arr[index++] = line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < index; i++)
			System.out.println(arr[i]);
	}
}
