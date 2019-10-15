package Nov14;

public class List<E> {

private class Node {

private E data;

Node next;

public Node(E data) {

this.data = data;

this.next = null;

}

}

private Node head;

private Node tail;

private int length;

/****CONSTRUCTOR****/

/**

   * Instantiates a new List

   * with default values

   */

public List() {

   head = null;

tail = null;

length = 0;

}

/****ACCESSORS****/

/**

   * Returns the data stored at the head node

   * @return the first element

   * @throws IllegalStateException when List is empty

   */

public E getHead() throws IllegalStateException{

       if (length == 0) {

   throw new IllegalStateException("getHead(): List is empty.");

   }

   return head.data;

}

/**

   * Returns the value stored at the tail

   * @return the last element

   * @throws IllegalStateException when List is empty

   */

public E getTail() throws IllegalStateException{

if (length == 0) {

   throw new IllegalStateException("getTail(): List is empty");

}

return tail.data;

}

/**

   * Returns the current length of the list

   * @return the length of the list from 0 to n

   */

public int getLength() {
	int i=0;
	Node trav;
	for(trav=head,i=0;trav.next!=null;trav=trav.next,i++);
	
	return i;
	
//FILL IN HERE (IF POSSIBLE, DO IT WITH JUST ONE LINE OF CODE)

}

/**

   * Returns whether the list is currently empty

   * @return whether the list is empty

   */

public boolean isEmpty() {

	return head==null;
   //FILL IN HERE (IF POSSIBLE, DO IT WITH JUST ONE LINE OF CODE)

}

  

/**

   * List with each value separated by a blank space

   * At the end of the List a new line

   * @return the List as a String for display

   */

@Override public String toString() {

   String result = "";

Node temp = head;

while(temp != null) {

result += temp.data + " ";

temp = temp.next;

}

result += "\n";

return result;

}

/****MUTATORS****/

/**

   * Inserts a new element at the head

   * @param data the data to insert at the

   * head of the list

   */

public void insertHead(E data) {

   Node N = new Node(data);

if (length == 0) {

head = tail = N;

} else {

N.next = head;

head = N;

}

length++;

}

/**

   * Inserts a new element at the tail

   * @param data the data to insert at the

   * tail of the list

   */

public void insertTail(E data) {

   Node N = new Node(data);

   if(length == 0) {

head = tail = N;

   } else {

tail.next = N;

tail = N;

}

length++;

}

/**

* Removes the element at the head of the List

* @throws IllegalStateException

* when the List is empty

*/

public void removeHead() throws IllegalStateException{

   if (length == 0) {

throw new IllegalStateException("removeHead(): Cannot remove "

+ "from an empty List!");

} else if (length == 1) {

head = tail = null;

} else {

head = head.next;

}

length--;

}

/**

   * Removes the element at the tail of the List

   * @throws IllegalStateException

   * when the List is empty

   */

public void removeTail() throws IllegalStateException{

   if (length == 0) {

       throw new IllegalStateException("removeTail(): Cannot remove "

               + "from an empty List!");

   } else if (length == 1) {

       head = tail = null;

   } else {

       Node temp = head;

       while (temp.next != tail) {

           temp = temp.next;

       }

       tail = temp;

       tail.next = null;

       }

   length--;

}

}


