package Nov15;

import java.util.Scanner;

class DentalPolicy {
	private Scanner input = new Scanner(System.in);

	public DentalPolicy() {

	}

	public String setGroupPolicyNo() {
		System.out.printf("Enter the group policy number: ");
		return input.nextLine();
	} // end method setGroupPolicyNo

	public int setNoInsured() {
		System.out.printf("%nEnter the number of people insured: ");
		return input.nextInt();
	} // end method setNoInsured

	public double calcDentalCost(int noInsured) {
		double dentalCost;
		if (noInsured >= 1000) {
			dentalCost = (noInsured * 40.00) * 0.95;
		} else { // end if, start else
			dentalCost = noInsured * 40.00;
		} // end else
		return dentalCost;
	} // end method calcDentalCost

	public void displayPolicyInfo(String groupPolicyNo, int noInsured, double dentalCost) {
		calcDentalCost(noInsured);
		System.out.printf(
				"%nTOTAL COST OF DENTAL COVERAGE FOR WAYNE'S BODY SHOP%n" + "%nGroup Policy Number: %s"
						+ "%nTotal Number Insured: %d" + "%nTOTAL COST: $%,.2f%n",
				groupPolicyNo, noInsured, dentalCost);
	} // end method displayPolicyInfo
}

public class LE52 {
	public static void main(String[] args) {
		DentalPolicy dp = new DentalPolicy();
		String groupPolicyNo = dp.setGroupPolicyNo();
		int noInsured = dp.setNoInsured();

		do {
			double dentalCost = dp.calcDentalCost(noInsured);
			dp.displayPolicyInfo(groupPolicyNo, noInsured, dentalCost);
			noInsured -= 1;
		} while (noInsured < 1000 && noInsured >= 1000);
	} // end method main

}// END APPLICATION CLASS LE52
