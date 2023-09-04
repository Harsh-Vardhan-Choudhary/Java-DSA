package Recursion;

import java.util.*;

public class TillingProblem
{
    public static int TP(int n) //2*n board
    {
        //base case
        if(n==0 || n==1)
        {
            return 1;
        }

        //vertical choice
        int vc = TP(n-1);

        //horizontal choice
        int hc = TP(n-2);

        int TC = vc+hc;
        return TC;

    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        System.out.println("Number of ways in which tiles can be arranged : " + TP(num));
    }
}
