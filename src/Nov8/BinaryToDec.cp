#include<iostream> 
#include<string> 
using namespace std; 
  
// Function to convert binary to decimal 
int toDecimal(string n) 
{ 
    string num = n; 
    int dec_value = 0; 
      
    // Initializing base value to 1, i.e 2^0 
    int base = 1; 
      
    int len = num.length(); 
    for (int i=len-1;i>=0;i--) 
    { 
        if (num[i] == '1')         
            dec_value += base; 
        base = base * 2; 
    } 
      
    return dec_value; 
} 
  
// Driver program to test above function 
int main() 
{ 
    string num;
  cout<<"Enter 8 digit binary number";
  cin>>num;
  while(num.length()!=8){
    cout<<"Invalid input, it must be 8 digit ";
    cout<<"Enter 8 digit binary number";
    cin>>num;
    
  }
    cout<<toDecimal(num)<<endl; 
}