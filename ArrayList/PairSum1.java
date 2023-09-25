//pairsum in a sorted arraylist

package ArrayList;

import java.util.ArrayList;

public class PairSum1
{
    public static boolean PairSum(ArrayList<Integer> pair,int target)
    {
        int LP = 0;
        int RP = pair.size()-1;

        while(LP!=RP)
        {
            if(pair.get(LP) + pair.get(RP) == target)
            {
                return true;
            }

            else if(pair.get(LP) + pair.get(RP) < target)
            {
                LP++;
            }

            else
            {
                RP--;
            }
        }
        
        return false;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(1);
        pair.add(2);
        pair.add(3);
        pair.add(4);
        pair.add(5);
        pair.add(6);

        int target = 5;
        
        if(PairSum(pair, target) == true)
        {
            System.out.println("Element founded");
        }
        else
        {
            System.out.println("Invalid Element");
        }
    }
}
