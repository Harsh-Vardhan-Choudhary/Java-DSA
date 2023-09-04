package Recursion;

import java.util.Scanner;

public class FirstOccurrence
{
    public static int FO(int array[], int key, int i)
    {
        if(array[i] == key)
        {
            return i;
        }

        else if(i > array.length)
        {
            return -1;
        }

        return FO(array, key, i+1);
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

        int key;
        System.out.print("Enter the key to be found : ");
        key = input.nextInt();

        int i=0;

        int FO = FO(arr, key, i);

        if(FO>=0)
        {
            System.out.print("Index : "+FO);
        }
        else
        {
            System.out.print("Not found");
        }
    }
}
