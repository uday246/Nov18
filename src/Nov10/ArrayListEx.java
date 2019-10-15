package Nov10;

public class ArrayListEx {
	public static void main(String[] args) {
		/*int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numeric values");
		for (int i = 0; i < 10; i++) {
			list.add(sc.nextInt());
			if (list.get(i) % 2 == 0)
				sum += list.get(i);
		}
		System.out.println("Sum is : " + sum);*/
		for (int i = 1; i < 4; i++) {
			  for (int j = 1; j < 4; j++) {
			    if (i * j > 2) 
			      continue;

			    System.out.println(i * j);
			  }

			  System.out.println(i);
			}  
	}
}
