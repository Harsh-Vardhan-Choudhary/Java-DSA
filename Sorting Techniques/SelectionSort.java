import java.util.*;

public class SelectionSort
{
    public static void SelectionSort(int array[])
    {
        for(int i=0; i<array.length; i++)
        {
            int minPos = i;
            for(int j = i+1; j<array.length; j++)
            {
                if(array[j]<array[minPos])
                {
                    minPos = j;
                }
            }
            //swap
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
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
        
        SelectionSort(array);
        System.out.println("Your Sorted array is : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }
}