package Recursion;

import java.util.*;

public class SumTillN
{
    public static int STN(int num)
    {
        if(num==1)
        {
            return 1;
        }
        int sum = num + STN(num-1);
        return sum;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        System.out.println(STN(n));
    }
}
