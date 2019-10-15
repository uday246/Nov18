package Nov9;

public class Ship {
private String name;
private int year;

public Ship(){
	
}
public Ship(String aName, int aYear) {
	super();
	name = aName;
	year = aYear;
}
public String getName() {
	return name;
}
public void setName(String aName) {
	name = aName;
}
public int getYear() {
	return year;
}
public void setYear(int aYear) {
	year = aYear;
}
@Override
public String toString() {
	return "Ship [name=" + name + ", year=" + year + "]";
}

}
class CruiseShip extends Ship{
	private int maxPassangers;
	public CruiseShip(){
		
	}
	public CruiseShip(int aMaxPassangers) {
		super();
		maxPassangers = aMaxPassangers;
	}
	public int getMaxPassangers() {
		return maxPassangers;
	}
	public void setMaxPassangers(int aMaxPassangers) {
		maxPassangers = aMaxPassangers;
	}
	@Override
	public String toString() {
		return "CruiseShip [maxPassangers=" + maxPassangers + "]";
	}
	
}

class CargoShip extends Ship{
	private int capacity;
	public CargoShip(){
		
	}
	public CargoShip(int aCapacity) {
		super();
		capacity = aCapacity;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int aCapacity) {
		capacity = aCapacity;
	}
	@Override
	public String toString() {
		return "CargoShip [capacity=" + capacity + "]";
	}
	
}
