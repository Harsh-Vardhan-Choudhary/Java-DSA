package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater
{
    public static int StoreWater(ArrayList<Integer> height)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<height.size(); i++)
        {
            for(int j=i+1; j<height.size(); j++)
            {
                int H = Math.min(height.get(i),height.get(j));
                int W = j-i;
                int WaterStored = H*W;
                max = Math.max(max, WaterStored);
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
