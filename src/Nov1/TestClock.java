package Nov1;

class Clock {
	private int hour;
	private int min;

	public Clock() {
		hour = 0;
		min = 0;
	}

	public Clock(int h) {
		hour = h;
		min = 0;
	}

	public Clock(int aHour, int aMin) {
		super();
		hour = aHour;
		min = aMin;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int aHour) {
		hour = aHour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int aMin) {
		min = aMin;
	}

	@Override
	public String toString() {
		String res;
		if (hour < 10)
			res = "0" + hour;
		else
			res = hour + "";
		if (min < 10)
			res = res + " : 0" + min;
		else
			res = res + " : " + min;

		return res;
	}

	public void incrementTimer() {
		System.out.println("Incremented by 1");
		min++;
		hour = hour + min / 60;
		min = min % 60;
	}

	public void incrementTimer(int x) {
		System.out.println("Incremented by " + x);
		min += x;
		hour = hour + min / 60;
		min = min % 60;
	}

	public void setTime(int h, int m) {
		hour = h;
		min = m;
	}
}

public class TestClock {
	public static void main(String[] args) {
		System.out.println("Creating with 12 59");
		Clock c = new Clock(12, 59);
		System.out.println(c);
		System.out.println("Incrementing time");
		c.incrementTimer();
		System.out.println(c);

	}
}
