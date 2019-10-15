package Nov14;

import java.util.Scanner;

class CharacterAnalyser{
	private char theChar;
	public CharacterAnalyser(){
		
	}
	public CharacterAnalyser(char c){
		theChar=c;
	}
	public void setChar(char c){
		theChar=c;
	}
	public char getChar(){
		return theChar;
	}
	public boolean isUpper(){
		return Character.isUpperCase(theChar);
	}
	public boolean isLower(){
		return Character.isLowerCase(theChar);
	}
	public boolean isNumber(){
		return Character.isDigit(theChar);
	}
	
	public int getASCII(){
		return Character.getNumericValue(theChar);
	}
	public String toString(){
		if(isLower())
			return getChar()+" is a lowercase character. ASCII = "+getASCII();
		if(isUpper())
			return getChar()+" is a uppercase character. ASCII = "+getASCII();
			return getChar()+" is a number character. ASCII = "+getASCII();
	}
}
public class CharacterRunner {
public static void main(String[] args) {
	CharacterAnalyser ch = new   CharacterAnalyser();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a letter");
	ch= new CharacterAnalyser(sc.nextLine().charAt(0));
	System.out.println(ch);
	
	System.out.println("Enter a letter");
	ch= new CharacterAnalyser(sc.nextLine().charAt(0));
	System.out.println(ch);
	
	System.out.println("Enter a letter");
	ch= new CharacterAnalyser(sc.nextLine().charAt(0));
	System.out.println(ch);
	
}
}
