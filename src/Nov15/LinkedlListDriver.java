package Nov15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedlListDriver {

	public static void main(String[] args) throws Exception, IOException

	{

		LinkedList list = new LinkedList();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int input = 0;

		System.out.println("Enter a series of integers, (-9999 to stop)");

		while (input != -9999)

		{

			input = Integer.parseInt(reader.readLine());

			if (input != -9999)

			{

				list.add(input);

			}

		}

		System.out.println("List: " + list);

		System.out.println("Enter a number to delete: ");

		input = Integer.parseInt(reader.readLine());

		if (list.remove(new Integer(input)))

		{

			System.out.println("Deletion was successfull!");

		}

		else

		{

			System.out.println(input + " is not found in the list");

		}

		System.out.println(list);

	}

}
