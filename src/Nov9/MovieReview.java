package Nov9;

public class MovieReview {
	private String name;
	private String genre;
	private int rating;
	public MovieReview(String aName, String aGenre, int aRating) {
		super();
		name = aName;
		genre = aGenre;
		rating = aRating;
	}
	public MovieReview(){
		name="Goofy Movie 2: The Extremely Goofy Movie";
		genre="Thriller";
		rating=10;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String aGenre) {
		genre = aGenre;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int aRating) {
		rating = aRating;
	}
	public String howYouReallyFeel(){
		if(rating<0)
			return "Garbage";
		if(rating<=5)
			return "Boo";
		if(rating<=7)
			return "Meh";
		if(rating<=9)
			return "Good";
		return "Must be THE Goofy Movie 2";
		
	}
}
