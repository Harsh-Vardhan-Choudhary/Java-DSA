import java.util.Scanner;
public class LinearSeachMINMAX {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int len;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.print("Enter the length of the array : ");
        len = input.nextInt();
        int array[] = new int[len];

        for(int i=0; i<len; i++)
        {
            System.out.print("Enter the numer at index ["+i+"] : ");
            array[i] = input.nextInt();

            if(min>array[i])
            {
                min = array[i];
            }

            if(max<array[i])
            {
                max = array[i];
            }
        }

        System.out.println("The minimum of the array is : "+min);
        System.out.println("The maximum of array is : "+max);

    }
    
}
