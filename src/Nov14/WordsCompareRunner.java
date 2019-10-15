package Nov14;
class WordsCompare{
	private String wordOne,wordTwo;
	private int compare;
	public WordsCompare(){
		
	}
	public WordsCompare(String s1,String s2){
		wordOne=s1;
		wordTwo=s2;
	}
	public void compare(){
		compare=wordOne.compareTo(wordTwo);
	}
	public String toString(){
		if(compare<0)
			return wordOne+" should be placed before "+wordTwo;
		else
			return wordOne+" should be placed after  "+wordTwo;
		
	}
}
public class WordsCompareRunner {
public static void main(String[] args) {
	WordsCompare wc = new WordsCompare("abe","ape");
	wc.compare();
	System.out.println(wc);
	wc = new WordsCompare("one","tow");
	wc.compare();
	System.out.println(wc);
	wc = new WordsCompare("123","19");
	wc.compare();
	System.out.println(wc);
	
	
}
}
