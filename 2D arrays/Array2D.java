import java.util.Scanner;
public class Array2D
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of row : ");
        int r = input.nextInt();
        System.out.print("Enter size of column : ");
        int c = input.nextInt();

        int val;

        int matrix[][] = new int [r][c];

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print("Enter the value at index ["+i+"]["+j+"] : ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("The matrix formed is: \n");

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(matrix[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}