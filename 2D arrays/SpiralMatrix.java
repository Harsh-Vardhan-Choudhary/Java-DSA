public class SpiralMatrix
{
    public static void main(String ars[])
    {
        int mat[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        
        int top = 0;
        int left = 0;
        int bottom = mat.length-1;
        int right = mat[0].length-1;

        while(top<=bottom && left<=right)
        {
            //top
            for(int j=left; j<=right; j++)
            {
                System.out.print(mat[top][j]+" ");
            }
            top++;

            //right
            for(int j=top; j<=bottom; j++)
            {
                System.out.print(mat[j][right]+" ");
            }
            right--;

            //bottom
            for(int j=right; j>=left; j--)
            {
                if(top==bottom)
                {
                    break;
                }
                System.out.print(mat[bottom][j]+" ");
            }
            bottom--;
            
            //left
            for(int j=bottom; j>top; j--)
            {
                if(left==right)
                {
                    break;
                }
                System.out.print(mat[j][left]+" ");
            }
            left++;
        }

    }
}
