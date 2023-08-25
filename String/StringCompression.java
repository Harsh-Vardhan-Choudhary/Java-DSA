package String;

public class StringCompression
{
    public static String StringCompression(String str)
    {
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++)
        {
            Integer count = 1;      //count variabe to store no. of time letter repeat | int can also be used here
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;        //here due to i++ only the different letter go further
            }
            
            sb.append(str.charAt(i));

            if(count>1)
            {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String args[])    
    {
        String str = "aaabbcccccdee";
        System.out.println(StringCompression(str));
    }
}
