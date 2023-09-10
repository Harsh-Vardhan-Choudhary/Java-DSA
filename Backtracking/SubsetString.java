package Backtracking;

public class SubsetString
{
    public static void SubStr(String str, String ans, int i)
    {
        //base case
        if(i == str.length()) 
        {
            if(ans.length()==0)
            {
                System.out.println("{}");
            }
            else
            {
                System.out.println(ans);
            }
            return;
        }

        //yes choice
        SubStr(str, ans + str.charAt(i), i+1);

        //no choice
        SubStr(str, ans, i+1);
    }
    public static void main(String args[])    
    {
        String str = "abc";
        SubStr(str, "", 0);
    }
}
