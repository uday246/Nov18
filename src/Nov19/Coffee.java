package Nov19;

public class Coffee {
	private String roastType;
	private double temp;
	public Coffee(){
		
	}
	public Coffee(String aRoastType, double aTemp) {
		super();
		roastType = aRoastType;
		temp = aTemp;
	}
	public String getRoastType() {
		return roastType;
	}
	public void setRoastType(String aRoastType) {
		roastType = aRoastType;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double aTemp) {
		temp = aTemp;
	}
	public String drinkability(){
		if(temp<100)
			return "Too Cold";
		if(temp>=100 && temp<160)
			return "Just Right";
		if(temp>=160 && temp<180)
			return "Hot";
		return "Too Hot";
		
	}
}
