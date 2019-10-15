#include <iostream>
using namespace std;
void increaseSal(int *p, int *q){
  for(int i=0;i<6;i++){
    q[i]=p[i]*1.1;
  }
}
int main() {
 int *p= new int[6];
 int *q = new int[6];
 int sum=0;
 cout<<"Enter 6 employees salaries \n";
 for(int i=0;i<6;){
  cout<<"Enter salary : "<<i+1;
  cin>>p[i];
  if(p[i]>0)
    i++;
  else
  cout<<"Invalid salary";
 }
increaseSal(p,q);
cout<<"Actual\t\tIncreased\n";
for(int i=0;i<6;i++){
cout<<p[i]<<"\t\t"<<q[i]<<endl;
sum=sum+(q[i]-p[i]);
}
cout<<"Total : "<<sum;
}