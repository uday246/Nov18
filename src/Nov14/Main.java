package Nov14;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.nio.charset.StandardCharsets;

public class Main

{

	// Define the main() function.

	public static void main(String[] args) throws IOException

	{

		// Declare the variable.

		String L_amount, no_periods;

		// Create the object to take the input.

		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);

		BufferedReader in = new BufferedReader(reader);

		String line;

		// Begin the while loop.

		while ((line = in.readLine()) != null)

		{

			// Display the string.

			System.out.println(line);

			L_amount = in.readLine().trim();

			// Parse string into integer.
			
			int Loan_amount = 0;
			try{
			Loan_amount=Integer.parseInt(L_amount);
			}catch(Exception e){
				e.printStackTrace();
			}
			// Declare and initialize the variable.

			double rate_period = 6.0;

			// prompt the user to enter the

			// number of periods.

			System.out.println("Enter the count of periods : ");

			no_periods = in.readLine();

			// Parse string into integer.

			int period_count = 0;
			try{
				period_count=Integer.parseInt(no_periods);
			}
			catch(Exception e){
				e.printStackTrace();
			}

			// Declare the variable.

			double rate_period_monthly = rate_period / 12;

			// Compute the monthly parment.

			double fixed_Payment = (rate_period_monthly * Loan_amount)
					/ (1 - Math.pow((1 + rate_period_monthly), -1 * period_count * 12));

			// Display the payment.

			System.out.println("Amount to pay monthly : " + Math.round(fixed_Payment) + "$");

			// Campute the amount to pay.

			double final_paid_amt = fixed_Payment *

					period_count * 12;

			// Display the total amount

			// for payment.

			System.out.println("Amount of interest payment : " + Math.round(final_paid_amt - Loan_amount) + "$");
		}
	}
}
