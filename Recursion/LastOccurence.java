package Recursion;
import java.util.*;

public class LastOccurence
{
    public static int LO(int array[], int K, int i)
    {
        if(i==array.length)
        {
            return -1;
        }

        int LastFound = LO(array, K, i+1);
        if(LastFound == -1 && array[i]==K)
        {
            return i;
        }

        return LastFound;
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
            System.out.print(arr[i] + "  ");
        }

        System.out.println();

        int key;
        System.out.print("Enter the key to be found : ");
        key = input.nextInt();

        int i=0;

        int LO = LO(arr, key, i);

        if(LO>=0)
        {
            System.out.print("Index : "+LO);
        }
        else
        {
            System.out.print("Not found");
        }
    }    
}
