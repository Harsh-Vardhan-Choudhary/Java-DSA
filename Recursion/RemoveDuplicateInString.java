package Recursion;

import java.util.*;

public class RemoveDuplicateInString
{
    public static void RemoveDuplicate(String s, StringBuilder sb, int index, boolean map[])
    {
        //base case
        if(index == s.length())
        {
            System.out.println(sb);
            return;
        }

        char currchar = s.charAt(index);
        if(map[currchar-'a'] == true)
        {
            //duplicate
            RemoveDuplicate(s, sb, index+1, map);
        }
        else
        {
            map[currchar-'a'] = true;
            RemoveDuplicate(s, sb.append(currchar), index+1, map);
        }
    }

    public static void main(String args[])    
    {
        StringBuilder sb = new StringBuilder("");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        String str = input.next();
        RemoveDuplicate(str, sb, 0, new boolean[25]);
    }
}