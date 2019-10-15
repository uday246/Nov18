package Nov3;

public class Cost {
	int creditHours;
	double creditPrice;
	double housingCost;
	double mealPlanAmount;
	
	public static void main(String[] args) {
		Cost fallTution = new Cost();
		fallTution.creditHours=15;
		fallTution.creditPrice=200;
		fallTution.housingCost=2000;
		fallTution.mealPlanAmount=750;
		double total=fallTution.creditPrice * fallTution.creditHours;
		total=total+fallTution.housingCost+fallTution.mealPlanAmount;
		System.out.println("Your final bill for the Fall Semester is: "+total);
	}
}
