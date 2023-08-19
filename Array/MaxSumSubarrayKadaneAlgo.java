import java.util.Scanner;

public class MaxSumSubarrayKadaneAlgo
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = input.nextInt();
        
        int array[] = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the value at index ["+i+"] : ");
            array[i] = input.nextInt();
        }

        int cs = 0;     //current sum;
        int ms = Integer.MIN_VALUE;     //maximum sum

        for(int j=0; j<n; j++)
        {
            cs = cs + array[j];
            if(cs<0)
            {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("The maximim sub array sum is : "+ms);
    }
    
}
