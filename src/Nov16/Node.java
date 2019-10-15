package Nov16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


class node
{
long data;
long year;
String country;
node next;

node(String c,long y,long d)
{
country=c;
year=y;
data = d;
next = null;
}
}

public class Population
{
private static node head;
public static void push(String country,long year,long data)
{

node new_node = new node(country,year,data);


new_node.next = head;


head = new_node;
}
  
public static void find(String c)
{
node temp=head;
long startYear=0;
long endYear=0;

while(temp!=null)
{
if(temp.country.equalsIgnoreCase(c) && temp.year==2015)
{
System.out.println("Population of the "+c+" for the year 2015: "+temp.data);
startYear=temp.data;
}
else if(temp.country.equalsIgnoreCase(c) && temp.year==2100)
{
endYear=temp.data;
}
temp=temp.next;

}
if(startYear!=0 && endYear!=0)
System.out.println("Difference in population from 2015 to 2100: "+(endYear-startYear));
else
System.out.println("Not found!");
}


public static void main(String[] args) throws IOException
{

File infile=new File("globalpopulation.csv");
Scanner scanner;
scanner = null;
try
{
scanner = new Scanner(infile);
} catch (FileNotFoundException e)
{

e.printStackTrace();
}

while(scanner.hasNextLine())
{
String a[]=scanner.nextLine().split(",");
push(a[0],Long.parseLong(a[1]),Long.parseLong(a[2]));

}
scanner.close();
Scanner in=new Scanner(System.in);
System.out.print("Enter the country:");
String country=in.nextLine();

find(country);
in.close();

}

}
