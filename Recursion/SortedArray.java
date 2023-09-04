package Recursion;

import java.util.*;

public class SortedArray
{
    public static boolean Sorted(int array[], int i)
    {
        if(i==array.length)
        {
            return true;
        }

        if(array[i]>array[i+1])
        {
            return false;
        }

        return Sorted(array, i+1);
    }

    public static void main(String args[])    
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of an array : ");
        int len = input.nextInt();

        int arr[] = new int [len];
        for(int i=0; i<len; i++)
        {
            System.out.print("Enter the element at index ["+i+"] : ");
            arr[i] = input.nextInt();
        }

        System.out.println("Your given array is : ");
        for(int i=0; i<len; i++)
        {
            System.out.print(i + "  ");
        }

        System.out.println();
        int i=0;

        if(Sorted(arr, i) == true)
        {
            System.out.println("Array is sorted");
        }

        else
        {
            System.out.println("Array is not sorted");
        }
    }
}
