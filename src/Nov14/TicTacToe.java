package Nov14;

import java.util.Scanner;

class TicTac {

	char a[][];
	int end = 0;
	int inputArray = 0;
	String sk;

	TicTac() {
		a = new char[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				sk = "" + (++inputArray);
				a[i][j] = sk.charAt(0);
			}
	}

	void player(int i, char c, int val) {
		switch (i) {
		case 1:
			a[0][0] = c;
			checking(val);
			printValues();
			break;
		case 2:
			a[0][1] = c;
			checking(val);
			printValues();
			break;
		case 3:
			a[0][2] = c;
			checking(1);
			printValues();
			break;
		case 4:
			a[1][0] = c;
			checking(val);
			printValues();
			break;
		case 5:
			a[1][1] = c;
			checking(val);
			printValues();
			break;
		case 6:
			a[1][2] = c;
			checking(val);
			printValues();
			break;
		case 7:
			a[2][0] = c;
			checking(val);
			printValues();
			break;
		case 8:
			a[2][1] = c;
			checking(val);
			printValues();
			break;
		case 9:
			a[2][2] = c;
			checking(val);
			printValues();
			break;
		}
	}

	void checking(int x) {
		int inc = 0;
		if (x == 1) {
			for (int i = 0; i <= 2; i++) {
				for (int j = 0; j <= 2; j++) {
					if (a[i][j] == 'X') {
						inc++;
					}
				}
				if (inc == 3) {
					System.out.println("player 1 win");
					printValues();
					System.exit(0);
				} else {
					inc = 0;
				}
			}
			for (int i = 0; i <= 2; i++) {
				for (int j = 0; j <= 2; j++) {
					if (a[j][i] == 'X') {
						inc++;
					}
				}
				if (inc == 3) {
					System.out.println("player 1 win");
					printValues();
					System.exit(0);
				} else {
					inc = 0;
				}
			}
			if (a[0][0] == 'X' && a[1][1] == 'X' && a[2][2] == 'X'
					|| a[0][2] == 'X' && a[1][1] == 'X' && a[2][0] == 'X') {
				System.out.println("player 1 win");
				printValues();
				System.exit(0);
			}
		} else {
			for (int i = 0; i <= 2; i++) {
				for (int j = 0; j <= 2; j++) {
					if (a[i][j] == 'O') {
						inc++;
					}
				}
				if (inc == 3) {
					System.out.println("player 2 win");
					printValues();
					System.exit(0);
				} else {
					inc = 0;
				}
			}
			for (int i = 0; i <= 2; i++) {
				for (int j = 0; j <= 2; j++) {
					if (a[j][i] == 'O') {
						inc++;
					}
				}
				if (inc == 3) {
					System.out.println("player 2 win");
					printValues();
					System.exit(0);
				} else {
					inc = 0;
				}
			}
			if (a[0][0] == 'O' && a[1][1] == 'O' && a[2][2] == 'O'
					|| a[0][2] == 'O' && a[1][1] == 'O' && a[2][0] == 'O') {
				System.out.println("player 2 win");
				printValues();
				System.exit(0);
			}
		}
	}

	void printValues() {
		System.out.println("\t==================");
		for (int i = 0; i < 3; i++) {
			System.out.print("\t|");
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

public class TicTacToe {
	static {
		System.out.println("\t==================");
		System.out.println("\t|1\t2\t3|");
		System.out.println("\t==================");
		System.out.println("\t|4\t5\t6|");
		System.out.println("\t==================");
		System.out.println("\t|7\t8\t9|");
		System.out.println("\t==================");
	}

	public static void main(String args[]) {
		TicTac t = new TicTac();
		int j, k = 0;
		int a[] = new int[9];
		Scanner sc = new Scanner(System.in);
		System.out.println("player 1 choice");
		j = sc.nextInt();
		a[0] = j;
		t.player(j, 'X', 1);
		for (int i = 2; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.println("player 1 choice");
				j = sc.nextInt();
				if (j > 9) {
					System.out.println("you choosed wrong location");
					i--;
					continue;
				}

				for (int x : a) {
					if (x == j) {
						System.out.println("location already filled");
						i--;
						k = 1;
						break;
					}
				}
				if (k == 1) {
					k = 0;
					continue;
				} else {
					a[i - 1] = j;
					t.player(j, 'X', 1);
				}
			} else {
				System.out.println("player 2 choice");
				j = sc.nextInt();
				if (j > 9) {
					System.out.println("you choosed wrong location");
					i--;
					continue;
				}
				for (int x : a) {
					if (x == j) {
						System.out.println("location already filled");
						i--;
						k = 1;
						break;
					}
				}
				if (k == 1) {
					k = 0;
					continue;
				} else {
					a[i - 1] = j;
					t.player(j, 'O', 2);
				}
			}
		}

		System.out.println("draw match");
	}
}
