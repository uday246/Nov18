package Nov14;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		String sample = "This is the final exam, and your score will affect your final grades.";
		String arr[] = sample.split(" ");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < arr.length; i++)
			map.put(i, arr[i]);

		System.out.println(map);
		System.out.println("Size : " + map.size());

	}
}
