#include <iostream>
using namespace std;
void input(char *n1,char *n2){
  printf("Enter 2 numbers");
  scanf("%s%s",n1,n2);
}
int validate(char *n1,char *n2){
  int i=0;
  for(i=0;n1[i]!='\0';i++)
    if(!(n1[i]>='0' && n1[i]<='9'))
      return 0;
  for(i=0;n2[i]!='\0';i++)
    if(!(n2[i]>='0' && n2[i]<='9'))
      return 0;
  return 1;
      
}
int toInt(char *n){
  int num=0,i=0;
   for(i=0;n[i]!='\0';i++){
     num=num*10+n[i]-48;

   }
   return num;
}
int main() {
  char num1[10];
  char num2[10];
  int n1,n2;
  input(num1,num2);
  while(!validate(num1,num2)){
    cout<<"Enter valid inputs : ";
    input(num1,num2);
  }
  n1=toInt(num1);
  n2=toInt(num2);
  cout<<"Sum is : "<<n1+n2; 
}