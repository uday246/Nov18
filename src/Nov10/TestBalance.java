package Nov10;

import java.util.Date;
class Balance{
	private int id;
	private Date dateCreated;
	private double totalPrice;
	private double item1Price;
	private double item2Price;

	private double item1Quantity;
	private double item2Quantity;
	private double taxPercentage;
	public Balance(){
		
	}
	public Balance(int aId, double aItem1Price, double aItem2Price, double aItem1Quantity, double aItem2Quantity,
			double aTaxPercentage) {
		super();
		id = aId;
		item1Price = aItem1Price;
		item2Price = aItem2Price;
		item1Quantity = aItem1Quantity;
		item2Quantity = aItem2Quantity;
		taxPercentage = aTaxPercentage;
		dateCreated=new Date();
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double aTotalPrice) {
		totalPrice = aTotalPrice;
	}
	public double getItem1Price() {
		return item1Price;
	}
	public void setItem1Price(double aItem1Price) {
		item1Price = aItem1Price;
	}
	public double getItem2Price() {
		return item2Price;
	}
	public void setItem2Price(double aItem2Price) {
		item2Price = aItem2Price;
	}
	public double getItem1Quantity() {
		return item1Quantity;
	}
	public void setItem1Quantity(double aItem1Quantity) {
		item1Quantity = aItem1Quantity;
	}
	public double getItem2Quantity() {
		return item2Quantity;
	}
	public void setItem2Quantity(double aItem2Quantity) {
		item2Quantity = aItem2Quantity;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double aTaxPercentage) {
		taxPercentage = aTaxPercentage;
	}
	public int getId() {
		return id;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public Double calculate(){
		double total= (item1Price*item1Quantity)+(item2Price * item2Quantity);
		double tax=total* (taxPercentage/100);
		return total-tax;
	}
	@Override
	public String toString() {
		return "Balance [id=" + id + ", dateCreated=" + dateCreated + ", totalPrice=" + totalPrice + ", item1Price="
				+ item1Price + ", item2Price=" + item2Price + ", item1Quantity=" + item1Quantity + ", item2Quantity="
				+ item2Quantity + ", taxPercentage=" + taxPercentage + ", Total Price =" + calculate() + "]";
	}

}
public class TestBalance {
public static void main(String[] args) {
	Balance b1 = new Balance(11223,10.5,50.9,20,10,8);
	System.out.println(b1);
}

}
