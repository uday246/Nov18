package Nov20;

public class BankAccount// This is the Class Header
{// This curly bracket opens the
	String name;// This line creathe class
	double balance;// This line makes a variable for balance
	double transactionFee;// This line makes a variable for Transaction fee

	public void transactionFee(double fee)// This line is for the transaction
											// fee method
	{// This curly bracket opens the method
		transactionFee = fee;// This line makes the transactionfee = to fee
	}// This curly bracket closes the method

	public void deposit(double amount)// This line is for the deposit method
	{// This line opens the method
		balance = balance + amount;// This line adds the deposit to the balance
	}// This curl bracket closes method

	public void withdraw(double amount)// This line is for the withdrawl method
	{// This curly brackets opens the method
		if ((balance - amount - transactionFee) >= 0)// This is the "if"
														// statement
		{// This line opens the statement
			balance = (balance - amount - transactionFee);// This line is for if
															// the statement is
															// true
		} // This line closes the statement
	}// This line closes the method
	
	public static void f(int x)
	   {
	      if (x > 0)
	      {
	         System.out.println(x);
	         f(x
	        		 -1);
	         System.out.println(x);
	         f(x-1);
	      }
	      System.out.println("bert");
	  }
	public static void main(String[] args) {
		f(3);
	}
}// This line closes the program


