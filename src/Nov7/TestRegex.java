package Nov7;

public class TestRegex {
public static void main(String[] args) {
	cleanDictionaryEntry("Run(verb): to go faster than a walk");
}
public static String cleanDictionaryEntry(String entry)

{

    String regex = "([^()])" ;


    entry = entry.replaceAll("\\(.*?\\)", "");
    System.out.println(entry);
    
    return entry;
   

}


}
