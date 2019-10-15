package Nov12;

public class TestRep {
public static void main(String[] args) {
	String str="Hello\nWorld";
	System.out.println(str);
	str=str.replaceAll("\n", "<br>");
	System.out.println(str);
}
}
