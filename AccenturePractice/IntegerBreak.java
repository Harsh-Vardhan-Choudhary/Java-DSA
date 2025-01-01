package AccenturePractice;

import java.util.Scanner;

public class IntegerBreak {

    public static int maxIntProduct(int n) {
        
        if(n==2) {
            return 1;
        }

        else if(n==3) {
            return 2;
        }

        //n is divisible by 3
        else if(n%3==0) {
            return (int) Math.pow(3, (n/3));
        }

        //here adjusting for remainder 1
        else if(n%3==1) {
            return (int) Math.pow(3, (n/3) -1) * 4;
        }

        //remainder is 2
        else if(n%3==2) {
            return (int) Math.pow(3, (n/3)) *2;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an element : ");
        int num = input.nextInt();
        System.out.println(maxIntProduct(num));
    }
}
