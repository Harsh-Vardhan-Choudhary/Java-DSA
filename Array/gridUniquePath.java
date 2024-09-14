public class gridUniquePath {


    //this is a bruteforce solution
    // recusive approach leads to TC: O(2^n)
    public int countPaths(int i, int j, int m, int n) {
        //match case
        if(i==m-1 && j==n-1) {
            return 1;
        }

        //base case
        if(i>=m || j>=n) {
            return 0;
        }

        else return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
    }

    public int uniquePaths(int m, int n) {
        int i=0;
        int j=0;
        return countPaths(i, j, m, n);
    }
}