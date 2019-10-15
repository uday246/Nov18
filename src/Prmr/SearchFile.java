package Prmr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchFile {
public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(new File("bigFile.txt"));
		if(search(sc, 10))
			System.out.println("Element exist");
		else
			System.out.println("Element does not exist");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static boolean search(Scanner sc,int num){
	while(sc.hasNext()){
		if(sc.nextInt()==num)
			return true;
	}
	sc.close();
	return false;
}
}
