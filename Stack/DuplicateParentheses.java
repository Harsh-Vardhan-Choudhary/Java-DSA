package Stack;
import java.util.*;

public class DuplicateParentheses
{
    public static boolean isDuplicate(String str)
    {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            //here we are providing closing statement first
            //beacuse if it not the case of closing it becomes the case of opening

            //closing
            if(ch == ')')
            {
                int count = 0;

                //we have removed !s.isEmpty() condition because in this case and acc. to question 
                //we are providing valid string so stack can't be left empty
                while(s.peek() != '(')
                {
                    s.pop();
                    count++;
                }

                if(count<1)
                {
                    return true;    // duplicate exist
                }

                else
                {
                    s.pop();   //opening pair
                }
            }

            //opening
            else
            {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        String str = "((a+b))"; //true
        String str2 = "(a-b)";  //false
        System.out.println(isDuplicate(str));
    }
}
