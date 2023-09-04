package Recursion;

import java.util.*;

public class oneToN
{
    public static void print(int num)
    {
        if(num==1)
        {
            System.out.println(num);
            return;
        }
        print(num-1);
        System.out.println(num);
    }
    public static void main(String args[])    
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        print(n);
    }
}
