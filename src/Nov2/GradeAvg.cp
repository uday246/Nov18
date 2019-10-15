#include<iostream>
using namespace std;

  
int getGrades(int *arr) 
{ 
  cout<<"Enter grades (negative number to exit) :";
  int count=0,num;
  for(int i=0;;i++){
      cin>>num;
      if(num<0)
      break;
      count++;
      arr[i]=num;
  }
  return count;
}   

double getAvg(int *arr,int n){
    double sum=0;
    for(int i=0;i<n;i++)
    sum+=arr[i];
    
    return sum/n;
}

int main() 
{ 
    int gradeInputs[1000];
    int gradeCount=0;
    double avg;
    gradeCount=getGrades(gradeInputs);
    avg=getAvg(gradeInputs,gradeCount);
    cout<<"Average : "<<avg;
    
} 