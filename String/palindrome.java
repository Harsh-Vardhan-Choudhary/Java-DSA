package String;

import java.util.*;

public class palindrome
{
    public static boolean palindraome(String str)
    {
        for(int i=0; i<(str.length()-1)/2; i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = input.next();

        if(palindraome(str)==true)
        {
            System.out.println("String is palindrame");
        }
        else
        {
            System.out.println("String is not palindrame");
        }
    }
}
