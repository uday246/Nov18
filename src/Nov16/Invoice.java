package Nov16;

public class Invoice {
Product prodInfo;
Address shpippingAddress;
Address billingAddress;
Customer custInfo;
public Invoice(Product aProdInfo, Address aShpippingAddress, Address aBillingAddress, Customer aCustInfo) {
	super();
	prodInfo = aProdInfo;
	shpippingAddress = aShpippingAddress;
	billingAddress = aBillingAddress;
	custInfo = aCustInfo;
}
public Product getProdInfo() {
	return prodInfo;
}
public void setProdInfo(Product aProdInfo) {
	prodInfo = aProdInfo;
}
public Address getShpippingAddress() {
	return shpippingAddress;
}
public void setShpippingAddress(Address aShpippingAddress) {
	shpippingAddress = aShpippingAddress;
}
public Address getBillingAddress() {
	return billingAddress;
}
public void setBillingAddress(Address aBillingAddress) {
	billingAddress = aBillingAddress;
}
public Customer getCustInfo() {
	return custInfo;
}
public void setCustInfo(Customer aCustInfo) {
	custInfo = aCustInfo;
}

}
class Product{
	private String name;
	private double price;
	public Product(String aName, double aPrice) {
		super();
		name = aName;
		price = aPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double aPrice) {
		price = aPrice;
	}
	
}

class Customer{
	private String id;
	private String name;
	public Customer(String aId, String aName) {
		super();
		id = aId;
		name = aName;
	}
	public String getId() {
		return id;
	}
	public void setId(String aId) {
		id = aId;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	
	
}

class Address{
	private String lane;
	private String hno;
	private String city;
	private String pin;
	public Address(String aLane, String aHno, String aCity, String aPin) {
		super();
		lane = aLane;
		hno = aHno;
		city = aCity;
		pin = aPin;
	}
	public String getLane() {
		return lane;
	}
	public void setLane(String aLane) {
		lane = aLane;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String aHno) {
		hno = aHno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String aCity) {
		city = aCity;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String aPin) {
		pin = aPin;
	}
	
	
	
}