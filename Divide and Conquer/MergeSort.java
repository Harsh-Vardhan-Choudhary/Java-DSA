//package Divide and Conquer;

import java.util.*;
public class MergeSort
{
    public static void mergeSort(int arr[], int start, int end)
    {
        if(start >= end)
        {
            return;
        }

        int mid = (start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end)
    {
        int temp[] = new int[end-start+1];
        int left = start;       //iterator for left part
        int right = mid+1;      //iterator for right part
        int k = 0;              //iterator for the temporary array

        while(left <= mid && right<= end)
        {
            if(arr[left]<=arr[right])
            {
                temp[k] = arr[left];
                left++;
                k++;
            }
            else
            {
                temp[k] = arr[right];
                right++;
                k++;
            }
        }

        //baki jo left hai now unke liye

            //if its in left part
            while(left <= mid)
            {
                temp[k++] = arr[left++];
            }

            //if its on right part
            while(right <= end)
            {
                temp[k++] = arr[right++];
            }

        
        //copying temp array into the permanent array
        for(int i=0 ; i<temp.length; i++)
        {
            arr[start + i] = temp[i];
        }
    }

    public static void printArr(int arr[]) {
        for(int index=0; index<arr.length; index++) {
            System.out.println(arr[index] + " ");
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
        printArr(array);
    }
}