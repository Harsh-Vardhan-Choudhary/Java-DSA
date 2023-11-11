import java.util.*;

class MinAbsoluteDiffPair
{
    public static void main(String [] args)
    {
        int arr1[] = {1,2,3};
        int arr2[] = {2,1,3};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minDiff = 0;
        
        for(int i=0; i<arr1.length; i++)
        {
            minDiff = minDiff + Math.abs(arr1[i]-arr2[i]);
        }

        System.out.println("Minimum difference : " + minDiff);

    }
}