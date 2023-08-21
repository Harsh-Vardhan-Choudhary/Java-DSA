import java.util.Scanner;
public class DiagonalSum
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of rows/column you need : ");
        int n = input.nextInt();

        int mat[][] = new int [n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("Enter the value at index ["+i+"]["+j+"] : ");
                mat[i][j] = input.nextInt();
            }
        }

        System.out.println("Your matrix is : ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //diagonal sum

        int sum = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j || i+j==n-1)
                {
                    sum = sum + mat[i][j];
                }
            }
        }

        System.out.print("Sum of both diagonal is : " + sum );
    }
}
