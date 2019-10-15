package Nov9;

public class GameReview {
	private String name;
	private String developer;
	private int graphics;
	public GameReview(){

	}
	public GameReview(String aName, String aDeveloper, int aGraphics) {
		super();
		name = aName;
		developer = aDeveloper;
		graphics = aGraphics;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String aDeveloper) {
		developer = aDeveloper;
	}
	public int getGraphics() {
		return graphics;
	}
	public void setGraphics(int aGraphics) {
		graphics = aGraphics;
	}
	@Override
	public String toString() {
		return "name : " + name + ", developer : " + developer + ", graphics : " + graphics;
	}

}
