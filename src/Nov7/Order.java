package Nov7;

class Purchase {

	public void review() {
		// TODO Auto-generated method stub

	}

	public void confirm() {
		// TODO Auto-generated method stub

	}

	public double getTotalCost() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Selection extends Purchase {

}

class Payment {

	public void verify() {
		// TODO Auto-generated method stub

	}

}

public class Order {

	// we do not need the other information here
	Purchase mySelection = new Selection(items);
	Payment myPayment;

	public void confirm() {
		mySelection.review();
		mySelection.confirm();
		double cost = mySelection.getTotalCost();
		myPayment = new Payment(paymentMethod, cost);
		myPayment.verify();
	}
}