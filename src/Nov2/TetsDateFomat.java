package Nov2;

import java.text.SimpleDateFormat;
import java.util.Scanner;

class DayException extends Exception {
	String msg;

	public DayException(String aMsg) {
		super();
		msg = aMsg;
	}

	@Override
	public String toString() {
		return msg;
	}

}

class MonthException extends Exception {
	String msg;

	public MonthException(String aMsg) {
		super();
		msg = aMsg;
	}

	@Override
	public String toString() {
		return msg;
	}

}

class YearException extends Exception {
	String msg;

	public YearException(String aMsg) {
		super();
		msg = aMsg;
	}

	@Override
	public String toString() {
		return msg;
	}

}

public class TetsDateFomat {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int month = getMonth(sc);
		int year = getYear(sc);
		int day = getDay(sc, month, year);

		String str = day + "/" + month + "/" + year;

		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");

		SimpleDateFormat sf1 = new SimpleDateFormat("MMMM dd yyyy");
		System.out.println(sf1.format(sf.parse(str)));

	}

	private static int getYear(Scanner aSc) {
		System.out.println("Enter year");
		int year = aSc.nextInt();
		if (year < 1000 || year > 3000)
			try {
				throw new YearException("Please enter a valid year");
			} catch (YearException e) {
				System.out.println(e);
				getYear(aSc);
			}
		return year;
	}

	private static int getMonth(Scanner aSc) {
		System.out.println("Enter Month");
		int month = aSc.nextInt();
		if (month < 0 || month > 12)
			try {
				throw new MonthException("Please enter valid month");
			} catch (MonthException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				getMonth(aSc);
			}
		return month;
	}

	private static int getDay(Scanner aSc, int aMonth, int aYear) {
		int day;
		System.out.println("Enter day");
		day = aSc.nextInt();
		if (day > getDays(aMonth, aYear)) {
			try {
				throw new DayException("Please enter valid day");
			} catch (DayException e) {
				e.printStackTrace();
				getDay(aSc, aMonth, aYear);
			}
		}
		return day;
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
}
