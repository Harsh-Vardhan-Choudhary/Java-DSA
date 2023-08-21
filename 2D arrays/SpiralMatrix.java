public class SpiralMatrix
{
    public static void main(String ars[])
    {
        int mat[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        
        int StartRow = 0;
        int StartColumn = 0;
        int EndRow = mat.length-1;
        int EndColumn = mat[0].length-1;

        while(StartRow<=EndRow && StartColumn<=EndColumn)
        {
            //top
            for(int j=StartColumn; j<=EndColumn; j++)
            {
                System.out.print(mat[StartRow][j]+" ");
            }

            //right
            for(int j=StartRow+1; j<=EndRow; j++)
            {
                System.out.print(mat[j][EndColumn]+" ");
            }

            //bottom
            for(int j=EndColumn-1; j>=StartColumn; j--)
            {
                if(StartRow==EndRow)
                {
                    break;
                }
                System.out.print(mat[EndRow][j]+" ");
            }
            
            //left
            for(int j=EndRow-1; j>StartRow; j--)
            {
                if(StartColumn==EndColumn)
                {
                    break;
                }
                System.out.print(mat[j][StartColumn]+" ");
            }

            StartRow++;
            StartColumn++;
            EndRow--;
            EndColumn--;

        }

    }
}
