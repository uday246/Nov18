package Nov13;

public class BinaryNumbers {

	public static void main(String[] args) {
		printBinaryStrings(4);
	}
	public static void printBinaryStrings(int n)    
	{         
		double num=Math.pow(2,n);
	  for(int i = 0; i < num; i++)         
	  {    
	    String format="%0"+n+"d";
	    System.out.printf(format,Integer.valueOf(Integer.toBinaryString(i)));
	    System.out.println();
	  }
	}
}
