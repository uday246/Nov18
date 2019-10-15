package Nov13;

class Time2 {
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

	// Time2 no-argument constructor:
	// initializes each instance variable to zero
	public Time2() {
		this(0, 0, 0); // invoke constructor with three arguments
	}

	// Time2 constructor: hour supplied, minute and second defaulted to 0
	public Time2(int hour) {
		this(hour, 0, 0); // invoke constructor with three arguments
	}

	// Time2 constructor: hour and minute supplied, second defaulted to 0
	public Time2(int hour, int minute) {
		this(hour, minute, 0); // invoke constructor with three arguments
	}

	// Time2 constructor: hour, minute and second supplied
	public Time2(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}

		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}

		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// Time2 constructor: another Time2 object supplied
	public Time2(Time2 time) {
		// invoke constructor with three arguments
		this(time.hour, time.minute, time.second);
	}

	// Set Methods
	// set a new time value using universal time;
	// validate the data
	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}

		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}

		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// validate and set hour
	public void setHour(int hour) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}

		this.hour = hour;
	}

	// validate and set minute
	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}

		this.minute = minute;
	}

	// validate and set second
	public void setSecond(int second) {
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}

		this.second = second;
	}

	// Get Methods
	// get hour value
	public int getHour() {
		return hour;
	}

	// get minute value
	public int getMinute() {
		return minute;
	}

	// get second value
	public int getSecond() {
		return second;
	}

	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}

	void incrementSec() {
		second++;
		if (second > 59) {
			second = 0;
			incremntMin();
		}
	}

	void incremntMin() {
		minute++;
		if (minute > 59) {
			minute = 0;
			incrementHour();
		}
	}

	void incrementHour() {
		if (hour == 23) {
			hour = 0;
		} else {
			hour++;
		}
	}
}

public class Time2Test {
	public static void main(String[] args) {
		Time2 t1 = new Time2(); // 00:00:00
		Time2 t2 = new Time2(2); // 02:00:00
		Time2 t3 = new Time2(21, 34); // 21:34:00
		Time2 t4 = new Time2(12, 25, 42); // 12:25:42
		Time2 t5 = new Time2(t4); // 12:25:42

		System.out.println("Constructed with:");
		displayTime("t1: all default arguments", t1);
		displayTime("t2: hour specified; default minute and second", t2);
		displayTime("t3: hour and minute specified; default second", t3);
		displayTime("t4: hour, minute and second specified", t4);
		displayTime("t5: Time2 object t4 specified", t5);
		t5.incrementHour();
		t5.incremntMin();
		t5.incrementSec();
		displayTime("t5: Time2 object t4 specified", t5);

		// attempt to initialize t6 with invalid values
		try {
			Time2 t6 = new Time2(27, 74, 99); // invalid values
		} catch (IllegalArgumentException e) {
			System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
		}

		Time2 sec = new Time2(11, 59, 59);
		Time2 min = new Time2(12, 59, 0);
		Time2 day = new Time2(23, 59, 0);
		displayTime("Seconds Test: ", sec);
		displayTime("Minutues Test: ", min);
		displayTime("Day Test: ", day);

		sec.incrementSec();
		min.incremntMin();
		day.incrementHour();
		displayTime("Seconds Test: ", sec);
		displayTime("Minutues Test: ", min);
		displayTime("Day Test: ", day);

	}

	// displays a Time2 object in 24-hour and 12-hour formats
	private static void displayTime(String header, Time2 t) {
		System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());
	}
}
