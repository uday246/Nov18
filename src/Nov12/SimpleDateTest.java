package Nov12;

class SimpleDate {
	private int day;
	private int month;
	private int year;

	public SimpleDate() {

	}

	public SimpleDate(int aDay, int aMonth, int aYear) {
		super();
		setYear(aYear);
		setMonth(aMonth);
		setDay(aDay);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int aDay) {
		int t = getDays(getMonth(), getYear());
		if (aDay <=t)
			day = aDay;
		else
			throw new IllegalArgumentException("Days must in range 1-31");
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int aMonth) {
		if (aMonth >= 1 && aMonth <= 12)
			month = aMonth;
		else
			throw new IllegalArgumentException("Month value must be in range 1-12");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int aYear) {
		year = aYear;
	}

	private static int getDays(int mm, int aYy) {
		int res = -1;
		switch (mm) {
		case 1:
			res = 31;
			break;
		case 2:
			if (isLeap(aYy))
				res = 28;
			else
				res = 29;
			break;
		case 3:
			res = 31;
			break;
		case 4:
			res = 30;
			break;
		case 5:
			res = 31;
			break;
		case 6:
			res = 30;
			break;
		case 7:
			res = 31;
			break;
		case 8:
			res = 31;
			break;
		case 9:
			res = 30;
			break;
		case 10:
			res = 31;
			break;
		case 11:
			res = 30;
			break;
		case 12:
			res = 31;
			break;

		}
		return res;
	}

	private static boolean isLeap(int year) {
		boolean leap = false;
		// if any year is divisable by 4 than there are many chances for leap
		// year except few
		if (year % 4 == 0) {
			// if it is divisable by 100 than it shoud also divisable by 400
			// like 2000 etc
			if (year % 100 == 0) {
				// year is divisible by 400, so the year is a leap year
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;
		return leap;
	}

	public String toString() {
		return day + "/" + month + "/" + year;
	}
}

public class SimpleDateTest {
	public static void main(String[] args) {
		SimpleDate sm = new SimpleDate(12, 11, 2018);
		System.out.println(sm);
		sm = new SimpleDate(32, 11, 2018);

	}
}
