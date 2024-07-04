public class SetMatrixZeroOptimal {
    public static void setZeros(int mat[][], int r, int c)
    {
        // int Row[] = new int[r];          -->  mat[...][0]
        // int Colomn[] = new int[c];       -->  mat[0][...]

        int col0 = 1;

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(mat[i][j] == 0)
                {
                    //mark the ith row
                    mat[i][0] = 0;

                    //mark the jth column
                    if(j != 0)
                    {
                        mat[0][j] = 0;
                    }

                    else
                    {
                        col0 = 0;
                    }
                }
            }
        }

        for(int i=1; i<r; i++) {
            for(int j=1; j<c; j++ ) 
            {
                if(mat[i][j] != 0) 
                {
                    //check for row and column
                    if(mat[i][0] == 0 || mat[0][j] == 0) 
                    {
                        mat[i][j] = 0;
                    }
                }
            }
        }

        //for the first row
        if(mat[0][0] == 0)
        {
            for(int j=0; j<c; j++)
            {
                mat[0][j] = 0;
            }
        }

        //for the first column
        if(col0 == 0)
        {
            for(int i=0; i<r; i++)
            {
                mat[i][0] = 0;
            }
        }
    }

    public static void main(String args[])
    {
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        int r = matrix.length;
        int c = matrix[0].length;

        System.out.println(r + " dfd " + c);

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

        setZeros(matrix, r, c);
        System.out.println("Matrix after setting all the element in x & y of 0 to 0 is : \n");
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
