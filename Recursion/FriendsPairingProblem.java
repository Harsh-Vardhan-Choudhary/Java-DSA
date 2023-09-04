package Recursion;

import java.util.Scanner;

public class FriendsPairingProblem 
{
    public static int FPP(int n)
    {
        //base case
        if(n==1 || n==2)
        {
            return n;
        }

        int FN1 = FPP(n-1);
        int FN2 = FPP(n-2);
        int pair = (n-1)*FN2;
        int total = FN1+pair;
        
        return total;

    }

    public static void main(String args[])  
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of people : ");
        int num = input.nextInt();
        System.out.println("Total ways : "+FPP(num));
    }    
}
