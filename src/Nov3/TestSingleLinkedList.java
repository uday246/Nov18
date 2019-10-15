package Nov3;

class Node {
	int data;
	Node next;

	Node() {
		next = null;
	}

	Node(int d) {
		data = d;
		next = null;
	}
}

class SingleLinkedList {

	// Add the given node to the front of the list
	void addFront(Node head, int ele) {
		// create node with given data
		Node new_node = new Node(ele);
		// as we are inserting in the first so already existing nodes must me
		// linked with new node so append it
		new_node.next = head;
		// now point head node to the newly created node
		head = new_node;
	}

	// add a new node after the given node
	public static void set(int ele, int i, Node head) {
		Node trav = head;
		int count = 0;
		while (trav != null) {
			if (count == i) {
				trav.data = ele;
				break;
			}
			count++;
			trav = trav.next;
		}
	}

	// inserts node at the end of the list
	public static void listTailInsert(Node head, int ele) {
		// creates node with given data
		Node new_node = new Node(ele);

		// if list is empty than make new node as head
		if (head == null) {
			head = new Node(ele);
			return;
		}

		// as the we are inserting node in the end so next will null
		new_node.next = null;

		// traverse the list till the end
		Node trav = head;
		while (trav.next != null)
			trav = trav.next;

		// link new node to last node
		trav.next = new_node;
		return;
	}

	public static int countZeros(Node head) {
		Node trav = head;
		int count = 0;
		while (trav != null) {
			if (trav.data == 0)
				count++;
			trav = trav.next;
		}
		return count - 1;
	}

	public static void display(Node head) {
		Node trav = head.next;
		while (trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
	}
}

public class TestSingleLinkedList {
	public static void main(String[] args) {
		Node head = new Node();
		SingleLinkedList.listTailInsert(head, 5);
		SingleLinkedList.listTailInsert(head, 3);
		SingleLinkedList.listTailInsert(head, 0);
		SingleLinkedList.listTailInsert(head, 2);
		SingleLinkedList.listTailInsert(head, 57);
		SingleLinkedList.listTailInsert(head, 0);
		SingleLinkedList.listTailInsert(head, 0);
		System.out.println(SingleLinkedList.countZeros(head));
		SingleLinkedList.display(head);
		System.out.println();
		SingleLinkedList.set(111, 2, head);
		SingleLinkedList.display(head);
	}
}
