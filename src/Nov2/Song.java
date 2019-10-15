package Nov2;

import java.util.Arrays;

public class Song implements Comparable {
	private String name;
	private int year;
	private int numberOfWriters;
	private String writers[];
	private int rating;

	public Song(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int aYear) {
		year = aYear;
	}

	public int getNumberOfWriters() {
		return numberOfWriters;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int aRating) {
		rating = aRating;
	}

	public void addWriter(String n) {
		writers[numberOfWriters++] = n;
	}

	public String[] getWriters() {
		return writers;
	}

	public String getWriteAtIndex(int index) {
		if (writers.length > index)
			return writers[index];
		else

			return null;
	}

	public String toString() {
		return "Name : " + name + " Year : " + year + " Rating : " + rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfWriters;
		result = prime * result + rating;
		result = prime * result + Arrays.hashCode(writers);
		result = prime * result + year;
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
		Song other = (Song) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfWriters != other.numberOfWriters)
			return false;
		if (rating != other.rating)
			return false;
		if (!Arrays.equals(writers, other.writers))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object aO) {
		Song s = (Song) aO;
		return name.compareTo(s.name);
	}

}
