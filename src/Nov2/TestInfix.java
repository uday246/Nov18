package Nov2;

import java.util.Scanner;
/*
 * 1 read the infix expression from left to right.
2. If the scanned character is an operand, output it.
3. Else
	 If the precedence of the scanned operator is greater than the precedence of the operator in the stack(or the stack is empty or the stack contains a '(' ), push it.
	Else, Pop all the operators from the stack which are greater than or equal to in precedence than that of the scanned operator. After doing that Push the scanned operator to the stack. (If you encounter parenthesis while popping then stop there and push the scanned operator in the stack.)
4. If the scanned character is an '(', push it to the stack.
5. If the scanned character is an ')', pop the stack and and output it until a '(' is encountered, and discard both the parenthesis.
6. Repeat steps 2-6 until infix expression is scanned.

 * 
 */

class Stack 
{ 
    final int MAX = 100; 
    private int top; 
    private char a[] = new char[MAX]; // Maximum size of Stack 
	
	//constructer calls when the object is created
    Stack() 
    { 
        top = -1; //initialize top value -1 
    } 
	
	// this method is used to insert values into stack
  
    void push(char x) 
    { 
        if (top >= (MAX-1)) // here we check the condition  if values are there are not
        { 
            System.out.println("Stack Overflow"); 
        } 
        else
        { 
            a[++top] = x; 
        } 
    } 
  
  // this method is used to delete top element
    char pop() 
    { 
        if (top < 0) // here also we check the condition  if values are there are not
        { 
            System.out.println("Stack is Underflow"); 
            return 0; 
        } 
        else
        { 
            char x = a[top--]; 
            return x; 
        } 
    } 
	// this method is used to display top element
	char peek()
	{
		if (top < 0) 
        { 
            System.out.println("No elements. Stack is Underflow"); 
            
        } 
		return a[top];
	}
	public boolean isEmpty(){
		return top==-1;
	}
	
} 
  
public class TestInfix
{ 
    // A utility function to return precedence of a given operator 
    // Higher returned value means higher precedence 
    static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
       
    // The main method that converts given infix expression 
    // to postfix expression.  
    static String infixToPostfix(String exp) 
    { 
        // initializing empty String for result 
        String result = new String(""); 
          
        // initializing empty stack 
        Stack stack = new Stack(); 
          
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char c = exp.charAt(i); 
              
             // If the scanned character is an operand, add it to output. 
            if (Character.isLetterOrDigit(c)) 
                result += c; 
               
            // If the scanned character is an '(', push it to the stack. 
            else if (c == '(') 
                stack.push(c); 
              
            else if (c == ')') 
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    result += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression"; // invalid expression                 
                else
                    stack.pop(); 
            } 
            else 
            { 
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) 
                    result += stack.pop(); 
                stack.push(c); 
            } 
       
        } 
       
        // pop all the operators from the stack 
        while (!stack.isEmpty()) 
            result += stack.pop(); 
       
        return result; 
    } 
    
    // Driver method  
    public static void main(String[] args)  
    { 
        String exp = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter infix expression ");
        exp=sc.nextLine();
        System.out.println(infixToPostfix(exp)); 
    } 
} 
