package Nov17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileMul {
	public static void main(String[] args) {
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		PrintWriter pw =null;
		try {
			br1 = new BufferedReader(new FileReader("mul1.txt"));
			br2 = new BufferedReader(new FileReader("mul2.txt"));
			pw=new PrintWriter(new FileWriter("res.txt"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String line1 = br1.readLine();
			String line2 = br2.readLine();
			while (line1 != null && line2 != null) {
				int num1 = Integer.parseInt(line1);
				int num2 = Integer.parseInt(line2);
				int res = num1 * num2;
				pw.println(res);
				line1 = br1.readLine();
				line2 = br2.readLine();
			}
			pw.flush();
			pw.close();
			br1.close();
			br2.close();

		} catch (Exception n) {
		}
		System.out.println("Operation Completed.. Please check results file");
	}
}
