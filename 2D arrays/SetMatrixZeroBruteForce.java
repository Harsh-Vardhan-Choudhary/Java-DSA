public class SetMatrixZeroBruteForce {

    public static void setZeros(int mat[][], int r, int c)
    {
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(mat[i][j] == 0)
                {
                    markRow(mat, i, c);
                    markColomn(mat, j, r);
                }
            }
        }

        markZero(mat, r, c);

    }

    private static void markRow(int mat[][], int i, int c) {
        for(int j=0; j<c; j++) {
            if(mat[i][j] != 0) {
                mat[i][j] = -1;
            }
        }
    }

    private static void markColomn(int mat[][], int j, int r) {
        for(int i=0; i<r; i++) {
            if(mat[i][j] != 0) {
                mat[i][j] = -1;
            }
        }
        
    }

    private static void markZero(int[][] mat, int r, int c) {
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
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
