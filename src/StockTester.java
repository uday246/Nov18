class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	public Stock(String aSymbol, String aName) {
		super();
		symbol = aSymbol;
		name = aName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String aSymbol) {
		symbol = aSymbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	public void setPreviousClosingPrice(double aPreviousClosingPrice) {
		previousClosingPrice = aPreviousClosingPrice;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double aCurrentPrice) {
		currentPrice = aCurrentPrice;
	}
	public double getChangePercent(){
		return (Math.abs(previousClosingPrice-currentPrice)/previousClosingPrice)*100;
	}
}

public class StockTester{
	public static void main(String[] args) {
		Stock sc = new Stock("ORCL", "Oracle Corporation");
		sc.setCurrentPrice(34.35);
		sc.setPreviousClosingPrice(34.5);
		System.out.println(sc.getChangePercent());
	}
}