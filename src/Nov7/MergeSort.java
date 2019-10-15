package Nov7;

class MergeSort { 
	  
    static void mergeSort(int arr[]) 
    { 
          
        int currentSize;  
        int n=arr.length;
        int left; 
                          
          
       
        for (currentSize = 1; currentSize <= n-1;  
                      currentSize = 2*currentSize) 
        { 
              
            
            for (left = 0; left < n-1; 
                        left += 2*currentSize) 
            { 
                int mid = left + currentSize - 1; 
          
                int right = Math.min(left  
                             + 2*currentSize - 1, n-1); 
                // merging the array into single array
                mergerArrays(arr, left, mid, right); 
            } 
        } 
    } 
      
    // merge 2 arrays into single array
    static void mergerArrays(int arr[], int l, int m, int r) 
    { 
        int i, j, k; 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        
        // temp arrays for swaping
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
      
        for (i = 0; i < n1; i++) 
            L[i] = arr[l + i]; 
        for (j = 0; j < n2; j++) 
            R[j] = arr[m + 1+ j]; 
      
       
        i = 0; 
        j = 0; 
        k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
      
      
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
      
        // Copy the remaining elements 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
      
    /* Function to print an array */
    static void displayArray(int A[]) 
    { 
    	int size = A.length;
        int i; 
        for (i=0; i < size; i++) 
            System.out.printf("%d ", A[i]); 
        System.out.printf("\n"); 
    } 
      
    public static void main(String[] args) 
    { 
        int arr[] = {6,3,5,1,8,10,32,21}; 
        int n = arr.length; 
      
        System.out.printf("Given array is \n"); 
        displayArray(arr); 
      
        mergeSort(arr); 
      
        System.out.printf("\nSorted array is \n"); 
        displayArray(arr); 
    } 
} 
  

