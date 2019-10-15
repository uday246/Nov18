package Nov10;

import java.util.Scanner;

public class PalindromeTester {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();// take string input here

							// not.
		// check whether the string input s is palindrome or
		if(checkPalindrome(s)){
			System.out.println(s+" is Palindrome");
			
		}
		else{
			System.out.println(s+" is not a Palindrome");
			
		}
	}

	public static boolean checkPalindrome(String str) {

		int left = 0;
		int right = str.length() - 1;
		char arr[]=str.toCharArray();
		while (arr[left] == arr[right] && left <= right) {
			left++;
			right--;
		}

		return left > right;
	}
}
