package Nov7;

import java.io.File;
import java.util.Scanner;

public class SearchFile {
public static boolean search(File file,String filename) {
		File f[] = file.listFiles();
		if (f == null || f.length == 0) {
			
			return false;
		}
		for (int i = 0; i < f.length; i++) {
			
				if(f[i].getName().contains(filename)){
					return true;
			 }
		}
		
		return false;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String filename=sc.nextLine();
		String path=sc.nextLine();
		File fpath=new File(path);
		boolean result=search(fpath,filename);
		if(result){
			System.out.println(filename+ " Exist in given directory");
		}
		else{
			System.out.println(filename+ " does not exist in given directory");
				
		}

	}

}
