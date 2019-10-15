package Nov3;
class Circle{
	private double radius;
	public Circle(){
		
	}
	public Circle(Circle c){
		radius=c.getRadius();
	}
	public double getRadius() {
		return radius;
	}
	public double getArea(){
		return Math.PI * radius * radius;
	}
	public void setRadius(double aRadius) {
		radius = aRadius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	
}
public class TestCirlce {

}
