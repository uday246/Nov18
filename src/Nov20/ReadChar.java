package Nov20;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadChar {
	public static void main(String[] args) throws Exception {
		
		FileReader fr = null;
		try{
			fr=new FileReader("input.txt");
		}
		catch(Exception e){
			System.out.println("Unable to find the file");
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null){
			System.out.println(line);
			line=br.readLine();
		}
		
	}
}
