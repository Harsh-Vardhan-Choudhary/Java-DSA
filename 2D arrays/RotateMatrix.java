public class RotateMatrix {
    
    public static void rotate(int[][] matrix) {

        int n=matrix.length;

        //transpose
        for(int i=0; i<=n-2; i++) {
            for(int j=i+1; j<=n-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                //swap(matrix, i, j, j, i);
            }
        }

        //reverse matrix
        for(int i=0; i<=n-1; i++) {
            for(int j=0; j<n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
                //swap(matrix, i, j, i, n-1-j);
            }
        }
    }

    // public void swap(int matrix[][], int row1, int col1, int row2, int col2) {
    //     int temp = matrix[row1][col1];
    //     matrix[row1][col1] = matrix[row2][col2];
    //     matrix[row2][col2] = temp;
    // }

    public static void printMat(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        printMat(matrix);
        
        System.out.println();

        rotate(matrix);
        printMat(matrix);
        
    }
}