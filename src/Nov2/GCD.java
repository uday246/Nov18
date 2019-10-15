package Nov2;

import java.util.Scanner;

public class GCD {
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }


    public static void main(String[] args) {
       System.out.println("Enter a : ");
       Scanner sc = new Scanner(System.in);
       int n1=sc.nextInt();
       System.out.println("Enter b : ");
       int n2=sc.nextInt();
       System.out.println("GCD of ("+n1+","+n2+") : "+gcd(n1, n2));
    }
}