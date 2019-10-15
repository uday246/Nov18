package Nov12;

import java.util.Scanner;

public class TestArray {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int arr[]=new int[100];
	int size=readIntoArray(arr,sc);
	System.out.println(size);
	printAboveAverage(arr,size);
}

private static void printAboveAverage(int[] aArr, int size) {
	double sum=0;
	for(int i=0;i<size;i++)
		sum+=aArr[i];
	double avg=sum/size;
	System.out.println("Average : "+avg);
	System.out.println("values above average :");
	for(int i=0;i<size;i++)
		if(aArr[i]>=avg)
			System.out.print(aArr[i]+" ");
}

private static int readIntoArray(int[] aArr, Scanner aSc) {
	int count=0;
	System.out.println("Enter integers, -1 to exit");
	int temp=0;
	while(aSc.hasNext()){
		temp=aSc.nextInt();
		if(temp==-1)
		break;
		aArr[count++]=temp;
	}
	return count;
}
}
