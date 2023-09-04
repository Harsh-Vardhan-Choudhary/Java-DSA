package Recursion;

import java.util.Scanner;

public class BinaryStrProblem
{
    public static void BSP(int n, int lastplace, String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }

        if(lastplace==0)
        {
            BSP(n-1, 0, str+"0");            
            BSP(n-1, 1, str+"1");
        }
        else
        {
            BSP(n-1, 0, str+"0");
        }
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        BSP(num, 0, new String(""));
    }
}
