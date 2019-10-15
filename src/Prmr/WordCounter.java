package Prmr;

import java.util.HashMap;

public class WordCounter {
	public static HashMap<String, Integer> countWords(String line) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String arr[] = line.split(" ");
		for (String s : arr) {
			int count = 1;
			if (map.containsKey(s)) {
				count = map.get(s) + 1;
			}
			map.put(s, count);
		}

		return map;
	}
	public static void main(String[] args) {
		String line="Hello Good mrining Hello";
		System.out.println(countWords(line));
	}
}
