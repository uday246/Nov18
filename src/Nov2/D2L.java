package Nov2;

public class D2L {
	public static void main(String[] args) {
		System.out.println("11.59 : "+Round(11.59));
		System.out.println("Hello,hello are same : "+equals("Hello", "hello"));
		System.out.println("Good,Good are same : "+equals("Good", "Good"));
	}

	public static int Round(double d) {
		return (int) (d + 0.5);
	}

	public static boolean equals(String str1, String str2) {

		for (int i = 0; i < str1.length() && i < str2.length(); i++) {
			
			if ((str1.charAt(i) != str2.charAt(i)))
				return false;
		}
		return true;
	}
}
