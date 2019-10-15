package Prmr;

public class ClientRect {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(100, 150);
		System.out.println("Area : " + r.getArea());
		System.out.println("Perimeter : " + r.getPerimeter());
	}
}

class Rectangle extends Polygon {
	// field variables
	final static double DEFAULT_LENGTH = 1.0;
	private double width;
	private double length;

	// Constructors
	Rectangle() {
		super(4);
		width = DEFAULT_LENGTH;
		length = DEFAULT_LENGTH;
	}

	Rectangle(double width, double length) {
		super(4);
		if (width > 0) {
			this.width = width;
		} else {
			System.out.println("Rectangle Constructor called with nonpositive side length; set to " + DEFAULT_LENGTH);
			this.width = DEFAULT_LENGTH;
		}
		if (length > 0) {
			this.length = length;
		} else {
			System.out.println("Rectangle Constructor called with nonpositive side length; set to " + DEFAULT_LENGTH);
			this.length = DEFAULT_LENGTH;
		}
	}

	// accessors and mutators
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public void setWidth(double width) {
		if (width > 0) {
			this.width = width;
		} else {
			System.out.println("Rectangle.setWidth called with nonpositive side length; length not changed");
		}
	}

	public void setLength(double length) {
		if (length > 0) {
			this.length = length;
		} else {
			System.out.println("Rectangle.setLength called with nonpositive side length; length not changed");
		}
	}

	public double getPerimeter() {
		return 2 * width + 2 * length;
	}

	public double getArea() {
		return width * length;
	}

	// toString......
	public String toString() {
		return "Rectangle (width=" + this.width + ", length=" + this.length + ")";
	}
}
/*
 * The Polygon class will keep track of the number of sides that a shape object
 * has
 */

//
abstract class Polygon
{
    // a shape needs at least 3 sides
    static int DEFAULT_N_SIDES = 3;
    private int nSides;
    
    // default constructor setting number of sides to 3
    Polygon()
    {
        this.nSides = DEFAULT_N_SIDES;
    }

    // secondary constructor setting nSides to input
    Polygon(int nSides)
    {
        if (nSides < DEFAULT_N_SIDES && nSides != 0) // we allow 0's through for Circle
        {
            this.nSides = DEFAULT_N_SIDES;
        }
        else 
        {
            this.nSides = nSides;
        }
    }

    // accessor
    public int getNSides()
    {
        return nSides;
    }

    // Shapes generally conserve their number of sides.
    // For now, I'll omit a mutator for nSides
    
    // abstract methods
    public abstract double getPerimeter();
    public abstract double getArea();
}
