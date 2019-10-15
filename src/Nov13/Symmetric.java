package Nov13;

public class Symmetric {


	static void transpose(int mat[][], int tr[][], int N) {
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				tr[i][j] = mat[j][i];
	}

	static boolean isSymmetric(int mat[][], int N) {
		int tr[][] = new int[N][N];
		transpose(mat, tr, N);
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (mat[i][j] != tr[i][j])
					return false;
		return true;
	}

	public static void main(String[] args) {
		
		for(int i=1;i<=83;i++){
			if(i%7==0 && i%5==0)
				System.out.print(i+" ");
			else if(i%7==0)
				System.out.print(0+" ");
			else
				System.out.print("NULL ");
				
		}
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix");
		int size = sc.nextInt();
		int arr[][] = new int[size][size];
		System.out.println("Enter "+(size*size)+" Elements into matrix");
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				arr[i][j]=sc.nextInt();
			}	
		}
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(arr[i][j]+" ");
			}	
			System.out.println();
		}
		
		if (isSymmetric(arr, size))
			System.out.println("Given Matrix is symmatric");
		else
			System.out.println("Given Matrix is not asymmatric");
*/
	}
}
