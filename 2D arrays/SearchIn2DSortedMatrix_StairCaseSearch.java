//search in a sorted matrix - StairCase search : O(n) [optimal solution]

public class SearchIn2DSortedMatrix_StairCaseSearch
{
    public static Boolean StairCase(int matrix[][], int key)
    {
        int row=0;
        int column=matrix[0].length-1;

        while(row<=matrix.length-1 && column>=0)
        {
            if(key == matrix[row][column])
            {
                System.out.println("Element found at index ["+row+"]["+column+"]");
                return true;
            }
            else if(key>matrix[row][column])
            {
                row++;
            }
            else if(key<matrix[row][column])
            {
                column--;
            }
        }
        System.out.println("Element not found");
        return false;
    }
    public static void main(String args[])
    {
        int mat[][] = {{10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {32,33,39,50}};
        
    int key = 33;
    StairCase(mat,key);
    }
}
