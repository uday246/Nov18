package Nov14;
class Sphere{
	private double diameter;

	/**
	 * @param aDiameter
	 */
	public Sphere(double aDiameter) {
		super();
		diameter = aDiameter;
	}

	/**
	 * @return
	 */
	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double aDiameter) {
		diameter = aDiameter;
	}
	// returns the area using 4 / * PI r^2
	public double getArea(){
		double r = diameter/2;
		return 4 * Math.PI * r * r;
	}
	// returns the volumes using 4 /3 * PI r^3
	public double getVolume(){
		double r = diameter/2;
		return 4 / 2* Math.PI * r * r * r;
		
	}
	
	public String toString(){
		return String.format("Area : %.2f Volume : %.2f",getVolume(),getArea());
	}
	
}
public class MultiSphere {  
      public static void main(String[] args) {
		Sphere s1 = new Sphere(6);
		Sphere s2 = new Sphere(3);
		Sphere s3 = new Sphere(7);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
  
}  