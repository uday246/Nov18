package Nov9;

public class Diamond
{
    public static void main(String args[]) 
    {
        int n, i, j, space = 1;
        n = 4;
        space = n - 1;
        // prints the upper part
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print("*");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
            	if(i==1 || i==2*j-i)
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        // prints the lower part
        for (j = 1; j <= n - 1; j++) 
        {
        	// prints the spaces
            for (i = 1; i <= space; i++) 
            {
                System.out.print("*");
            }
            space++;
            // prints the stars
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
            	if(i==1 || i==(2*n-j)-1)
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}