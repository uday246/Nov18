package Nov17;

class Node {
	Node next;
	Integer data;
}

public class SortedLL {
	Node head;

	void sortedInsert(Node new_node) {
		Node current;

		if (head == null || head.data.compareTo(new_node.data) <= 0) {
			new_node.next = head;
			head = new_node;
		} else {

			current = head;

			while (current.next != null && current.next.data.compareTo(new_node.data) < 0)
				current = current.next;

			new_node.next = current.next;
			current.next = new_node;
		}
	}
}
