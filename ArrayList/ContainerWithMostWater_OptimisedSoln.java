package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater_OptimisedSoln
{
    public static int StoreWater(ArrayList<Integer> height)
    {
        int LP = 0;
        int RP = height.size() - 1;
        Integer max = Integer.MIN_VALUE;

        while(LP<RP)
        {
            int H = Math.min(height.get(LP), height.get(RP));
            int W = RP-LP;
            int WaterStored = H*W;
            max = Math.max(max, WaterStored);

            if(height.get(LP) < height.get(RP))
            {
                LP++;
            }
            else
            {
                RP--;
            }
        }
        return max;
    }
    public static void main(String args[])    
    {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Max water : " + StoreWater(height));
    }    
}
