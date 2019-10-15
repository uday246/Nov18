package Nov12;

public class Movie {
	// string variable to store the title
	private String title;
	// string variable to category
	private String category;

	// constructor to initialize the title and category
	public Movie(String aTitle, String aCategory) {
		super();
		title = aTitle;
		category = aCategory;
	}

	// method to return title
	public String getTitle() {
		return title;
	}
	// method to set title
	public void setTitle(String aTitle) {
		title = aTitle;
	}
	// method to return category
	public String getCategory() {
		return category;
	}
	// method to set category
	public void setCategory(String aCategory) {
		category = aCategory;
	}

}
