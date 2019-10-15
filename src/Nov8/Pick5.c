#include <time.h>
#include <stdlib.h>
#include<stdio.h>
int main(){
int seed;
int ran[5];
int user[5];
int i,count=0;
printf("Enter an integer random seed:");
scanf("%d",&seed);
srand(seed);   // Initialization, should only be called once.
for(i=0;i<5;i++)
  ran[i]=rand()%9+1;
printf("To play the Pick-5 game, enter five integers bewteen 1 and 9 (inclusive):");
for(i=0;i<5;i++){
  scanf("%d",&user[i]);
  if(user[i]==ran[i])
    count++;
}
if(count==0){
  printf("You didn't match any numbers");
}
else{
  printf("Your numbers matched the Pick-5 numbers at position(s):");
  for(i=0;i<5;i++){
    if(user[i]==ran[i])
      printf("%d ",i);
  }
}
printf("\nThe winning numbers are: ");
 for(i=0;i<5;i++)
      printf("%d ",ran[i]);
}