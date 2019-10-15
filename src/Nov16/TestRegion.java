package Nov16;

import java.util.ArrayList;

class Region{
	private double revenue;
	private double expense;
	private String region;
	public Region(double aRevenue, double aExpense, String aRegion) {
		super();
		revenue = aRevenue;
		expense = aExpense;
		region = aRegion;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double aRevenue) {
		revenue = aRevenue;
	}
	public double getExpense() {
		return expense;
	}
	public void setExpense(double aExpense) {
		expense = aExpense;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String aRegion) {
		region = aRegion;
	}
	public double getProfit(){
		return revenue-expense;
	}
	public double getMargin(){
		return getProfit()/revenue;
	}
	
}
public class TestRegion {
public static void main(String[] args) {
	ArrayList<Region>list=new ArrayList<Region>();
	Region n= new Region(500234,21010,"North");
	Region s=new Region(456900,18999,"South");
	Region w=new Region(786333.15,396440.75,"West");
	Region e=new Region(954020.2,450020,"East");
			
	list.add(n);
	list.add(s);
	list.add(w);
	list.add(e);
	
	for(Region r:list){
		System.out.printf(r.getRegion()+" : %.1f : %.1f\n",r.getProfit(),r.getMargin());
	}
}
}
