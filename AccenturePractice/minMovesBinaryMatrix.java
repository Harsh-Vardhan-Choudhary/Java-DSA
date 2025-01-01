package AccenturePractice;

//matrix of N*N odd size given

public class minMovesBinaryMatrix {

    public static int minMoves(int matrix[][], int N) {
        
        //find out centre 
        int CenI = N/2;
        int CenJ = N/2;

        //find the location of 1
        int OneI = 0, OneJ = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(matrix[i][j] == 1) {
                    OneI = i;
                    OneJ = j;
                }
            }
        }

        //calculating manhattan distance - min distance
        int dist = Math.abs(CenI-OneI) + Math.abs(CenJ-OneJ);
        return dist;
    }

    public static void main(String[] args) {
        int[][] mat = {{0,0,0,1,0},
                       {0,0,0,0,0},
                       {0,0,0,0,0},
                       {0,0,0,0,0},
                       {0,0,0,0,0}};

        System.out.println("The distance is : " + minMoves(mat, mat.length));
    }
}
