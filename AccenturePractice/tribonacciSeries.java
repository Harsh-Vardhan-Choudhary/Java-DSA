package AccenturePractice;

import java.util.Scanner;

public class tribonacciSeries {

    public static int tribonacci(int n) {
        if(n==0) {
            return 0;
        }

        else if(n==1 || n==2) {
            return 1;
        }

        int t0=0, t1=1, t2=1;
        for(int i=3; i<=n; i++) {
            int t3 = t0+t1+t2;
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }

        return t2;
    }

    public static void printTribonacci(int n) {
        for(int i=0; i<=n; i++) {
            System.out.print(tribonacci(i));
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        printTribonacci(num);
    }
}
