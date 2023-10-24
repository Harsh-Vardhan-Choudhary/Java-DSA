package Stack;
import java.util.*;

public class ReversingAString
{
    public static String RevStr(String str)
    {
        Stack<Character> S = new Stack<>();
        int indx = 0;

        while(indx<str.length())
        {
            S.push(str.charAt(indx));
            indx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!S.isEmpty())
        {
            result.append(S.pop());
        }

        return result.toString();
    }

    public static void main(String args[])
    {
        String str = "Harsh";
        String result = RevStr(str);
        System.out.println(result);
    }
}

