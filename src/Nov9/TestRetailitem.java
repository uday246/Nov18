package Nov9;

class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;

	public RetailItem(String aDescription, int aUnitsOnHand, double aPrice) {
		super();
		description = aDescription;
		unitsOnHand = aUnitsOnHand;
		price = aPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String aDescription) {
		description = aDescription;
	}

	public int getUnitsOnHand() {
		return unitsOnHand;
	}

	public void setUnitsOnHand(int aUnitsOnHand) {
		unitsOnHand = aUnitsOnHand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double aPrice) {
		price = aPrice;
	}

}

public class TestRetailitem {
	public static void main(String[] args) {
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
		RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem item3 = new RetailItem("Shirt", 20, 24.55);
		System.out.println("\t\tDescription\t\tPrice\t\tPrice");
		System.out
				.println("------------------------------------------------------------------------------------------");
		System.out.println(
				"item1\t\t" + item1.getDescription() + "\t\t\t" + item1.getUnitsOnHand() + "\t\t" + item1.getPrice());
		System.out.println(
				"item2\t\t" + item2.getDescription() + "\t\t" + item2.getUnitsOnHand() + "\t\t" + item2.getPrice());
		System.out.println(
				"item3\t\t" + item3.getDescription() + "\t\t\t" + item3.getUnitsOnHand() + "\t\t" + item3.getPrice());

	}
}
