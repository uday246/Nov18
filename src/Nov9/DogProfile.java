package Nov9;

public class DogProfile {
	private String name;
	private String temperament;
	private double bitingProbability;

	public DogProfile(String aName, String aTemperament, double aBitingProbability) {
		super();
		name = aName;
		temperament = aTemperament;
		bitingProbability = aBitingProbability;
	}

	public DogProfile() {
		name = "Fido";
		temperament = "always wags tail";
		bitingProbability = 100;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getTemperament() {
		return temperament;
	}

	public void setTemperament(String aTemperament) {
		temperament = aTemperament;
	}

	public double getBitingProbability() {
		return bitingProbability;
	}

	public void setBitingProbability(double aBitingProbability) {
		bitingProbability = aBitingProbability;
	}

	public String goodBoy() {
		if (bitingProbability <= 1000.0)
			return "Bad Boy";
		else
			return "Good Boy";
	}
}
