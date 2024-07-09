import java.util.Scanner;

public class DiagonalSum_Optimal {
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
        int x = mat.length;

        for(int i=0; i<x; i++) {
            sum+=mat[i][i];
            sum+=mat[i][x-1-i];
        }

        //mat matrix is of odd size we have to subtract the duplicate element 
        if(x%2 != 0) {
            sum-=mat[x/2][x/2];
        }

        System.out.println("Sum of both diagonal is : " + sum );
    }
}
