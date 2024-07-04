public class SetMatrixZeroBetter {

    public static void setZeros(int mat[][], int r, int c)
    {
        int Row[] = new int[r];
        int Colomn[] = new int[c];

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(mat[i][j] == 0)
                {
                    Row[i] = 1;
                    Colomn[j] = 1;
                }
            }
        }

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++ ) {
                if (Row[i] == 1 || Colomn[j] == 1) {
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
