package Nov1;

public class C4Board {
	public static final int P1 = 1;
	public static final int P2 = 2;
	public static final int P3 = 3;
	public static int CurrentPlayer;

	int[][] board;

	public C4Board(int rows, int cols) {
		if (rows < 4 && cols < 4) {
			throw new IllegalArgumentException("row and cols are smaller than 4");
		}
		board = new int[rows][cols];
		CurrentPlayer = P1;
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				board[row][col] = 0;
			}
		}

	}
public void newGame(){
	CurrentPlayer = P2;
	for (int row = 0; row<board.length; row++) {
		for (int col = 0; col<board[row].length; col++) {
			board[row][col] = 0;
		}
	}
}
}
