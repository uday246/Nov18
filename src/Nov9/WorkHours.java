package Nov9;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class WorkHours {
	public static void main(String[] args) throws Exception {
		Scanner br = new Scanner(new File("input.txt"));
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		String line = "";
		while (br.hasNext()) {
			line = br.nextLine();
			String arr[] = line.split(" ");
			map.put(arr[0].trim(), Arrays.asList(arr));
		}
		int ch = 1;
		while (ch == 1) {
			System.out.println("Enter Id");
			Scanner sc = new Scanner(System.in);
			String id = sc.nextLine();
			List<String> l = map.get(id);
			double sum = 0;
			int i = 0;
			int count = 0;
			for (i = 2; i < l.size(); i++) {
				sum = sum + Double.parseDouble(l.get(i));
				count++;
			}

			System.out.printf(l.get(1) + " worked %.2f hours (",sum);
			System.out.printf("%.2f hours/day)", (sum / count));
			System.out.println("\nDo you want to continue press 1\n");
			ch = sc.nextInt();
		}
	}
}
