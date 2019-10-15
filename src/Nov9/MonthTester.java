package Nov9;

class Month {

	private int monthNumber;
	public Month(){
		monthNumber=1;
	}
	/**
	 * @param m
	 */
	public Month(int m) {
		if (m >= 1 && m <= 12)
			monthNumber = m;
		else
			monthNumber = 1;
	}

	/**
	 * @param str
	 */
	public Month(String str) {
		monthNumber = getMonthNumber(str);
	}

	public Month(Month m) {
		this.monthNumber = m.monthNumber;
	}

	public int getMonthNumber() {
		return monthNumber;
	}

	public void setMonthNumber(int aMonth) {
		monthNumber = aMonth;
	}

	/**
	 * @return
	 */
	public String getMonthName() {
		String arr[] = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		return arr[monthNumber];
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		if (monthNumber != other.monthNumber)
			return false;
		return true;
	}

	/**
	 * @param input
	 * @return
	 */
	private int getMonthNumber(String input) {
		// equalsIgnorecase checks equality irrespective of the case
		int res = -1;
		if (input.equalsIgnoreCase("january"))
			res = 1;
		if (input.equalsIgnoreCase("february"))
			res = 2;
		if (input.equalsIgnoreCase("march"))
			res = 3;
		if (input.equalsIgnoreCase("april"))
			res = 4;
		if (input.equalsIgnoreCase("may"))
			res = 5;
		if (input.equalsIgnoreCase("june"))
			res = 6;
		if (input.equalsIgnoreCase("july"))
			res = 7;
		if (input.equalsIgnoreCase("august"))
			res = 8;
		if (input.equalsIgnoreCase("september"))
			res = 9;
		if (input.equalsIgnoreCase("october"))
			res = 10;
		if (input.equalsIgnoreCase("november"))
			res = 11;
		if (input.equalsIgnoreCase("december"))
			res = 12;
		return res;
	}

	public boolean greaterThan(Month m) {
		return this.monthNumber > m.monthNumber;
	}

	public boolean lessThan(Month m) {
		return this.monthNumber < m.monthNumber;
	}
}

public class MonthTester {
	public static void main(String[] args) {
		Month m1 = new Month(4);
		Month m2 = new Month("March");
		System.out.println(m1.getMonthName());
		System.out.println(m2.getMonthNumber());
		System.out.println(m1.greaterThan(m2));
		System.out.println(m1.lessThan(m2));
		
		
	}
}
