package Nov9;

class AdultBeverages {
	private String name;
	private int year;

	public AdultBeverages() {

	}

	public AdultBeverages(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}

	public void displayAdultBeverages() {
		System.out.println("Adult Beverage : " + name);
		System.out.println("Year : " + year);
	}

}

public class TestAdultAverages {
	public static void main(String[] args) {
		AdultBeverages a1 = new AdultBeverages("Panatela Gautier de Luxe Blend", 2007);
		AdultBeverages a2 = new AdultBeverages("Prima Mazzo Moscato d'Asti", 2008);
		a1.displayAdultBeverages();
		a2.displayAdultBeverages();

	}
}
