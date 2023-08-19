import java.util.Scanner;
public class SumOfSubarraysBruteForce 
{
    public static void PrintSubArrays(int array[])
    {
        int ts=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=array.length-1; i++)
        {
            int start =i;
            int sum=0;
            for(int j=i; j<=array.length-1; j++)
            {
                int end = j;
                for(int k = start; k<=end; k++)
                {
                    System.out.print(array[k]+ "  ");
                    sum = sum + array[k];
                }
                System.out.println("Sum is : "+sum);

                if(sum>=max)
                {
                    max=sum;
                }

                if(sum<=min)
                {
                    min=sum;
                }

                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays : "+ts);
        System.out.println("The maximum of subarray is : "+max);
        System.out.println("The minimum of subarray is : "+min);
    }

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
        PrintSubArrays(arr);
        System.out.println();
    }
}