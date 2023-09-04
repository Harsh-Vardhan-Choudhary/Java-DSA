package Recursion;

import java.util.Scanner;

public class Fibonacci
{
    public static int FIB(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else if(num==1)
        {
            return 1;
        }
        int fib1 = FIB(num-1);
        int fib2 = FIB(num-2);
        int fib = fib1+fib2;
        
        return fib;

    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        System.out.println("Fibonacci number of your number is : "+FIB(n));

        System.out.println("\t Fibonacci series\t");
        for(int i=0; i<=n; i++)
        {
            System.out.println(FIB(i));
        }
    }
}
