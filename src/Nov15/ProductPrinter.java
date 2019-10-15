package Nov15;
class Product{
	private String name;
	private double price;
	// constructor to initialize values
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
	// method to reduce the price
	public void reducePrice(double aPrice) {
		if(price>=aPrice)
		price -= aPrice;
	}
	// toString to print details
	@Override
	public String toString() {
		return name + ": " + price;
	}
	
}
public class ProductPrinter  {
public static void main(String[] args) {
	// creating 2 products
	Product p1 = new Product("Choc", 15);
	Product p2 = new Product("Ball", 25);
	// printing details
	System.out.println(p1);
	System.out.println(p2);
	// reducing the prices
	p1.reducePrice(5);
	p2.reducePrice(5);
	// printing the values
	System.out.println(p1);
	System.out.println(p2);
	
}
}
