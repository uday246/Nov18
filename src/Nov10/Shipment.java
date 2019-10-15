package Nov10;

import java.util.Scanner;
import java.util.Date;

public class Shipment {

private double shipID;
private double shipWeight, shipVolume, shipCost;
private String shipOrigin, shipDestination;
  

public void setShipID(double shipID) {
this.shipID = shipID; // store the shipID
} // method to retrieve the shipId from the object

public double getShipID() {
return shipID; // return value of shipId
}
  

public void setshipWeight(double shipWeight){
this.shipWeight = shipWeight; // store the shipWeight
} // method to retrieve the shipWeight from the object

public double getShipWeight() {
return shipWeight; // return value of shipweight
} // method to set the shipVolume in the object
  

public void setShipVolume(double shipVolume) {
this.shipVolume = shipVolume; // store the shipVolume
} // method to retrieve the shipVolume from the object

public double getShipVolume() {
return shipVolume; // return value of shipVolume
} // method to set the shipOrigin in the object
  

public void setShipOrigin(String shipOrigin) {
this.shipOrigin = shipOrigin; // store the shipOrigin
} // method to retrieve the shipOrigin from the object

public String getShipOrigin() {
return shipOrigin; // return value of shipOrigin
} // method to set the shipDestination in the object
  

public void setShipDestination(String shipDestination) {
this.shipDestination = shipDestination; // store the shipDestination
} // method to retrieve the shipDestination from the object

public String getShipDestination() {
return shipDestination; // return value of shipDestination
}
public void setShipCost(double shipCost) {
this.shipCost = shipCost; // store the shipCost
} // method to retrieve the shipCost from the object
public double getShipCost() {
return shipCost; // return value of shipCost
}


// method to return all values input as a string
@Override
public String toString() {

String s = "Shipment ID: " + Double.toString(getShipID())
+ "\nShipment Weight: " + Double.toString(getShipWeight())
+ "\nShipment Volume: " + Double.toString(getShipVolume())
+ "\nShipment Origin: " + getShipOrigin()
+ "\nShipment Destination: " + getShipDestination()
+ "Shipment Cost: " + Double.toString(getShipCost());
return s;
} // end toString method

public double calculateShipmentcost( double getShipWeight,
double getShipVolume){
	double getShipCost;
getShipCost = ((getShipWeight * 10) + (getShipVolume * 1.5));
System.out.println("\nShipment Cost is $" + getShipCost);
return getShipCost; } // end calculateShipmentcost method




public static void main(String[] args) {

// creates new Shipment object and Scanner object

Scanner input = new Scanner(System.in);
Shipment myShipment = new Shipment();

while (true) {

System.out.print("Please enter Shipment ID: ");
String getShipID = input.next();
// when user enters end it exits the loop
  
if (getShipID.equalsIgnoreCase("end")) {  
break;
} // end if statement

double shipID = Double.parseDouble(getShipID);
myShipment.setShipID(shipID);
System.out.print("Enter Shipment Destination: ");
String getShipDestination = input.next();
myShipment.setShipDestination(getShipDestination);
System.out.print("Enter Shipment Origin: ");   
String getShipOrigin = input.next();
myShipment.setShipOrigin(getShipOrigin);
System.out.print("Enter Shipment Weight: ");
double getShipWeight = input.nextDouble();
myShipment.setshipWeight(getShipWeight);
System.out.print("Enter Shipment Volume: ");
double getShipVolume = input.nextDouble();
myShipment.setShipVolume(getShipVolume);
  

if (getShipWeight > 120 | getShipVolume > 70) {
System.out.print("Item Excedded Recommendeded Limits");
break;  
} // end if statement
  
myShipment.shipCost = myShipment.calculateShipmentcost(getShipWeight, getShipVolume);
  
// Object reference that calls the toString method
System.out.println(myShipment);
} // end while loop

Date date = new Date();
System.out.println("\n\nUSER"
+ "\n\nI\n\n"
+ date);


} // end main method

} // end Shipment class