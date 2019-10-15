package Nov8;


public class TestMovie {
	public static void main(String[] args) {
		Movie m1 = new Movie("SpiderMan");
		m1.setDescription("its about spiderman");
		m1.setDirector("Smith");
		m1.setYear(2017);
		m1.setRating(4);
		
		System.out.println(m1);
		
		Movie m2 = new Movie("Batman",2017,"Smith","About batman",3);
		System.out.println(m2);

	}
}

class Movie {
	private String name;
	private int year;
	private String director;
	private String description;
	private int rating;

	public Movie(String aName) {
		super();
		name = aName;
	}

	// constructor to initialize the values
	public Movie(String aName, int aYear, String aDirector, String aDescription, int aRating) {
		super();
		name = aName;
		year = aYear;
		director = aDirector;
		description = aDescription;
		rating = aRating;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int aYear) {
		year = aYear;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String aDirector) {
		director = aDirector;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String aDescription) {
		description = aDescription;
	}

	// returns rating
	public int getRating() {
		return rating;
	}
	// sets the rating
	public void setRating(int aRating) {
		rating = aRating;
	}
	
	//prints the movie information
	@Override
	public String toString() {
		return "Movie [name=" + name + ", year=" + year + ", director=" + director + ", description=" + description
				+ ", rating=" + rating + "]";
	}

}
