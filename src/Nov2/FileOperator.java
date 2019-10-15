package Nov2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
class SortByWeight implements Comparator<Term> {

@Override

/*Override the compare method so that you can sort Terms by weight in DESCENDING order*/

public int compare(Term o1, Term o2) {

return -1* o1.getWeight()-o2.getWeight();

}

}
class Term{

	private String str;
	private int weight;
	public Term(int aWeight,String aStr) {
		super();
		str = aStr;
		weight = aWeight;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String aStr) {
		str = aStr;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int aWeight) {
		weight = aWeight;
	}
	@Override
	public String toString() {
		return "Term [str=" + str + ", weight=" + weight + "]";
	}
	
}
public class FileOperator {

/*This method reads the file located in the given file path,

* parses the file content to Term objects,

* stores the terms in an array,

* returns the term array

*/

public Term[] readTerms(String filePath) {

try {

BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));

int fileSize = Integer.parseInt(br.readLine());

Term [] termList = new Term[fileSize];

for (int i = 0; i < fileSize; i++) {

String line = br.readLine().trim();

int weight = Integer.parseInt(line.split("\t")[0]);

String text = line.split("\t")[1];

Term w = new Term(weight, text); //How do you fix this?

termList[i] = w;

}

br.close();

return termList;

} catch (Exception e) {

e.printStackTrace();

}

return new Term [0];

}

}


