package Queue;
import java.util.*;

public class FirstNonRepeatingCharacter
{
    public static void printNonRepeating(String str)
    {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;     //this will increase the frequency of character 

            while(!q.isEmpty() && freq[q.peek() - 'a']>1)
            {
                q.remove();
            }

            if(q.isEmpty())
            {
                System.out.println(-1 + "\t");
            }
            else
            {
                System.out.println(q.peek() + "\t");
            }
        }

    }

    public static void main(String args[])
    {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
