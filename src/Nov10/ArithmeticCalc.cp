# include <iostream>
using namespace std;
double addition(float f1,float f2){
  return f1+f2;
}
double subtraction(float f1,float f2){
  return f1-f2;
}
double multiplication(float f1,float f2){
  return f1*f2;
}
double division(float f1,float f2){
  return f1/f2;
}




int main()
{
    char op;
    float num1, num2;
    int flag=1;
  while(flag){
    cout << "Enter operator either + or - or * or /: ";
    cin >> op;

    cout << "Enter two operands: ";
    cin >> num1 >> num2;
    cout<<"Result : ";
    switch(op)
    {
        case '+':
            cout << addition(num1,num2);
            break;

        case '-':
            cout << subtraction(num1,num2);
            break;

        case '*':
            cout << multiplication(num1,num2);
            break;

        case '/':
          if(num2==0){
            cout<<" denominator cannot be 0 while performing a division operation\n";
          }
        else
            cout << division(num1,num2);
            break;

        default:
            // If the operator is other than +, -, * or /, error message is shown
            cout << "Error! operator is not correct";
            flag=0;
            break;
    }
    cout<<endl;

  }
  cout<<"Bye Bye........";
    return 0;
}