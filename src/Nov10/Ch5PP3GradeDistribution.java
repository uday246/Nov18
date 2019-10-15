package Nov10;

import java.util.Scanner;

class GradeDistribution

{

	int A;

	int B;

	int C;

	int D;

	int F;

	int totalgrades;

	int PA;

	int PB;

	int PC;

	int PD;

	int PF;

	private Scanner input;

	public  GradeDistribution()

	{

		input = new Scanner(System.in);

	}

	public void readGrades()

	{

		System.out.print("Enter number of A grades ");

		A = input.nextInt();

		System.out.print("Enter number of B grades ");

		B = input.nextInt();

		System.out.print("Enter number of C grades ");

		C = input.nextInt();

		System.out.print("Enter number of D grades ");

		D = input.nextInt();

		System.out.print("Enter number of F grades ");

		F = input.nextInt();

	}

	public void setA(int gradea)

	{

		A = gradea;

	}

	public void setB(int gradeb)

	{

		B = gradeb;

	}

	public void setC(int gradec)

	{

		C = gradec;

	}

	public void setD(int graded)

	{

		D = graded;

	}

	public void setF(int gradef)

	{

		F = gradef;

	}

	public int getA()

	{

		return A;

	}

	public int getB()

	{

		return B;

	}

	public int getC()

	{

		return C;

	}

	public int getD()

	{

		return D;

	}

	public int getF()

	{

		return F;

	}

	public int totalGrades()

	{

		totalgrades = A + B + C + D + F;

		return totalgrades;

	}

	public int PergradeA()

	{

		PA = (int) Math.round(Math.floor(A * 100) / (totalgrades));

		return PA;

	}

	public int PergradeB()

	{

		PB = (int) Math.round(Math.floor(B * 100) / (totalgrades));

		return PB;

	}

	public int PergradeC()

	{

		PC = (int) Math.round(Math.floor(C * 100) / (totalgrades));

		return PC;

	}

	public int PergradeD()

	{

		PD = (int) Math.round(Math.floor(D * 100) / (totalgrades));

		return PD;

	}

	public int PergradeF()

	{

		PF = (int) Math.round(Math.floor(F * 100) / (totalgrades));

		return PF;

	}

	public void displaygraph()

	{

		int perPA, perPB, perPC, perPD, perPF = 0;

		if (PA / 2 < 10)

			perPA = (int) Math.round(PA / 2.0);

		else

			perPA = (int) Math.floor(PA / 2.0);

		if (PB / 2 < 10)

			perPB = (int) Math.round(PB / 2.0);

		else

			perPB = (int) Math.floor(PB / 2.0);

		if (PC / 2 < 10)

			perPC = (int) Math.round(PC / 2.0);

		else

			perPC = (int) Math.floor(PC / 2.0);

		if (PD / 2 < 10)

			perPD = (int) (int) Math.floor(PD / 2.0);

		else

			perPD = (int) Math.floor(2.0);

		for (int i = 0, a = 0; i < 11; i++,

		a = a + 10)

		{

			if (i == 0)

				System.out.print(a);

			else

				System.out.print(" " + a);

		}

		System.out.print("%");

		System.out.println();

		for (int i = 0; i < 11; i++)

			System.out.print("I" + "");

		System.out.println();

		for (int i = 0; i < perPA; i++)

			System.out.print("*");

		System.out.print(" A" + "\n");

		for (int i = 0; i < perPB; i++)

			System.out.print("*");

		System.out.print(" B" + "\n");

		for (int i = 0; i < perPC; i++)

			System.out.print("*");

		System.out.print(" C" + "\n");

		for (int i = 0; i < perPD; i++)

			System.out.print("*");

		System.out.print(" D" + "\n");

		for (int i = 0; i < perPF; i++)

			System.out.print("*");

		System.out.print(" F" + "\n");

	}

}

public class Ch5PP3GradeDistribution

{

	public static void main(String[] args)

	{

		GradeDistribution GD = new GradeDistribution();

		GD.readGrades();

		System.out.println("\nTotal grades: " + GD.totalGrades());

		System.out.println("Grade A Percentage: " + GD.PergradeA());

		System.out.println("Grade B Percentage: " + GD.PergradeB());

		System.out.println("Grade C Percentage: " + GD.PergradeC());

		System.out.println("Grade D Percentage: " + GD.PergradeD());

		System.out.println("Grade F Percentage: " + GD.PergradeF());

		System.out.println();

		System.out.println("Bar Graph for each letter grade is:" + "\n");

		GD.displaygraph();

	}

}
