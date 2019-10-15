package Nov7;

public class OptimizedBubbleSort {
    static void sort(int [] arrA){
        if(arrA==null || arrA.length==0)
            return;

        System.out.println("Original Array: " );
        for(int i=0;i<arrA.length;i++)
        	System.out.print(arrA[i]+" ");
        System.out.println();
        boolean swaped;
        int size = arrA.length;
        for (int i = 0; i <size-1 ; i++) {
            swaped = false;
            for (int j = 0; j <size-i-1 ; j++) {
                //check the adjacent elements
                if(arrA[j]>arrA[j+1]){
                    //swap the elements
                    int temp = arrA[j];
                    arrA[j] = arrA[j+1];
                    arrA[j+1] = temp;
                    swaped = true;
                }
            }
            if(swaped==false)
                break;
        }
        System.out.println("Sorted Array: ");
        for(int i=0;i<arrA.length;i++)
        	System.out.print(arrA[i]+" ");
        System.out.println();
        
    }

    public static void main(String[] args) {
        int [] arrA = {65, 14, 52, 43, 75, 25, 80, 90, 95,11};
        sort(arrA);
    }
}
