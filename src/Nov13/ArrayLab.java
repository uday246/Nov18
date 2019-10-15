package Nov13;

public class ArrayLab { 
	public static void main(String[] args) { 
		int[][] stuff = { {33, 92, 54}, {22, 43, 90}, {26, 85, 21}, {75, 14, 66}, { 8, 49, 89} }; 
		// in all of the below 4 tasks, do not "hard code" the // array dimentions (i.e. "4" or "3") but rather use the // .length property of the array or individual row as // Horstmann does in the CompoundInterest program. 
		// 1. print out the array contents going across the rows 
		// but from the last row to the first: 
		// 8, 49, 89 // 75, 14, 66 // etc..... 
		
		
		for(int i=stuff.length-1;i>=0;i--){
			for(int j=0;j<stuff[i].length;j++)
				System.out.print(stuff[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		// 2. print out the array contents going down the columns // from the first column to the last. in other words: // 33, 22, 26, 75, 8 // 92, 43, 85, 14, 49 // etc.... // 
		for(int i=0;i<stuff[0].length;i++){
			for(int j=0;j<stuff.length;j++)
				System.out.print(stuff[j][i]+" ");
			System.out.println();
		}
		System.out.println();
		//3. print out the array going up the columns, starting // with the last column and last row, and working backwards // to the first column and row. in other words: // 89, 66, 21, 90, 54 // 49, 14, 85, 43, 90 // etc.... // 
		for(int i=stuff[0].length-1;i>=0;i--){
			for(int j=stuff.length-1;j>=0;j--){
				System.out.println(i+" , "+j);
				System.out.print(stuff[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		//4. print out the array contents in "normal" order, // in other words: // 33, 92, 54, // 22, 43, 90 // etc.... } }
	}
}