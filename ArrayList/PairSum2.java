//Pair sum in a sorted rotated arraylist
package ArrayList;

import java.util.ArrayList;

public class PairSum2
{
    public static boolean pairsum(ArrayList<Integer> pair, int target)
    {
        int bp = -1;        //breaking point
        for(int i=0; i<pair.size(); i++)
        {
            if(pair.get(i) > pair.get(i+1))
            {
                bp = i;
                break;
            }
        }

        int LP = bp+1;
        int RP = bp;

        while(LP != RP)
        {
            if(pair.get(LP) + pair.get(RP) == target)
            {
                return true;
            }

            else if(pair.get(LP) + pair.get(RP) < target)
            {
                LP = (LP+1)%pair.size();
            }
            
            else
            {
                RP = (RP - 1 + pair.size())%pair.size();
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(11);
        pair.add(15);
        pair.add(6);
        pair.add(8);
        pair.add(9);
        pair.add(10);   
        
        int target = 16;

        if(pairsum(pair, target) == true)
        {
            System.out.println("Target found");
        }
        else
        {
            System.out.println("Invalid target");
        }
    }    
}