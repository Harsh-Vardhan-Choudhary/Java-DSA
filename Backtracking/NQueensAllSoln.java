package Backtracking;

import java.util.*;

public class NQueensAllSoln
{
    public static boolean isSafe(char board[][], int row, int col)
    {
        //vertical up
        for(int i=row-1; i>=0; i--)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        //left diagonal up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        //right diagonal up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        return true;
    }

    public static void NQueensAllSoln(char board[][], int row)
    {
        //base case
        if(row == board.length)
        {
            printBoard(board);
            count++;                //count number of ways
            return;
        }

        //column 
        for(int j=0; j<board.length; j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j] = 'Q';
                NQueensAllSoln(board, row+1);   //function call for next row
                board[row][j] = 'X';            //backtracking step
            }
            
        }
    }

    public static void printBoard(char board[][])
    {
        System.out.println("\n"+"----- CHESS BOARD -----");
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String args[])    
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        char board[][] = new char[n][n];
        //board initialization
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                board[i][j] = 'X';
            }
        }
        NQueensAllSoln(board, 0);
        System.out.println("\nTotal Number of board possible are : " + count);
    }
}
