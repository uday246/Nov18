package Nov12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Node<T> {
	T data;
	Node link;

	Node(T data, Node link) {
		this.data = data;
		this.link = link;
	}
}

class Stack<T> {
	Node top;

	Stack() {
		top = null;
	}

	public void push(T a) {
		Node n;
		if (top == null) {
			n = new Node(a, null);
			top = n;
		} else {
			n = new Node(a, null);
			n.link = top;
			top = n;
		}

	}

	public T pop() {
		Node temp;
		T res = null;
		if (top != null) {
			res = (T) top.data;
			System.out.println("The deleted element is " + top.data);
			temp = top.link;
			top.link = null;
			top = temp;
			temp = null;

		} else {
			System.out.println("Stack is empty");
		}
		return res;
	}

	public void peek() {
		if (top == null)
			System.out.println("Stack is empty");
		else
			System.out.println("the top element is " + top.data);
	}

	public void display() {
		Node temp;
		if (top == null)
			System.out.println("the stack is empty");
		else {
			System.out.println("the elements are");
			for (temp = top; temp != null; temp = temp.link)
				System.out.println(temp.data);
		}
	}

	public boolean isEmpty() {
		return top == null;
	}
}

public class Mary {

	static Stack<String> stack = new Stack<String>();

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String filename;
		Scanner infile = null;
		while (true) {
			System.out.println("Enter input filename: ");
			filename = keyboard.nextLine();
			try {
				infile = new Scanner(new File(filename));
				break;
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}

		while (infile.hasNextLine()) {
			readFileLoadStack(infile);
			popStackPrintMsg();
		}
		infile.close();

	}

	private static void popStackPrintMsg() {
		if (!stack.isEmpty()) {
			System.out.print(stack.pop());
			while (!stack.isEmpty()) {
				System.out.print(" " + stack.pop());
			}
		}
		System.out.println();
	}

	private static void readFileLoadStack(Scanner infile) {
		String line = infile.nextLine();
		String[] words = line.split(" ");
		for (int i = 0; i < words.length; i++) {
			stack.push(words[i]);
		}
	}

}
