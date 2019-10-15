#include<stdio.h> 

  
void bubbleSort(int arr[], int n) 
{ 
   int i, j,temp; 
   for (i = 0; i < n-1; i++)       
       for (j = 0; j < n-i-1; j++)  
           if (arr[j] < arr[j+1]){
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
}   


int main() 
{ 
    int arr[] = {72,13 ,31, 20, 28, 59, 87, 21, 51, 32}; 
    int n = 10,i;
    printf("Before sort : \n");
    for (i=0; i < n; i++) 
        printf("%d ", arr[i]); 
    bubbleSort(arr,n);
    printf("\nAfter sort : \n");
    
    for (i=0; i < n; i++) 
        printf("%d ", arr[i]); 
    return 0; 
} 