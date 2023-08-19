import java.util.Scanner;

public class PairsInArray
{
    public static void printPairs(int array[])
    {
        int tp = 0;     //total pairs
        for(int i=0; i<=array.length-1; i++)
        {
            int curr = array[i];
            for(int j=i+1; j<=array.length-1; j++)
            {
                System.out.print("("+curr+", "+array[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs are : "+tp);
        System.out.println("");
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

        System.out.println("The following are the pairs in an array:-");
        printPairs(arr);
    }
}