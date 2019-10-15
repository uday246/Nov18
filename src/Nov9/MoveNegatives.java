package Nov9;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveNegatives {
public static void moveAllNegativeOne(int arr[]){
	for(int i=0;i<arr.length;i++){
		// if ele is -1
		if(arr[i]==-1){
			// left shift all elements, add -1 at the end
			for(int j=i;j<arr.length-1;j++){
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=-1;
		}
	}
}
public static void main(String[] args) {
	int arr[]={6,-1,8,2,3,-1,4,-1,1};
	ArrayList nameList = new ArrayList<>(); nameList.add("Mark"); nameList.add("John"); nameList.add("Patricia"); nameList.set(1, "Mike"); nameList.add("Patty"); nameList.toString();
System.out.println(nameList);

	System.out.println("Input : "+Arrays.toString(arr));
	moveAllNegativeOne(arr);
	System.out.println("Output : "+Arrays.toString(arr));
}
}
