import java.util.Scanner;

public class ReverseOfArray
{
    public static void reverse(int array[])
    {
        int start=0, end = array.length-1;

        while(start<end)
        {
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;

            start++;
            end--;
        }
        
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

        System.out.println("Your reversed array is : ");
        reverse(arr);
        for(int i=0; i<len; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}