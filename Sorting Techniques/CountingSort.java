import java.util.Scanner;

public class CountingSort
{
    public static void CountingSort(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++)
        {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i=0; i<count.length ;i++)
        {
            while(count[i]>0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[])   
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        int array[] = new int[n];
        for(int i=0; i<array.length; i++)
        {
            System.out.print("Enter the value of element at index ["+i+"] : ");
            array[i] = input.nextInt();
        }
        CountingSort(array);
        System.out.println("Your Sorted array is : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }
}