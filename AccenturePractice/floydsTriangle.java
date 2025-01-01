package AccenturePractice;

import java.util.Scanner;

/*
1
2 3
4 5 6
7 8 9 10
 */

public class floydsTriangle {

    public static void printFloyds(int n) {
        int k=1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : "); 
        int num = input.nextInt();
        printFloyds(num);
    }
}
