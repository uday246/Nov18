#include<stdio.h>
#include<stdlib.h>
#include<iostream>
using namespace std;
int main() {
int choice;
double USD, CNY, FRF, HKD, CHF, CAD, GBP, JPY, AUD,EURO;
//CNY(Chinese Yuan); FRF(FRENCH FRANC) HKD(HONGKONG DOLLAR) CHF (SCHWEIZER FRANKEN)
//CAD(CANADIAN) GBP (GREATBRITAIN POUND) JPY(JAPANESE YEN) AUD (AUSTRALIAN DOLLAR)
char quit, power;
while(choice != 9){
cout<<"Select an currency that you want to convert from dollar. \n";
cout<<"\n 1: Chinese Yuan ";
cout<<"\n 2: Euro ";
cout<<"\n 3: HongKong Dollar";
cout<<"\n 4: Schweizer Franken";
cout<<"\n 5: Canadian Dollar ";
cout<<"\n 6: Greatbritain Pound ";
cout<<"\n 7: Japanese Yen ";
cout<<"\n 8: Australian Dollar ";
cout<<"\n 9: EXIT ";
cout<<"\n Enter the choice:";
cin >> choice;

if (choice == 1){
cout << "\nEnter how many dollars you want to convert: ";
cin >> USD;
double exchange;
cout<<"Enter exchange rate \n";
cin>>exchange;
CNY = USD * exchange;
cout << USD << "dollars, converts into: " << CNY << endl;
break;
}
if (choice == 2){
cout << "\nEnter how many dollars you want to convert: ";
cin >> USD;
double exchange;
cout<<"Enter exchange rate \n";
cin>>exchange;
EURO = USD * exchange;
cout << USD << "dollars, converts into: " << EURO<< endl;
break;
}
if (choice == 3){
cout << "\nEnter how many dollars you want to convert: ";
cin >> USD;
double exchange;
cout<<"Enter exchange rate \n";
cin>>exchange;
HKD = USD * exchange;
cout << USD << "dollars, converts into: " << HKD << endl;
break;
}
if (choice == 4){
cout << "\nEnter how many dollars you want to convert: ";
cin >> USD;
double exchange;
cout<<"Enter exchange rate \n";
cin>>exchange;
CHF = USD * exchange;
cout << USD << "dollars, converts into: " << CHF << endl;
break;
}
if (choice == 5){
cout << "\nEnter how many dollars you want to convert: ";
cin >> USD;
double exchange;
cout<<"Enter exchange rate \n";
cin>>exchange;
CAD = USD * exchange;
cout << USD << "dollars, converts into: " << CAD << endl;
break;
}
if (choice == 6){
cout << "\nEnter how many dollars you want to convert: ";
cin >> USD;
double exchange;
cout<<"Enter exchange rate \n";
cin>>exchange;
GBP = USD * exchange;
cout << USD << "dollars, converts into: " << GBP<< endl;
break;
}
if (choice == 7){
cout << "\nEnter how many dollars you want to convert: ";
cin >> USD;
double exchange;
cout<<"Enter exchange rate \n";
cin>>exchange;
JPY = USD * exchange;
cout << USD << "dollars, converts into: " << JPY << endl;
break;
}
if (choice == 8){
cout << "\nEnter how many dollars you want to convert: ";
cin >> USD;
double exchange;
cout<<"Enter exchange rate \n";
cin>>exchange;
AUD = USD * exchange;
cout << USD << "dollars, converts into: " << AUD << endl;
break;
}
if (choice == 9){
cout << "Exiting Program .... \n";
break;
}
}
return 0;
}