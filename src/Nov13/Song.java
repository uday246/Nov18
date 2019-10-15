package Nov13;

public class Song {
	private String name;
	private String artist;
	private String category;
	private String price;

	public Song(String aName, String aArtist, String aCategory, String aPrice) {
		super();
		name = aName;
		artist = aArtist;
		category = aCategory;
		price = aPrice;
	}

	public Song() {

	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String aArtist) {
		artist = aArtist;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String aCategory) {
		category = aCategory;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String aPrice) {
		price = aPrice;
	}

}
