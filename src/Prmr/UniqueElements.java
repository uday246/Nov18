package Prmr;

import java.util.Scanner;

public class UniqueElements {

public static void main(String args[]) {

int arr[]= new int [10];

Scanner input = new Scanner (System.in);

int i;

System.out.print("Enter 10 integers : ");

for (i=0;i<10;i++)

{

arr[i] = input.nextInt();

}

System.out.println();

// your code goes here. you may use functions to help you keep

	for(i=0;i<10;i++){
		boolean flag=true;
		for(int j=0;j<i;j++){
			if(i!=j && arr[i]==arr[j]){
				flag=false;
				break;
			}
		}
		if(flag)
		System.out.print(arr[i]+" ");
	}

// but it is not a requirement for this assignment.

}

}
