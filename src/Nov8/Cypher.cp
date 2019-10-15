#include<iostream>
#include<string>
using namespace std;
char *cypher(string str,int rotate);
int main(){
puts(cypher("xyz",1));

return 0;
}

char *cypher(string str,int d){

  char  *en=new char[str.length()];
  for(int i=0;i<str.length();i++){
    en[i]=str[i]+d;
    if(en[i]>'z')
    en[i]='A';

  }
return en;
}