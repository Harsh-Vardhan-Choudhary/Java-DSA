package AccenturePractice;

import java.util.Scanner;

public class FibonacciSeries {
    
    public static int FIB(int n) {
        if(n==0) {
            return 0; 
        }

        else if(n==1) {
            return 1;
        }

        int fib0=0;
        int fib1=1;
        
        for(int i=2; i<=n; i++) {
            int fib = fib0 + fib1;
            fib0=fib1;
            fib1=fib;
        }

        return fib1;
    }

    public static void printFib(int n) {
        for(int i=0; i<=n; i++) {
            System.out.print(FIB(i));
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        printFib(num);
    }
}