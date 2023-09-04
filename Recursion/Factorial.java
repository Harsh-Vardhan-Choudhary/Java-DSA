package Recursion;

import java.util.*;

public class Factorial
{
    public static int fac(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return num*fac(num-1);
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        System.out.println(fac(n));
    }
    
}