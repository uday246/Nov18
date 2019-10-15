package Nov12;

import java.util.Scanner;

public class NumberSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter number for array  index " + i + " : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter number to search");
		int ele = sc.nextInt();
		System.out.println(isMember(arr,ele));
	}

	private static boolean isMember(int[] arr, int ele) {
		return isMember(arr,ele,0,false);
	}

	private static boolean isMember(int[] aArr, int aEle, int aI,boolean f) {
		
		if(aArr.length==aI)
			return f;
		if(aArr[aI]==aEle){
			f=true;
		}
		
		isMember(aArr, aEle,aI+1,f);
		return f;
	}
}
