package Nov2;

class Picture {
	private int size;
	private boolean color;
	private String format;
	String validFormts = "bmp,jpeg,tiff,png,gif";

	// default constructor
	public Picture() {
		size = 1;
		color = true;
		format = "none";
	}
	// Parameterized constructor to assign the values
	public Picture(int aSize, String aFormat, boolean aColor) {
		super();
		if (aSize >= 1)
			size = aSize;
		else
			size = 1;
		color = aColor;
		//checking if the format is valid
		if (validFormts.contains(aFormat.toLowerCase()))
			format = aFormat.toLowerCase();
		else
			format = "none";

	}

	public int getSize() {
		return size;
	}

	public void setSize(int aSize) {
		if (aSize >= 1)
			size = aSize;
	}

	public boolean getColor() {
		return color;
	}

	public void setColor(boolean aColor) {
		color = aColor;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String aFormat) {
		
	}

	//toString method to return the object representation
	public String toString() {
		String str = "Picture is";
		if (color)
			str += " color, ";
		else
			str += " black and white, ";
		str += size + " kb big, and in " + format + " format";
		return str;
	}

}

public class PictureTest {
	public static void main(String[] args) {
		//creating object with parameterized constructor
		Picture p = new Picture(10, "jpeg", true);
		System.out.println(p);
		p.setFormat("abc");
		System.out.println(p);
		//creating object with default constructor
		Picture p1 = new Picture();
		System.out.println(p1);

	}
}
