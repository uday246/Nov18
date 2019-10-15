package Prmr;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class Sample {
	public static void main(String[] args) {
	}

	  public static String selectResponse(Random rand, ArrayList responseList) {
		  int index = rand.nextInt(responseList.size()-1); // generating the random for array list
		  
	        return (String)responseList.get(index); // returning the valud from the arraylist
	    }
	/**
	         * Creates a file with the given name, and fills that file
	         * line-by-line with the tracked conversation. Every line ends
	         * with a newline. Throws an IOException if a writing error occurs.
	         * 
	         * @param dialog the complete conversation
	         * @param fileName The file in which to write the conversation
	         * @throws IOException
	         */
	        public static void saveDialog(ArrayList dialog, String fileName) throws IOException {
	        			PrintWriter pw= new PrintWriter(new FileWriter(fileName)); // opening the file
	        			// iterating the arraylist
	        			for(Object o:dialog){
	        				// converting it into string
	        				String str=(String)o;
	        				// writing it into file
	        				pw.println(str);
	        			}
	        			pw.flush();
	        			pw.close();
	        }
}
