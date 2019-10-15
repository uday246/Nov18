package Nov13;

public class StudentScores {
	public static void main(String[] args) {
		final int SCORES_SIZE = 4;
		int[] oldScores = new int[SCORES_SIZE];
		int[] newScores = new int[SCORES_SIZE];
		int i;

		oldScores[0] = 10;
		oldScores[1] = 20;
		oldScores[2] = 30;
		oldScores[3] = 40;

		/* Your solution goes here */
		int j = 0;
		int temp = oldScores[0];
		for (j = oldScores.length - 2, i = oldScores.length - 1; i > 0; i--) {
			newScores[j--] = oldScores[i];
		}
		newScores[newScores.length - 1] = temp;

		for (i = 0; i < newScores.length; ++i) {
			System.out.print(newScores[i] + " ");
		}
		System.out.println();
	}
}
