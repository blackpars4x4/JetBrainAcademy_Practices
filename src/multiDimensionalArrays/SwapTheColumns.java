package multiDimensionalArrays;

import java.util.Scanner;

public class SwapTheColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[scanner.nextInt()][scanner.nextInt()];

        for(int col = 0; col < matrix.length; col++){
            for(int row = 0; row < matrix[col].length; row++){
                matrix[col][row] = scanner.nextInt();
            }
        }
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        if(c1 != c2){
            for(int i=0; i<matrix.length;i++){
                matrix[i][c1] ^= matrix[i][c2];
                matrix[i][c2] ^= matrix[i][c1];
                matrix[i][c1] ^= matrix[i][c2];
            }
        }

        for (int [] ints : matrix){
            for(int anInt : ints){
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }



    }
}
/*
Given a two-dimensional array (matrix) and the two numbers: i and j. Swap the columns with indexes i and j within the matrix.

Input contains matrix dimensions n and m, not exceeding 100, then the elements of the matrix, then the indexes i and j.

 Report a typo
Sample Input 1:

3 4
11 12 13 14
21 22 23 24
31 32 33 34
0 1
Sample Output 1:

12 11 13 14
22 21 23 24
32 31 33 34
 */