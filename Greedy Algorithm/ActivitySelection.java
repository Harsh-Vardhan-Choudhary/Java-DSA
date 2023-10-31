//package Greedy Algorithm;
import java.util.*;

public class ActivitySelection
{
    public static void main(String args[])    
    {
        //sorted on the basis of end time
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct = 1;
        ans.add(0);
        int LastEnd = end[0];

        for(int i=1; i<end.length; i++)
        {
            if(start[i] >= LastEnd)
            {
                maxAct++;
                ans.add(i);
                LastEnd = end[i];
            }
        }

        System.out.println("Maximum Actifities" + maxAct + "\n");     
        for(int i=0; i<=ans.size(); i++)
        {
            System.out.println("Activity " + ans.get(i));
        }
    }
}
