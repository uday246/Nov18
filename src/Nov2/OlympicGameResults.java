package Nov2;

import java.util.Scanner;

public class OlympicGameResults

{

static Scanner sp = new Scanner(System.in);

static int num = 0;

public OlympicGameResults(int n)

{

num = n;

}

public static String arr[][] = new String[20][4 + 1]; // getNumber() will return number of rows+1 (+1

// for total of medals), and 5 columns are

// there(1 for country name, 3 for medals and 1

// for total)

public void setCountries()

{

System.out.println("BRAZIL, GHANA, AUSTRAILIA");

for (int i = 0; i < OlympicGameResults.num; i++)

{

System.out.printf("\nCountry %d: ", i + 1);

}

}

public void setMedals()

{

System.out.println("medal names are in 0th row and 1,2, 3 column of 2D array");

System.out.print("GOLD");

arr[0][1] = sp.next();

System.out.print("SILVER");

arr[0][2] = sp.next();

System.out.print("BRONZE");

arr[0][3] = sp.next();

arr[0][4] = "Total";

}

public void setCount()

{

for (int i = 0; i < OlympicGameResults.num; i++)

{

System.out.printf("Enter medals %s has won: \n", arr[i + 1][0]);

System.out.print(arr[0][1] + ": "); // GOLD,

arr[i + 1][1] = sp.next();

System.out.print(arr[0][2] + ": "); // SILVER,

arr[i + 1][2] = sp.next();

System.out.print(arr[0][3] + ": "); // BRONZE,

arr[i + 1][3] = sp.next();

}

}

public void getCountries()

{

System.out.println("--------------------------------------------");

System.out.println("BRazil, GHANA, AUSTRALIA ");// List of countries participating in the Olympics

for (int i = 0; i < OlympicGameResults.num; i++)

{

System.out.println(arr[i + 1][0]);

}

}

public void getMedals()

{

System.out.println("GOLD, BRONZE, SILVER: ");

System.out.printf("%s\t%s\t%s\n", arr[0][1], arr[0][2], arr[0][3]);

}

public void getCount()

{

System.out.println("winning medals in the olympics tournament by different nations: ");

int i, count, count1, count2, count3;

System.out.printf("%s\t%s\t%s\t%s\t%s\n", arr[0][0], arr[0][1], arr[0][2], arr[0][3], arr[0][4]);

for (i = 0; i < OlympicGameResults.num; i++)

{

count = 0;

System.out.print(arr[i + 1][0] + "\t"); // GHANA;

count1 = Integer.parseInt(arr[i + 1][1]); // Integer.parseInt() converts String to integer, arr is String

// array so to do sum of count, conversion is necessary

System.out.print(count1 + "\t");

count2 = Integer.parseInt(arr[i + 1][2]); // medal 2 count

System.out.print(count2 + "\t");

count3 = Integer.parseInt(arr[i + 1][3]);

System.out.print(count3 + "\t");

count = count1 + count2 + count3;

System.out.println(count);

}

}

public void showResults()

{

int count = 0, i;

int count1=0, count2, count3; // count of 3 medals individually

int gCount = 0, sCount = 0, bCount = 0, total = 0;

System.out.println("Final Results: ");

System.out.printf("%s\t%s\t%s\t%s\t%s\n", arr[0][1], arr[0][0], arr[0][2], arr[0][3], arr[0][4]);

for (i = 0; i < OlympicGameResults.num; i++)

{

count = 0;

System.out.print(arr[i + 1][0] + "\t"); // Australia;

gCount += count1;

System.out.print(count1 + "\t");

count2 = Integer.parseInt(arr[i + 1][2]); // medal 2 count

sCount += count2;

System.out.print(count2 + "\t");

count3 = Integer.parseInt(arr[i + 1][3]);

bCount += count3;

System.out.print(count3 + "\t");

count = count1 + count2 + count3;

System.out.println(count);

}

total = gCount + sCount + bCount;

System.out.printf("Total\t%d\t%d\t%d\t%d\n", gCount, sCount, bCount, total);

}

}
