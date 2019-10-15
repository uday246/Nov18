package Prmr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			double num=Double.parseDouble(br.readLine());
		} catch (NumberFormatException | IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
