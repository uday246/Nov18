package Prmr;

import java.util.ArrayList;

public class RetailTransaction333 {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		Transaction tc = new Transaction(12345, "John Doe");
		tc.addLineItem("Colgate Toothpaste", 2, 2.99);
		tc.addLineItem("Bounty Paper Towels", 1, 1.49);
		tc.addLineItem("Kleenex Tissue", 1, 2.49);
		System.out.println(tc.toString());
	}

}

class LineItem {
	String itemName;
	int quantity;
	double price;

	public LineItem(String i, int q, double p) {
		itemName = i;
		quantity = q;
		price = p;
	}

	String getName() {
		return itemName;
	}

	int getQuantity() {
		return quantity;
	}

	double getPrice() {
		return price;
	}

	double getTotalPrice() {
		return price * quantity;
	}

	void setQuantity(int q) {
		quantity = q;
	}

	void setPrice(double p) {
		price = p;
	}

	void setName(String i) {
		itemName = i;
	}

	public String toString() {
		return itemName + " qty " + quantity + " @ $" + price + " $" + getTotalPrice();
	}
}

class Transaction {
	int customerID;
	String customerName;
	ArrayList<LineItem> ar;

	public Transaction(int id, String name) {
		ar = new ArrayList<LineItem>();
		customerID = id;
		customerName = name;
	}

	void addLineItem(String i, int q, double p) {
		LineItem li = new LineItem(i, q, p);
		ar.add(li);
	}

	void updateItem(String s, int q, double p) {
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i).itemName.compareTo(s) == 0) {
				ar.get(i).quantity = q;
				ar.get(i).price = p;
				break;
			}
		}
	}

	double getTotalPrice() {
		double total = 0.0;
		for (int i = 0; i < ar.size(); i++)
			total += ar.get(i).getTotalPrice();
		return total;
	}

	String getLineItem(String name) {
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i).itemName.compareTo(name) == 0)
				return ar.get(i).toString();
		}
		return name + " not found.";
	}

	public String toString() {
		String s = "Customer ID : " + customerID + '\n';
		s += "Customer Name : " + customerName + '\n';
		for (int i = 0; i < ar.size(); i++)
			s += getLineItem(ar.get(i).itemName) + '\n';
		s += "Transaction Total $" + getTotalPrice();
		return s;
	}
}

