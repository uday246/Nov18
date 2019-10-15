package Nov9;

class BinarySearch {
	public static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x) {
				return mid;
			}

			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

}

public class TestBS {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 7, 8, 12, 19, 23, 45, 59, 62, 69, 75 };
		int ele = 19;
		int res = BinarySearch.binarySearch(arr, 0, arr.length - 1, ele);
		if (res == -1)
			System.out.println("Element does not exist");
		else
			System.out.println("Element found at : " + res);
	}
}
