package Prmr;
class Circle extends Polygon
{
    // field variables
    final static double DEFAULT_RADIUS = 1.0;
    private double radius;

    // Constructors
    Circle()
    {
        super(0);
        radius = DEFAULT_RADIUS;
    }

    Circle(double radius)
    {
        super(0);
        if (radius > 0)
        {
            this.radius = radius;
        }
        else
        {
            System.out.println("Circle Constructor called with nonpositive radius; set to "+DEFAULT_RADIUS);
            this.radius = DEFAULT_RADIUS;
        }
    }

    // accessor and mutator for radius
    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        if (radius > 0)
        {
            this.radius = radius;
        }
        else
        {
            System.out.println("Circle.setRadius called with nonpositive input; radius not changed");
        }
    }

    // implement abstract methods
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    // toString......
    public String toString()
    {
        return "Circle (radius="+this.radius+")";
    }
}
/*
    The Polygon class will keep track of the number of sides that a shape object has
 */

// 


public class ClientCircle {
public static void main(String[] args) {
	Circle c = new Circle(5);
	System.out.println("Area : "+c.getArea());
	System.out.println("Sides : "+c.getNSides());
	System.out.println("Perimter : "+c.getPerimeter());
}
}
