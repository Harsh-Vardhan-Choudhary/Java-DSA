import java.util.Scanner; 

public class LinearSearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter n : ");
        n = sc.nextInt();

        int ARR[] = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("index " + i+ " : ");
            ARR[i] = sc.nextInt();
        }

        System.out.print("value to be found : ");
        int val = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            if(ARR[i] == val)
            {
                System.out.println("Element found at index : "+i);
            }
        }
    }
}
