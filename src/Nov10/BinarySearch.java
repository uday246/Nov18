package Nov10;

public class BinarySearch {
	public static int binarySearch(int arr[], int l, int r, int x) {

		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x) {
				return mid;
			}
			System.out.print("First : " + l);
			System.out.print(",Last : " + r);
			System.out.print(",Mid : " + arr[mid]);
			System.out.println();

			if (arr[mid] < x)
				return binarySearch(arr, mid + 1, r, x);

			return binarySearch(arr, l, mid - 1, x);
		}
		return -1;
	}

	public static void main(String[] args) {
		int c=0;
		for(int i=0;i<32;i++){
			String s=Integer.toBinaryString(i);
			while(s.length()<=5)
				s="0"+s;
			System.out.println(s);
			if(s.startsWith("0")|| s.endsWith("0"))
				c++;
			
		}
		System.out.println(c);
		/*int arr[] = { 1, 6, 8, 13, 19, 42, 45, 60, 78, 91, 110, 112, 160, 178, 200 };
		Scanner sc = new Scanner(System.in);
		int num = 80;
		int c = 0;
		for (int i = 1; i <= 60; i++) {
			if (i % 2 == 0 || i % 3 == 0)
				c++;
		}
		Queue<Integer> q = new LinkedList<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		Stack<Integer> s = new Stack<Integer>();
		pq.add(10);
		pq.add(3);
		s.push(40);
		s.push(5);
		q.add(4);
		q.add(15);
		
		while(pq.size()>0)
			System.out.println(pq.poll());
		while(q.size()>0)
			System.out.println(q.poll());
		while(s.size()>0)
			System.out.println(s.pop());*/
		
		// System.out.println("Found at :
		// "+binarySearch(arr,0,arr.length-1,num));
	}
}
