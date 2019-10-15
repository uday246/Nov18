
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class ItemDetails

{

int ID;

String Color;

int Size;

float Price;

int Quantity;

ItemDetails(int ID,String Color,int Size,float Price,int Quantity)

{

this.ID=ID;

this.Color=Color;

this.Size=Size;

this.Price=Price;

this.Quantity=Quantity;

}

}


public class Main {

// TODO Auto-generated method stub

public static void main(String[] args) {

int press1=0;

ArrayList stack = new ArrayList();

//Declaring the stacks outside the cases so that it will be accessible to all the cases not to a particular case.  

Stack<ItemDetails>MShirts=new Stack<ItemDetails>();

Stack<ItemDetails>WShirts=new Stack<ItemDetails>();

Stack<ItemDetails>KShirts=new Stack<ItemDetails>();

do {

Scanner scan =new Scanner(System.in);

System.out.println("\n"+"Welcome to Old Navy");

System.out.println("Enter #1 to enter cloths mens aisle");

System.out.println("Enter #2 to enter cloths womens aisle");

System.out.println(" Enter #3 to enter cloths kids aisle");

System.out.println(" Enter #4 to see whole inventory");

System.out.println(" Enter #5 to see price of whole inventory");

System.out.println(" Enter #6 to exit");

press1= scan.nextInt();

switch (press1) {

case 1:

System.out.println("\n"+ "Mens Department");

System.out.println("Shirt");

System.out.println("Enter Id");

int ID=scan.nextInt();

System.out.println("Enter Color");

String Color=scan.next();

System.out.println("Enter Size");

int Size=scan.nextInt();

System.out.println("Enter Price");

int Price=scan.nextInt();

System.out.println("Enter Quantity");

int Quantity=scan.nextInt();

Item MItem=new Item(ID,Color,Size,Price,Quantity);

MShirts.push(MItem);

//Stack<Item>Pants=new Stack<Item>();

//Stack<Item>Shoes=new Stack<Item>();

break;

case 2:

System.out.println("\n"+ "Womens Department");

System.out.println("Shirt");

System.out.println("Enter Id");

int IDw=scan.nextInt();

System.out.println("Enter Color");

String Colorw=scan.next();

System.out.println("Enter Size");

int Sizew=scan.nextInt();

System.out.println("Enter Price");

int Pricew=scan.nextInt();

System.out.println("Enter Quantity");

int Quantityw=scan.nextInt();

Item WItem=new Item(IDw,Colorw,Sizew,Pricew,Quantityw);

WShirts.push(WItem);

break;

case 3:

System.out.println("\n"+ "Kids Department");

System.out.println("Shirt");

System.out.println("Enter Id");

int IDk=scan.nextInt();

System.out.println("Enter Color");

String Colork=scan.next();

System.out.println("Enter Size");

int Sizek=scan.nextInt();

System.out.println("Enter Price");

int Pricek=scan.nextInt();

System.out.println("Enter Quantity");

int Quantityk=scan.nextInt();

Item KItem=new Item(IDk,Colork,Sizek,Pricek,Quantityk);

KShirts.push(KItem);

break;

case 4:

System.out.println("Inventory Details...\n");

//We are using for-each loop to traverse the stack

// basic syntax of for-each loop is -> for(DataType loop_variable : array)

// in this loop_variable will start from the first value of the array and will traverse till the last value of the array

// In our case we have Declared data type as Item(Class Name) and then the object of the class and the whole stack  

System.out.println("\nMen Cloth Details are \n");

for(Item item :MShirts){

System.out.println("\tID is "+item.getID()+ " \n\tColor is "+item.getcolor()+" \n\tSize is "+item.getsize() +" \n\tPrice is "+item.getprice()+ " "+

" \n\tQuantity is "+item.getquantity()+"\n");

}

System.out.println("\nWomen Cloth Details are\n");

for(Item item :WShirts){

System.out.println("\tID is "+item.getID()+ " \n\tColor is "+item.getcolor()+" \n\tSize is "+item.getsize() +" \n\tPrice is "+item.getprice()+ " "+

" \n\tQuantity is "+item.getquantity()+"\n");

}

System.out.println("\nKids Cloth Details are \n");

for(ItemDetails item :KShirts){

System.out.println("\tID is "+item.ID+ " \n\tColor is "+item.Color+" \n\tSize is "+item.Size +" \n\tPrice is "+item.Price+ " "+

" \n\tQuantity is "+item.Quantity+"\n");

}

break;

case 5:

System.out.println("\n Price of the inventory.... \n");

// Declared a local Variable totalPrice and initialized to 0

float totalPrice = 0;

// we will traverse each stack (all 3 stacks) in a foreach loop.

// We will multiply price of each item with the quantity of each item and will add it to the totalPrice variable

for(Item item :MShirts){

totalPrice+=item.getprice()*item.getquantity();

}

for(Item item :WShirts){

totalPrice+=item.getprice()*item.getquantity();

}

for(Item item :KShirts){

totalPrice+=item.getprice()*item.getquantity();

}

System.out.println("\n Price of the inventory is "+totalPrice);

break;

case 6:

System.out.println("Exit");

System.exit(6);

}

}while (press1 !=6);

}

}

//This is my item class


class Item {

private int ID;

private String Color;

private String Size;

private int Price;

private int Quantity;

private String Category;

public Item() {

this.setID(0);

this.Color = "";

this.Size = "";

this.Price = 0;

this.Quantity = 0;

this.Category = "";

}

public Item(int ID, String Color, String Size, int Price, int Quantity, String Category) {

this.setID(ID);

this.Color=Color;

this.Size=Size;

this.Price=Price;

this.Quantity=Quantity;

this.Category=Category;

}

public Item(int aID, String aColor, int aSize, int aPrice, int aQuantity) {
	// TODO Auto-generated constructor stub
}

public void setID(int ID) {

this.ID=ID;

}

public int getid() {

return getID();

}

public void setcolor(String Color) {

this.Color=Color;

}

public String getcolor() {

return Color;

}

public void setsize(String Size) {

this.Size=Size;

}

public String getsize() {

return Size;

}

public void setprice(int Price) {

this.Price=Price;

}

public int getprice() {

return Price;

}

public void setquantity(int Quantity) {

this.Quantity=Quantity;

}

public int getquantity() {

return Quantity;

}

public void setcategory(String Category) {

this.Category=Category;

}

public String getcategory() {

return Category;

}

public int getID() {
	return ID;
}

}

