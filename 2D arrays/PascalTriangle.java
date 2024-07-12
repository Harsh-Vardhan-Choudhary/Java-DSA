import java.util.*;

public class PascalTriangle {
    
    //finding element at r,c
    public static int nCr(int r, int c) {
        int res = 1;
        for(int i=0; i<c; i++) {
            res = res * (r-i);
            res = res / (i+1);
        }
        return res;
    }

    //printing nth row of the pascal's triangle
    public static List<Integer> nthRow(int r) {
        List<Integer> res = new ArrayList<>();
        
        int element = 1;
        res.add(element);

        //we know nth row has n element
        for(int i=1; i<r; i++) {
            element = element * (r-i);
            element = element / i;
            res.add(element);
        }
        return res;
    }

    //printing complete pascal triangle till nth row
    public static List<List<Integer>> triangle(int r) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i=1; i<=r; i++) {
                res.add(nthRow(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int r = input.nextInt();
        System.out.print("Enter the column : ");
        int c = input.nextInt();

        System.out.println(nCr(r-1, c-1));
        System.out.println(nthRow(r));
        System.out.println(triangle(r));
    }
}
