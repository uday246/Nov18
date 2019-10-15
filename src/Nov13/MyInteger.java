package Nov13;

public class MyInteger {
	private int value;

	public MyInteger(int aValue) {
		super();
		value = aValue;
	}

	public boolean isEven() {
		return value % 2 == 0;
	}

	public boolean isOdd() {
		return value % 2 == 1;
	}

	public boolean isPrime() {
		if (value == 2)
			return true;
		if (value % 2 == 0)
			return false;
		for (int i = 2; i < value; i++)
			if (value % i == 0)
				return false;
		return true;
	}

	public boolean isEven(int value) {
		return value % 2 == 0;
	}

	public boolean isOdd(int value) {
		return value % 2 == 1;
	}

	public boolean isPrime(int value) {
		if (value == 2)
			return true;
		if (value % 2 == 0)
			return false;
		for (int i = 2; i < value; i++)
			if (value % i == 0)
				return false;
		return true;
	}

	public boolean isEven(MyInteger value) {
		return value.isEven();
	}

	public boolean isOdd(MyInteger value) {
		return value.isOdd();
	}

	public boolean isPrime(MyInteger value) {
		return value.isPrime();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyInteger other = (MyInteger) obj;
		if (value != other.value)
			return false;
		return true;
	}

	public int parseInt(String s) {
		return Integer.parseInt(s);
	}

	public int parseInt(char s[]) {
		return Integer.parseInt(new String(s));
	}
}
