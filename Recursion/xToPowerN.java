package Recursion;
import java .util.Scanner;

public class xToPowerN
{
    public static int power(int x, int P)
    {
        if(P==0)
        {
            return 1;
        }

        return x*power(x, P-1);
    }
    public static void main(String args[])   
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value : ");
        int base = input.nextInt();
        System.out.print("Enter the power value : ");
        int  pow = input.nextInt();
        System.out.println("Answer : " + power(base, pow));   
    }
}
