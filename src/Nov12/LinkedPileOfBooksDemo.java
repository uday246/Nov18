package Nov12;

import java.util.Arrays;

interface PileOfBooksInterface {
	/**
	 * This method adds a book to the top of the pile
	 *
	 * @param title
	 *            Title of the book that is to be added to the pile
	 */
	void addBookToTop(String title);

	/**
	 * This method removes the top book from the pile
	 *
	 * @return Title of the removed book
	 */
	String removeBookFromTop();

	/**
	 * This method returns the size of the pile. i.e., the number of books in
	 * the pile
	 *
	 * @return Size of the pile
	 */
	int size();

	/**
	 * Method to check if the pile is empty
	 *
	 * @return True if the pile has no books
	 */
	boolean isEmpty();
}
class ResizableArrayBag<T>{}
// Task 2
class ResizableArrayPileOfBooks implements PileOfBooksInterface {

	// A resizable array bag to store the pile of books
	private ResizableArrayBag<String> resizableArrayBag;

	public ResizableArrayPileOfBooks() {
		// Initialize the bag
		resizableArrayBag = new ResizableArrayBag<>();
	}

	// This method takes O(1) in both best and O(n)
	// If the array has extra space, the element could be added in O(1).
	// If there is no extra space in the array, the array size needs to be
	// increased and all the elements need to be copied. This will take O(n)
	@Override
	public void addBookToTop(String title) {
		// Add the given book title to the end of the bag
		resizableArrayBag.add(title);
	}

	// This method takes O(1) in both best and worst case because removing the
	// last element from a resizable array bag takes O(1)
	@Override
	public String removeBookFromTop() {
		// Remove the last entry(most recent) from the bag and return it
		return resizableArrayBag.remove();
	}

	// This method takes O(1) in both best and worst case because size is
	// maintained as an attribute and just this attribute needs to be returned
	@Override
	public int size() {
		// Return the size of the bag
		return resizableArrayBag.getCurrentSize();
	}

	// This method takes O(1) because it just checks if the size is 0 or not
	@Override
	public boolean isEmpty() {
		// If the bag is empty, then the pile is empty
		return resizableArrayBag.isEmpty();
	}

	// This method takes O(n) in all cases. It involves copying
	// all the elements in the bag to an array
	@Override
	public String toString() {
		return Arrays.toString(resizableArrayBag.toArray());
	}
}

class ResizableArrayPileOfBooksDemo {

	public static void main(String[] args) {
		// Create a pile
		ResizableArrayPileOfBooks pileOfBooks = new ResizableArrayPileOfBooks();
		// Add 3 books to the pile
		pileOfBooks.addBookToTop("Book 1");
		pileOfBooks.addBookToTop("Book 2");
		pileOfBooks.addBookToTop("Book 3");

		// Print the pile of books. It should have books 1, 2 and 3
		System.out.print("Pile Initially: ");
		System.out.println(pileOfBooks.toString());

		// Now remove the top book and print it. It should book 3
		System.out.println("The top book is: " + pileOfBooks.removeBookFromTop());
		// And the pile should have just two books now
		System.out.print("Pile after removing book 3: ");
		System.out.println(pileOfBooks.toString());

		// now add book 4
		pileOfBooks.addBookToTop("Book 4");
		System.out.print("Pile after adding book 4: ");
		System.out.println(pileOfBooks.toString());

	}
}

// Task 3
class LinkedPileOfBooks implements PileOfBooksInterface {

	private LinkedBag<String> linkedBag;

	public LinkedPileOfBooks() {
		linkedBag = new LinkedBag<>();
	}

	// This method takes O(1) in both best and worst case because adding an
	// element to a linked bag takes O(1)
	@Override
	public void addBookToTop(String title) {
		// Add the given book title to the end of the bag
		linkedBag.add(title);
	}

	// This method takes O(1) in both best and worst case because removing the
	// last element from a linked bag takes O(1)
	@Override
	public String removeBookFromTop() {
		// Remove the last entry(most recent) from the bag and return it
		return linkedBag.remove();
	}

	// This method takes O(1) in both best and worst case because size is
	// maintained as an attribute and just this attribute needs to be returned
	@Override
	public int size() {
		// Return the size of the bag
		return linkedBag.getCurrentSize();
	}

	// This method takes O(1) because it just checks if the size is 0 or not
	@Override
	public boolean isEmpty() {
		// If the bag is empty, then the pile is empty
		return linkedBag.isEmpty();
	}

	// This method takes O(n) in all cases. It involves copying
	// all the elements in the bag to an array
	@Override
	public String toString() {
		return Arrays.toString(linkedBag.toArray());
	}
}

public class LinkedPileOfBooksDemo {

	public static void main(String[] args) {
		// Create a pile
		LinkedPileOfBooks pileOfBooks = new LinkedPileOfBooks();
		// Add 3 books to the pile
		pileOfBooks.addBookToTop("Book 1");
		pileOfBooks.addBookToTop("Book 2");
		pileOfBooks.addBookToTop("Book 3");

		// Print the pile of books. It should have books 1, 2 and 3
		System.out.print("Pile Initially: ");
		System.out.println(pileOfBooks.toString());

		// Now remove the top book and print it. It should book 3
		System.out.println("The top book is: " + pileOfBooks.removeBookFromTop());
		// And the pile should have just two books now
		System.out.print("Pile after removing book 3: ");
		System.out.println(pileOfBooks.toString());

		// now add book 4
		pileOfBooks.addBookToTop("Book 4");
		System.out.print("Pile after adding book 4: ");
		System.out.println(pileOfBooks.toString());

	}
}