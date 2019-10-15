package Nov2;

import java.util.NoSuchElementException;
import java.util.Scanner;

class Queue {
	protected int Queue[];
	protected int front, rear, size, len;

	/* Constructor */
	public Queue(int n) {
		size = n;
		len = 0;
		Queue = new int[size];
		front = -1;
		rear = -1;
	}

	/* Function to check if queue is empty */
	public boolean isEmpty() {
		return front == -1;
	}

	/* Function to check if queue is full */
	public boolean isFull() {
		return front == 0 && rear == size - 1;
	}

	/* Function to get the size of the queue */
	public int getSize() {
		return len;
	}

	/* Function to check the front element of the queue */
	public int peek() {
		return Queue[front];
	}

	/* Function to insert an element to the queue */
	public void insert(int i) {
		if (rear == -1) {
			front = 0;
			rear = 0;
			Queue[rear] = i;
		} else if (rear + 1 >= size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		else if (rear + 1 < size)
			Queue[++rear] = i;
		len++;
	}

	/* Function to remove front element from the queue */
	public int remove() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		else {
			len--;
			int ele = Queue[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else
				front++;
			return ele;
		}
	}

	/* Function to display the status of the queue */
	public void display() {
		System.out.print("\nQueue = ");
		if (len == 0) {
			System.out.print("Empty\n");
			return;
		}
		for (int i = front; i <= rear; i++)
			System.out.print(Queue[i] + " ");
		System.out.println();
	}
}

public class TestQueue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of positive integerr ");
		int num = sc.nextInt();
		int temp=0;
		Queue q1 = new Queue(num);
		Queue q2 = new Queue(num);
		Queue q3 = new Queue(num);
		System.out.println("Enter "+num+" numbers : ");
		for(int i=0;i<num;i++){
			temp=sc.nextInt();
			if(temp%10==4)
				q1.insert(temp);
			if(temp%10==5)
				q2.insert(temp);
			if(temp%10==8)
				q3.insert(temp);
		}
		q1.display();
		q2.display();
		q3.display();
		
	}
}
