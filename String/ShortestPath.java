package String;

import java.time.Year;

public class ShortestPath
{
    public static float ShortestPath(String str)
    {
        int X=0;
        int Y=0;

        for(int i=0; i<=str.length()-1; i++)
        {
            if(str.charAt(i)=='N')
            {
                Y++;
            }

            else if(str.charAt(i)=='S')
            {
                Y--;
            }

            else if(str.charAt(i)=='E')
            {
                X++;
            }

            else if(str.charAt(i)=='W')
            {
                X--;
            }
        }

        int X2 = X*X;
        int Y2 = Y*Y;

        return (float)Math.sqrt(X2+Y2);
        
    }
    public static void main(String args[])
    {
        String str = "WNEENESENNN";
        System.out.println("Shortest distance is : "+ShortestPath(str));
    }
}
