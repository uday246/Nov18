#include <iostream>
#include<string>
using namespace std;
int main() {
  string name,country,line;
  int flag=0;
  cout<<"Enter name and address: ";
  getline(cin,line);
  int i;
  for(i=0;i<30;i++){
    if(line[i]==',')
      break;
    if(line[i]==' ') 
      flag=1;
    if(!flag)
      name=name+line[i];
  }
  for(i++;i<line.length();i++)
  if(line[i]!=' ')
    country=country+line[i];
  cout<<name<<" is from "<<country; 
}