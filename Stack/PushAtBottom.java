package Stack;
import java.util.*;

public class PushAtBottom
{
    public static void PushBottom(Stack<Integer> S, int data)
    {
        if(S.isEmpty())
        {
            S.push(data);
            return;
        }

        int top = S.pop();
        PushBottom(S, data);
        S.push(top);
    }
    
    public static void main(String args[])
    {
        Stack<Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);

        PushBottom(S, 5);
    }
}
