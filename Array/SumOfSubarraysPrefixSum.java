// sum of subarray = prefix[end] - prefix[start-1]
import java.util.Scanner;
public class SumOfSubarraysPrefixSum
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int len = input.nextInt();
        int arr[] = new int[len];

        for(int i=0; i<len; i++)
        {
            System.out.print("Enter the element at index "+i+" : ");
            arr[i] = input.nextInt();
        }

        System.out.println("Your given array is : ");
        for(int i=0; i<len; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        int prefix[] = new int[arr.length];
        
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }

        System.out.println("Prefix array is : ");

        for(int j=0; j<arr.length; j++)
        {
            System.out.print(prefix[j]+"    ");
        }
        System.out.println();

        int sum;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            int start = i;
            
            for(int j=i; j<arr.length;j++)
            {
                int end = j;
                sum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];

                if(max<sum)
                {
                    max=sum;
                }
                if(min>sum)
                {
                    min=sum;
                }

            }
        }
        System.out.println("The maximum subarray sum is : "+max);
        System.out.println("The minimum subarray sum is : "+min);

    }
}
