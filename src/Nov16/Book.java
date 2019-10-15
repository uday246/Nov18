package Nov16;

public class Book {
private String title;
private String author;
private double price;
private int id;
private static int count=1;
public Book(String aTitle, String aAuthor, double aPrice) {
	super();
	title = aTitle;
	author = aAuthor;
	price = aPrice;
	id = count++;
}
public String getTitle() {
	return title;
}
public void setTitle(String aTitle) {
	title = aTitle;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String aAuthor) {
	author = aAuthor;
}
public double getPrice() {
	return price;
}
public void setPrice(double aPrice) {
	price = aPrice;
}
public int getId() {
	return id;
}
public void setId(int aId) {
	id = aId;
}
public static int getCount() {
	return count;
}
public static void setCount(int aCount) {
	count = aCount;
}

}
