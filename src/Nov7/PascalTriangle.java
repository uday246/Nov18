package Nov7;

public class PascalTriangle {

	public static void main(String[] args) {
		int rows=Integer.parseInt(args[0]);
		for (int i = 0; i < rows; i++) {
			int number = 1;
			//printing the space
			System.out.printf("%" + (rows - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				//printing the numbers
				System.out.printf("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
