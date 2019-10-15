package Nov20;

public class SplitArray {
	public static double[] split(int arr[]) {
		double res[] = new double[arr.length * 2];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				res[j++] = arr[i] / 2;
				res[j++] = arr[i] / 2;
			} else {
				res[j++] = arr[i] / 2;
				res[j++] = arr[i] / 2 + 1;

			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]={-62, 3, 21, 48};
		double res[]=split(arr);
		for(double d:res){
			System.out.print(d+" ");
		}
	}
}
