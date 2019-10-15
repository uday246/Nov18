package Prmr;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private int itemID;
	private String name;
	private double cost;
	public Item(int aItemID, String aName, double aCost) {
		super();
		itemID = aItemID;
		name = aName;
		cost = aCost;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int aItemID) {
		itemID = aItemID;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double aCost) {
		cost = aCost;
	}
	
}

class PurchaseOrder{
	private int orderId;
	private List<Item>items;
	public PurchaseOrder(int aOrderId) {
		super();
		orderId = aOrderId;
		items=new ArrayList<Item>();
	}
	public int getID() {
		return orderId;
	}
	public void setID(int aOrderId) {
		orderId = aOrderId;
	}
	public List<Item> getList() {
		return items;
	}
	public void addItem(Item item) {
		items.add(item);
	}
	public double getTotalCost(){
		double sum=0;
		for(Item i:items)
			sum+=i.getCost();
		return sum;
	}
	public int getTotalNumberOfItems(){
		return items.size();
	}
}