package Nov16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArrayListFile {
	ArrayList<String>namesList=new ArrayList<String>();
	public void readData() throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("names.txt"));
		String line=br.readLine();
		while(line!=null){
			namesList.add(line);
			line=br.readLine();
		}
	}
	public void writeData() throws Exception{
		PrintWriter br = new PrintWriter(new FileWriter("names.txt"));
		for(String line:namesList){
			br.println(line);
		}
		br.flush();
		br.close();
	}
	
	public void displayData(){
		for(String s:namesList)
			System.out.println(s);
	}
	public boolean search(String s){
		return namesList.contains(s);
	}
}
