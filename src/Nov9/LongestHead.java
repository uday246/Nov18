package Nov9;

class Coin {

	/** Internal representation of coin showing heads. */

	public static final int HEADS = 0;

	/** Internal representation of coin showing tails. */

	public static final int TAILS = 1;

	/** Coin's current face showing. */

	private int face;

	/**
	 * 
	 * Constructs a Coin object and flips it to give it a starting value.
	 * 
	 */

	public Coin() {

		flip();

	}

	/**
	 * 
	 * Flips this Coin by randomly choosing a face value.
	 * 
	 */

	public void flip() {

		face = (int) (Math.random() * 2);

	}

	/**
	 * 
	 * Returns true if the current face of the Coin is heads.
	 * 
	 * @return true if current face is heads, else false.
	 * 
	 */

	public boolean isHeads() {

		return (face == HEADS);

	}

	/**
	 * 
	 * Returns the current face value of this Coin as a String.
	 * 
	 * @return toString description
	 * 
	 */

	public String toString() {

		String faceName;

		if (face == HEADS) {

			faceName = "Heads";

		} else {

			faceName = "Tails";

		}

		return faceName;

	}

}

public class LongestHead {
	public static void main(String[] args) {
		Coin c = new Coin();
		int count = 0, maxSoFar = -1;
		//looping to toss 100 times
		for (int i = 0; i < 100; i++) {
			//flipping the coin
			c.flip();
			//checking if it is heads
			if (c.isHeads()) {
				count++;
			} else {
				// if it fails
				// checking if it breaks max so far
				if (maxSoFar < count)
					maxSoFar = count;
				count = 0;
			}
			System.out.println(c);
		}
		if(maxSoFar<count)
			maxSoFar=count;
		//printing the longest head count
		System.out.println("Longest Head Count : "+maxSoFar);
	}
}
