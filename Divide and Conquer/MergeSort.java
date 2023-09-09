//package Divide and Conquer;

import java.util.*;
public class MergeSort
{
    public static void mergeSort(int arr[], int si, int ei)
    {
        if(si >= ei)
        {
            return;
        }

        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei)
    {
        int temp[] = new int[ei-si+1];
        int i = si;     //iterator for left part
        int j = mid+1;  //iterator for right part
        int k = 0;      //iterator for the temporary array

        while(i <= mid && j<= ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k] = arr[i];
                i++;
                k++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
                k++;
            }

            //baki jo left hai now unke liye

            //if its in left part
            while(i <= mid)
            {
                temp[k++] = arr[i++];
            }

            //if its on right part
            while(j <= ei)
            {
                temp[k++] = arr[j++];
            }

            //copying temp array into the permanent array
            for(k=0, i = si; k<temp.length; k++, i++)
            {
                arr[i] = temp[k];
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
        mergeSort(array, 0, array.length-1);
        
        System.out.println("Your Sorted array is : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }
}