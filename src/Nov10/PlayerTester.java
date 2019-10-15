package Nov10;

class Player {
	private int number;
	private String name;
	private String position;

	Player() {
		number = 0;
		name = "";
		position = "";
	}

	Player(int n, String na, String p) {
		number = n;
		name = na;
		position = p;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int aNumber) {
		number = aNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String aPosition) {
		position = aPosition;
	}

	@Override
	public String toString() {
		return "number=" + number + ", name=" + name + ", position=" + position;
	}

}

class BaseBallPlayer extends Player {
	private double battingAvg;

	public BaseBallPlayer(int aN, String aNa, String aP, double aBattingAvg) {
		super(aN, aNa, aP);
		battingAvg = aBattingAvg;
	}

	@Override
	public String toString() {
		return "BaseBallPlayer [Batting Avg=" + battingAvg + ", toString()=" + super.toString() + "]";
	}
}

class BasketBallPlayer extends Player {
	private double throwPercentage;

	public BasketBallPlayer(int aN, String aNa, String aP, double aThrowPercentage) {
		super(aN, aNa, aP);
		throwPercentage = aThrowPercentage;
	}

	@Override
	public String toString() {
		return "BasketBallPlayer [throwPercentage=" + throwPercentage + ", toString()=" + super.toString() + "]";
	}

}

public class PlayerTester {
	public static void main(String[] args) {
		Player p1 = new BasketBallPlayer(1, "Koti", "Defender", 90);
		Player p2 = new BaseBallPlayer(2, "Uday", "Opener", 80);
		System.out.println(p1);
		System.out.println(p2);

	}
}
