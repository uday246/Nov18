#include <iostream>
#include <string>
using namespace std;
int getDaysWorked(){
  int days;
  cout<<"Enter how many days emp worked";
  cin>>days;
  return days;
}
void displayPays(int days){
  int sum=0;
  int pay=1;
  cout<<"Day\tPay\n";
  cout<<"-----------------\n";
  
  for(int i=1;i<=days;i++){
    printf("%d \t %d\n",i,pay);
    sum+=pay;
    pay*=2;
  }
  cout<<"-----------------\n";
  printf("Total : $%.2f",((double)sum)/100);
}
int main(){
  int days=getDaysWorked();
  while(days<1 || days>31){
    days=getDaysWorked();

  }
  displayPays(days);
}