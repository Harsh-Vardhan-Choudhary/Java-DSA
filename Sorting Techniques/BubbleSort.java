//package Sorting Techniques;
import java.util.*;
public class BubbleSort
{
    public static void BubbleSort(int array[])
    {
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array.length-1; j++)
            {
                if(array[i]<array[j])
                {
                    int temp = array [i];
                    array[i] = array [j];
                    array[j] = temp;
                }
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
        BubbleSort(array);
        System.out.println("Your Sorted array is : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }
}
