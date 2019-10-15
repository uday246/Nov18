package Nov7;

class Player {
	private String name;
	private int x;
	private int y;
	private int health;
	private int damage;

	public Player(String aName, int aX, int aY, int aHealth, int aDamage) {
		super();
		name = aName;
		x = aX;
		y = aY;
		health = aHealth;
		damage = aDamage;
	}

	void hit(Player other) {
		other.health = other.health - this.damage;
		if (other.health < 0)
			other.health = 0;
	}

	boolean teleport(int uBoundX, int uBoundY, int lBoundX, int lBoundY, int destX, int destY) {
		if (destX <= uBoundX && destX >= lBoundX && destY <= uBoundY && destY >= lBoundY) {
			x = destX;
			y = destY;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return name + "(" + health + ") at " + x + " , " + y;
	}

}

public class TestPlayer {
	public static void main(String[] args) {
		Player p1 = new Player("Uday", 100, 100, 100, 20);
		Player p2 = new Player("Koti", 70, 70, 100, 10);
		p1.teleport(200, 200, 10, 10, 50, 50);
		p1.hit(p2);
		System.out.println(p1);
		System.out.println(p2);
			
	}
}
