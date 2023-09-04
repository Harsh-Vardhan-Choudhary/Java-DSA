package Recursion;

import java.util.Scanner;

public class nTo1
{
    public static void printD(int num)
    {
        if(num==1)
        {
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printD(num-1);
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        printD(n);
    }
}