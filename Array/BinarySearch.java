import java.util.Scanner;
public class BinarySearch {

    public static void BS(int arr[],int number)
    {
        int start = 0, end = arr.length-1;
        int mid = (start+end)/2;

        while(start<=end)
        {
            if (arr[mid] < number)
            {
                start = mid+1;
            }

            else if (arr[mid] == number)
            {
                System.out.println("Element founded at index ["+mid+"] ");
                break;
            }

            else if (arr[mid] > number)
            {
                end = mid-1;
            }

            mid = (start+end)/2;
        }

        if (start>end)
        {
            System.out.println("Given number not found in array");
        }
        

    }
    public static void main(String args[])
    {
        int len;
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        len = input.nextInt();
        int array[] = new int[len];

        System.out.println("Remember that the array should be sorted");

        for(int i=0; i<len; i++)
        {
            System.out.print("Enter the value at index ["+i+"] :" );
            array[i] = input.nextInt();
        }

        System.out.println("Enter the number which is to be found : ");
        num = input.nextInt();

        BS(array, num);
    }

}
