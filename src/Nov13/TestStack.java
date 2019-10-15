package Nov13;

class Stack {
	final int MAX = 100;
	private int top;
	private String a[]; // Maximum size of Stack

	// constructer calls when the object is created
	Stack() {
		a =  new String[MAX];
		top = -1; // initialize top value -1
	}

	// this method is used to insert values into stack

	void push(String x) {
		if (top >= (MAX - 1)) // here we check the condition if values are there
								// are not
		{
			System.out.println("Stack Overflow");
		} else {
			a[++top] = x;
			System.out.println("Push : " + x);
		}

	}

	// this method is used to delete top element
	String pop() {
		if (top < 0) // here also we check the condition if values are there are
						// not
		{
			System.out.println("Stack is Underflow");
			return null;
		} else {
			String x = a[top--];
			System.out.println("Pop : " + x);
			return x;
		}
	}

	// this method is used to display top element
	String peek() {
		if (top < 0) {
			System.out.println("No elements. Stack is Underflow");

		}
		System.out.println("Peek : " + a[top]);
		return a[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int getSize() {
		return top + 1;
	}
}

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("Apple");
		s.push("Oranges");
		s.push("Banans");
		System.out.println("The stack contains " + s.getSize());
		s.peek();
		System.out.println("The stack contains " + s.getSize());
		s.pop();
		s.pop();
		s.pop();
		System.out.println("The stack contains " + s.getSize());

	}
}
