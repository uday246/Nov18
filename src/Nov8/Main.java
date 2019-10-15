package Nov8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	/**
	 * Iterate through each line of input.
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int number = 0;
		int numberOfParagraph = 0;
		int numberOfSequence = 0;
		char ch;
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		String line;
		// String str = new String;
		// String [] temp;
		while ((line = in.readLine()) != null) {

			numberOfParagraph++;
			String str = new String(line);
			if(line.trim().length()==0)
				break;
			String[] temp = str.split(" ");

			if (numberOfParagraph < 1 || numberOfParagraph > 400) {
				break;
			}
			for (int index = 0; index < temp.length; index++) {
				
				number = Integer.parseInt(temp[index]);
				// number = line.parseInt(line);
				// ch = line.charAt(index);
				// number = ch - '0';
				if (number > 0 && number < 99) {
					// continue;
					// }
					if (!map.containsKey(number)) {
						map.put(number, 1);
					} else {
						numberOfSequence = map.get(number)+1;
						map.put(number, numberOfSequence);
					}
				}
			}
			// System.out.println(line);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getValue() + " " + entry.getKey()+" ");
		}
	}
}
