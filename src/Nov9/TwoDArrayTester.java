package Nov9;

public class TwoDArrayTester {
	public static void main(String[] args) {
		// created variables for rows and cols
		int rows = 10, cols = 9;
		// created 2d arrays
		int twoDArray[][] = new int[rows][cols];
		// using nested loop filling the array
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				twoDArray[i][j] = (i + 1) * (j + 1);
		// using nested loop printing the array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				System.out.printf("%4d",twoDArray[i][j]);
			System.out.println();

		}
	}
}
