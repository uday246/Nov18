package Prmr;

public class Book {
	private String title;
	private String author;
	private int noOfPages;
	private int noOfLastPage;

	public Book(String aTitle, String aAuthor, int aNoOfPages) {
		super();
		title = aTitle;
		author = aAuthor;
		noOfPages = aNoOfPages;
	}

	public int getNoOfLastPage() {
		return noOfLastPage;
	}

	public void setNoOfLastPage(int aNoOfLastPage) {
		noOfLastPage = aNoOfLastPage;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public double getFinishedPercentage() {
		return (noOfLastPage / (double) noOfPages) * 100;
	}
	public static void main(String[] args) {
		Book  b= new Book("A", "B", 100);
		b.setNoOfLastPage(60);
		System.out.println(b.getFinishedPercentage());
	}
}
