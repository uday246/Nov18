import java.util.Arrays;

/**
 * Tests the TV class.
 * 
 */
public class TVRunner {
	public static void main(String[] args) {
		Comparable[] inventory = new TV[6];
		inventory[1] = new TV("Sony", 55.0);
		inventory[0] = new TV("Westinghouse", 43.0);
		inventory[2] = new TV("LG Electronics", 55.0);
		inventory[4] = new TV("Panasonic", 60);
		inventory[5] = new TV("Toshiba", 60.0);
		inventory[3] = new TV("Sharp", 55);
		Runnable r =()->System.out.println("Hi");
		new Thread(r).start();

		TV tv = (TV) inventory[1];
		System.out.println("test implements Comparable: " + tv.getBrand() + " " + tv.getSize());

		Arrays.sort(inventory);

		for (Comparable c : inventory) {
			System.out.println(c);
		}
		Arrays.
	}
}

/**
 * Models a television with a brand and a screen size in inches
 */
class TV implements Comparable {
	private String brand;
	private double size;

	public TV(String aBrand, double aSize) {
		super();
		brand = aBrand;
		size = aSize;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String aBrand) {
		brand = aBrand;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double aSize) {
		size = aSize;
	}

	/**
	 * Gets a string representation of the object
	 * 
	 * @return a string representation of the object
	 */
	public String toString() {
		String s = getClass().getName() + "[brand=" + brand + ",size=" + size + "]";
		return s;
	}

	@Override
	public int compareTo(Object aO) {
		TV tv = (TV) aO;
		Double i1 = this.size;
		Double i2 = tv.size;
		if (i1.compareTo(i2) == 0)
			return this.brand.compareTo(tv.brand);
		return i1.compareTo(i2);
	}
}