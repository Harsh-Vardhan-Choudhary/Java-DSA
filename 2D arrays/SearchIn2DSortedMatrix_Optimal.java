public class SearchIn2DSortedMatrix_Optimal {
    
    public boolean searchMatrix(int[][] matrix, int target) {

        //assuming 2D matrix to be a 1D matrix - just hypothetically

        int start=0;
        //n*m
        int end=(matrix.length)*(matrix[0].length)-1;

        while(start<=end) {

            int mid = (start+end)/2;

            int row = mid/matrix[0].length;
            int column = mid%matrix[0].length;

            if(matrix[row][column] < target) {
                start = mid + 1;
            }

            else if(matrix[row][column] == target) {
                return true;
            }

            else if(matrix[row][column] > target) {
                end = mid - 1;
            }
        }

        return false;
    }        
}