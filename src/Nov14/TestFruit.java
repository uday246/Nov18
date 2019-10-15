package Nov14;
class Apple{
	private String taste;
	private String color;
	private String shape;
	public Apple(String aTaste, String aColor, String aShape) {
		super();
		taste = aTaste;
		color = aColor;
		shape = aShape;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String aTaste) {
		taste = aTaste;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String aColor) {
		color = aColor;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String aShape) {
		shape = aShape;
	}
	@Override
	public String toString() {
		return "Apple [taste=" + taste + ", color=" + color + ", shape=" + shape + "]";
	}
	
}
class Kiwi{
	private String taste;
	private String color;
	private String shape;
	public Kiwi(String aTaste, String aColor, String aShape) {
		super();
		taste = aTaste;
		color = aColor;
		shape = aShape;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String aTaste) {
		taste = aTaste;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String aColor) {
		color = aColor;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String aShape) {
		shape = aShape;
	}
	@Override
	public String toString() {
		return "Kiwi [taste=" + taste + ", color=" + color + ", shape=" + shape + "]";
	}
}
public class TestFruit {
public static void main(String[] args) {
	Apple a = new Apple("sweet", "red", "round");
	Kiwi k = new Kiwi("tangy", "green", "oblong");
	System.out.println(a);
	System.out.println(k);
}
}
