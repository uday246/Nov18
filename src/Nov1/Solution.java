package Nov1;

import java.util.Arrays;
import java.util.Scanner;
class Node {
	protected int data;
	protected Node link;

	public Node() {
		link = null;
		data = 0;
	}

	public Node(int d, Node n) {
		data = d;
		link = n;
	}

	public Node(int aN) {
		data=aN;
	}

	public void setLink(Node n) {
		link = n;
	}

	public void setData(int d) {
		data = d;
	}

	public Node getLink() {
		return link;
	}

	public int getData() {
		return data;
	}
}

class MyLinkedList {
	protected Node head;
	public int size;

	public MyLinkedList() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getSize() {
		return size;
	}

	public void addLast(int n) {
	    Node new_node = new Node(n); 
	    if (head == null) 
	    { 
	        head = new Node(n); 
	        return; 
	    } 
	  
	    new_node.link = null; 
	  
	    /* 5. Else traverse till the last node */
	    Node last = head;  
	    while (last.link != null) 
	        last = last.link; 
	  
	    /* 6. Change the next of last node */
	    last.link = new_node; 
	    return; 		
	}

	public void display(){
		Node last = head; 
	    while (last.link != null){
	    	System.out.print(last.data+" ");
	    	last=last.link;
	    }
	}
}

public class Solution{

    /*
    * My Solution
    */
    public static int getNthFromLast(MyLinkedList list, int n){
    	int len = 0; 
        Node temp = list.head; 
  
        while (temp != null) 
        { 
            temp = temp.link; 
            len++; 
        } 
        System.out.println(len);
        if (len < n) 
            return -1; 
  
        temp = list.head; 
  
        for (int i = 1; i < len-n+1; i++) 
            temp = temp.link; 
  
        return temp.data;
    }
  
  
//DO NOT CHANGE ----------------------------------
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = input.nextInt();
        input.close();
        int[] arr = Arrays.stream(str.substring(0, str.length()).split("\\s"))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();      
        MyLinkedList list = new MyLinkedList();
        for(int i = 0; i < arr.length; i++){
            list.addLast(arr[i]);
        }
        list.display();
        System.out.println(Solution.getNthFromLast(list, n));
    }
//DO NOT CHANGE ----------------------------------

}
