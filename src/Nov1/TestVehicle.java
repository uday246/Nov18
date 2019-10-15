package Nov1;

class Vehicle {
	private String manufactureName;
	private int noOfCylinders;

	public Vehicle() {

	}

	public Vehicle(String aManufactureName, int aNoOfCylinders) {
		super();
		manufactureName = aManufactureName;
		noOfCylinders = aNoOfCylinders;
	}

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String aManufactureName) {
		manufactureName = aManufactureName;
	}

	public int getNoOfCylinders() {
		return noOfCylinders;
	}

	public void setNoOfCylinders(int aNoOfCylinders) {
		noOfCylinders = aNoOfCylinders;
	}

	@Override
	public String toString() {
		return "Vehicle [manufactureName=" + manufactureName + ", noOfCylinders=" + noOfCylinders + "]";

	}
}

class Truck extends Vehicle {

	private double loadCapacity;
	private double towingCapacity;

	public Truck() {

	}

	public Truck(String aManufactureName, int aNoOfCylinders, double aLoadCapacity, double aTowingCapacity) {
		super(aManufactureName, aNoOfCylinders);
		loadCapacity = aLoadCapacity;
		towingCapacity = aTowingCapacity;
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(double aLoadCapacity) {
		loadCapacity = aLoadCapacity;
	}

	public double getTowingCapacity() {
		return towingCapacity;
	}

	public void setTowingCapacity(double aTowingCapacity) {
		towingCapacity = aTowingCapacity;
	}

	@Override
	public String toString() {
		return "Truck [loadCapacity=" + loadCapacity + ", towingCapacity=" + towingCapacity + "] " + super.toString();
	}

}

public class TestVehicle {
	public static void main(String[] args) {
		Vehicle v = new Truck("Honda", 5, 100, 200);
		System.out.println(v);
	}
}
