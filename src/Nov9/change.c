#include <stdio.h>

void ComputeChange(int totCents,int *q,int *d,int *n,int *p) { // FIXME add four pass by pointer parameters
  *q=totCents/25;
  totCents=totCents%25;
  *d=totCents/10;
  totCents=totCents%10;
  *n=totCents/5;
  totCents=totCents%5;
  *p=totCents;
   printf("FIXME: Finish this function.\n");
}

int main(void) {

   int totalCents;         // Total amount of change needed
   int quartersChange;     // Number of quarters used for change
   int dimesChange;        // Number of dimes used for change
   int nickelsChange;      // Number of nickels used for change
   int penniesChange;      // Number of pennies used for change

   printf("Enter total cents: ");
   scanf("%d", &totalCents);

   ComputeChange(totalCents,&quartersChange,&dimesChange,&nickelsChange,&penniesChange); // FIXME Add four pointer arguments

   printf("Change for %d cents is:\n", totalCents);
   printf("  %d quarters\n", quartersChange);
   printf("  %d dimes\n", dimesChange);
   printf("  %d nickles\n", nickelsChange);
   printf("  %d pennies\n", penniesChange);
   
   printf(" FIXME finish printing other coins.\n");

   return 0;
}