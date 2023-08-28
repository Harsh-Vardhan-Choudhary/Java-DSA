//package Sorting Techniques;

import java.util.Scanner;

public class InsertionSort
{
    public static void InsertionSort(int array[]) 
    {
        for(int i=1; i<array.length; i++)
        {
            int curr = array[i];
            int prev = i-1;

            //finding out the curent pos to insert
            while(prev >= 0 && array[prev] > curr)
            {
                array[prev+1] = array[prev];
                prev--;
            }

            //insertion
            array[prev+1] = curr;
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

        InsertionSort(array);
        System.out.println("Your Sorted array is : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }
}
