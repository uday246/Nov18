/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;
// linearSearch algorithams
int linearSearchBench(int arr[],int n,int ele){
    int i=0;
    for(;i<n;i++){
        if(arr[i]==ele)
            return i+1;
    }
    return -1;
}
// binarySearch algoritham returns the number of comparisons
int binarySearch(int arr[], int l, int r, int x,int count) {

		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x) {
				return count;
			}
			
			if (arr[mid] < x)
				return binarySearch(arr, mid + 1, r, x,count+1);

			return binarySearch(arr, l, mid - 1, x,count+1);
		}
		return -1;
	}
int binarySearchBench(int arr[],int n,int ele){
    return binarySearch(arr,0,n-1,ele,0);
}
int main()
{
    int SIZE=13;
    int tests[]={10,50,70,90,100,250,296,312,350,400,450,550,600};
    int numCompares;
    cout << "Searching for a value in the middle of the array -- \n";
    cout << "Searching for the value 296.\n";

    numCompares = linearSearchBench(tests, SIZE, 296);
    cout << "The linear search made " << numCompares
        << " comparisons.\n";

    numCompares = binarySearchBench(tests, SIZE, 296);
    cout << "The binary search made " << numCompares
        << " comparisons.\n";

    // Compare searches for a value at the end of the array
    cout << "\nSearching for a value at the end of the array -- \n";
    cout << "Searching for the value 600.\n";

    numCompares = linearSearchBench(tests, SIZE, 600);
    cout << "The linear search made " << numCompares
        << " comparisons.\n";

    numCompares = binarySearchBench(tests, SIZE, 600);
    cout << "The binary search made " << numCompares
        << " comparisons.\n";

    // Compare searches for a value not in the array
    cout << "\nSearching for a value not in the array -- \n";
    cout << "Searching for the value 312.\n";

    numCompares = linearSearchBench(tests, SIZE, 312);
    cout << "The linear search made " << numCompares
        << " comparisons.\n";

    numCompares = binarySearchBench(tests, SIZE, 312);
    cout << "The binary search made " << numCompares
        << " comparisons.\n";

    return 0;
}
