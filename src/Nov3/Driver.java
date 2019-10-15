package Nov3;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class Driver {

private static void display(String message, Object[] emp, int len) {//method to display employee details

System.out.println(message);

for(int i = 0; i < len; i++) {

if(emp[i] instanceof TestProd) {

System.out.println(emp[i] + "\n");

System.out.println("------------------------\n");

}

else if(emp[i] instanceof Salesman) {

System.out.println(emp[i] + "\n");

System.out.println("------------------------\n");

}

else if(emp[i] instanceof Executive) {

System.out.println(emp[i] + "\n");

System.out.println("------------------------\n");

}

}

}

public static void main(String[] args) throws FileNotFoundException {

Object[] emp2014 = new Object[10];//array to hold 2014 employee details

Object[] emp2015 = new Object[10];//array to hold 2015 employee objects

File myFile = new File(args[0]);//here file name is passed as a command line argument

Scanner inFile = new Scanner(myFile);//opening a file using scanner object

String oneLine;

int i = 0, j = 0;

while (inFile.hasNextLine()) {

oneLine = inFile.nextLine();//reading line by line till end of file and storing in oneLine variable

String[] inputArr = oneLine.split("\\s+");//splitting with spaces

Object emp = null;

if(inputArr[1].equals("Employee")) {//checking it is of type employee

emp = new TestProd(inputArr[2], Integer.parseInt(inputArr[3]));

}

else if(inputArr[1].equals("Salesman")) {//checking it is of type salesman

emp = new Salesman(inputArr[2], Integer.parseInt(inputArr[3]), Integer.parseInt(inputArr[4]));

}

else if(inputArr[1].equals("Executive")) {//checking it is of type executive

emp = new Executive(inputArr[2], Integer.parseInt(inputArr[3]), Integer.parseInt(inputArr[4]));

}

else

System.out.println("Unknown Type of Employee: " + inputArr[2]);

if(emp != null) {

if(inputArr[0].equals("2014"))

emp2014[i++] = emp;

else if(inputArr[0].equals("2015"))

emp2015[j++] = emp;

}

}

inFile.close();//closing the file

display("Employees of 2014", emp2014, i);//displaying employee of 2014

display("Employees of 2015", emp2015, j);//displaying employees of 2015

}

}