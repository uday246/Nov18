package Nov10;

import java.math.BigDecimal;
import java.util.ArrayList;

class Book {
	private static int count = 1000;
	private int ISBN;
	private double price;
	private String author;
	private int quantity;

	public Book(double aPrice, String aAuthor, int aQuantity) {
		super();
		ISBN = count++;
		price = aPrice;
		author = aAuthor;
		quantity = aQuantity;
	}

	public int getISBN() {
		return ISBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double aPrice) {
		price = aPrice;
	}

	public String getAuthor() {
		return author;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", price=" + price + ", author=" + author + ", quantity=" + quantity + "]";
	}

}

public class TestBook {
	public static void main(String[] args) {
		Book b1 = new Book(100, "Author A", 5);
		Book b2 = new Book(140, "Author A", 3);
		Book b3 = new Book(134, "Author B", 2);
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		b1.setPrice(220);

		for (Book b : list) {
			if (b.getAuthor().equals("Author A"))
				System.out.println(b);
		}
		BigDecimal bg1= new BigDecimal(10);
		BigDecimal bg2= new BigDecimal(10);
		bg1.add(bg2);
		System.out.println(bg2);

	}
}
