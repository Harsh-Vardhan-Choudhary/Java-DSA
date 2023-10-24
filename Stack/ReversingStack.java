package Stack;
import java.util.*;

public class ReversingStack
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

    public static void printStack(Stack <Integer> st)
    {
        while(!st.empty())
        {
            System.out.println(st.pop());
        }
    }

    public static void ReverseStack(Stack <Integer> st)
    {
        if(st.isEmpty())
        {
            return;
        }

        int top = st.pop();
        ReverseStack(st);
        PushBottom(st, top);
    }
    public static void main(String args[])    
    {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        //3 2 1 

        ReverseStack(st);
        printStack(st);

        //1 2 3 
    }
}
