package Nov15;

import java.util.Scanner;

public class Query {
	public static void main(String[] args) {
		String str = "first=Mike&last=Jones&id=mike1&password=hello";
		Scanner sc = new Scanner(str);
		sc.useDelimiter("&");
		while (sc.hasNext()) {
			String line = sc.next();
			System.out.println(line.split("=")[0] + ": " + line.split("=")[1]);
		}

	}
}
