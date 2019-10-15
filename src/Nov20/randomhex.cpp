#include <iostream>
#include <string>
using namespace std;
string getRandHex(){
string res="0x";
// array of hex numbers
string arr[]={"1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
// loop to form 6 digit hex numbers
for(int i=0;i<6;i++){
  // generating random  number to get hex digit from array
  int index=rand()%15;
  //cout<<index;
  res=res+arr[index];
}
return res;
}
int main() {
 cout<<getRandHex()<<endl;
 cout<<getRandHex()<<endl;
 cout<<getRandHex()<<endl;
}