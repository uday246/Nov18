package Nov14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedList

{

	private Node Head;

public LinkedList()

{

Head = null;

}

	public void insert(int value) {

		if (!contains(value)) {

			Node newNode = new Node(value);

			Node temp = Head;

			if (temp == null) {

				Head = newNode;

			} else {

				while (temp.next != null) {

					temp = temp.next;

				}

				temp.next = newNode;

			}

		}

	}

	public boolean contains(int value) {

		Node temp = Head;

		while (temp != null) {

			if (temp.data == value) {

				return true;

			}

			temp = temp.next;

		}

		return false;

	}

	public boolean delete(int value) {

		if (Head != null && Head.data == value) {

			Head = Head.next;

			return true;

		}

		Node temp = Head;

		while (temp.next != null) {

			if (temp.next.data == value) {

				temp.next = temp.next.next;

				return true;

			}

			temp = temp.next;

		}

		return false;

	}

	public String toString() {

		String data = "[";

		Node temp = Head;

		while (temp != null) {

			data += temp.data;

			temp = temp.next;

			if (temp != null) {

				data += ", ";

			}

		}

		data += "]";

		return data;

	}

}

class Node {

	int data;

	Node next;

	public Node(int data) {

		this.data = data;

	}

}

public class LinkedListDriver {

	public static void main(String[] args) throws Exception, IOException {

		LinkedList list = new LinkedList();

        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 


		int input = 0;

		System.out.println("Enter a series of integers, (-9999 to stop)");

		while (input != -9999) {

			input = Integer.parseInt(reader.readLine());

			if (input != -9999) {

				list.insert(input);

			}

		}

		System.out.println("List: " + list);

		System.out.println("Enter a number to delete: ");

		input = Integer.parseInt(reader.readLine());

		if (list.delete(input)) {

			System.out.println("Deletion was successfull!");

		} else {

			System.out.println(input + " is not found in the list");

		}

		System.out.println(list);

	}

}
