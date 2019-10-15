package Nov14;

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I a flying");
	}

	void sing() {
		System.out.println("I am singing");
	}
}

public class Solution {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.walk();
		b.fly();
		b.sing();
	}
}
