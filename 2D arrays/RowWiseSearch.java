//search in a sorted matrix 

//bruteforce approach - traverse all and search : O(n^2)

//better solution - since it is sorted matrix the rows are sorted
                    //if element present in range of any row -> binary search in that row
                    // O(n) for traversal in row + O(log n) binary search

//optimal solution - staircase method


public class RowWiseSearch {

    public static boolean BS(int arr[],int key)
    {
        int start = 0, end = arr.length-1;
        int mid = (start+end)/2;

        while(start<=end)
        {
            if (arr[mid] < key)
            {
                start = mid+1;
            }

            else if (arr[mid] == key)
            {
                return true;
            }

            else if (arr[mid] > key)
            {
                end = mid-1;
            }

            mid = (start+end)/2;
        }

        return false;
    }

    public static boolean RowWise(int mat[][], int key) {
        for(int i=0; i<mat.length; i++) {
            if(key>= mat[i][0] && key<=mat[i][mat[i].length-1]) {
                return BS(mat[i], key);
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int mat[][] = {{2,5,7,8},
                       {11,14,18,21},
                       {24,28,29,30},
                       {32,35,38,41},
                       {45,48,53,57}};
        
    int key = 35;
    System.out.println(RowWise(mat,key));
    }
}
