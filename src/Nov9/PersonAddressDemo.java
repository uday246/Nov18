package Nov9;

class Person {

	String firstName;

	String lastName;

	String emailId;

	long phoneNumber;

	// accessor method for first name

	public String getFirstName() {

		return firstName;

	}

	// mutator method for first name

	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}

	// accessor method for last name

	public String getLastName() {

		return lastName;

	}

	// mutator method for last name.

	public void setLastName(String lastName) {

		this.lastName = lastName;

	}

	// accessor method for email id.

	public String getEmailId() {

		return emailId;

	}

	// mutator method for email id.

	public void setEmailId(String emailId) {

		this.emailId = emailId;

	}

	// accessor method for phone number.

	public long getPhoneNumber() {

		return phoneNumber;

	}

	// mutator method for phone number.

	public void setPhoneNumber(int phoneNumber) {

		this.phoneNumber = phoneNumber;

	}

	// this method will print all the values of person object.

	@Override

	public String toString() {

		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", phoneNumber="

				+ phoneNumber + "]";

	}

	// this method will checks the objects and returns true if all the values
	// are matched.

	@Override

	public boolean equals(Object obj) {

		if (this == obj) {

			return true;

		}

		if (obj == null) {

			return false;

		}

		if (!(obj instanceof Person)) {

			return false;

		}

		Person other = (Person) obj;

		if (emailId == null) {

			if (other.emailId != null) {

				return false;

			}

		} else if (!emailId.equals(other.emailId)) {

			return false;

		}

		if (firstName == null) {

			if (other.firstName != null) {

				return false;

			}

		} else if (!firstName.equals(other.firstName)) {

			return false;

		}

		if (lastName == null) {

			if (other.lastName != null) {

				return false;

			}

		} else if (!lastName.equals(other.lastName)) {

			return false;

		}

		if (phoneNumber != other.phoneNumber) {

			return false;

		}

		return true;

	}

}

public class PersonAddressDemo {

	public static void main(String[] args) {

		// Creating data for Person objects

		Person p1 = new Person();

		p1.setFirstName("John");

		p1.setLastName("Carry");

		p1.setEmailId("john.carrey@abc.com");

		p1.setPhoneNumber(123456789);

		Person p2 = new Person();

		p2.setFirstName("Sean");

		p2.setLastName("Luke");

		p2.setEmailId("sean.luke@abc.com");

		p2.setPhoneNumber(564943939);

		Person p3 = new Person();

		p3.setFirstName("Jonny");

		p3.setLastName("Sheeny");

		p3.setEmailId("jonny.sheeny@abc.com");

		p3.setPhoneNumber(56478699);

		Person p4 = new Person();

		p4.setFirstName("John");

		p4.setLastName("Carry");

		p4.setEmailId("john.carrey@abc.com");

		p4.setPhoneNumber(123456789);

		// Printing data for all Person objects

		System.out.println(p1.toString());

		System.out.println(p2.toString());

		System.out.println(p3.toString());

		System.out.println(p4.toString());

		// Comparing Person p1 and Person p2 . Below will return false since the
		// data is not same.

		System.out.println("Comparing p1 and p2 " + p1.equals(p2));

		// Comparing Person p1 and Person p4 . Below will return true since the
		// data is same.

		System.out.println("Comparing p1 and p4 " + p1.equals(p4));

	}

}
