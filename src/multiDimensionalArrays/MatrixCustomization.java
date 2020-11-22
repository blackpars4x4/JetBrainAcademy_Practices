package multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixCustomization {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int r = scan.nextInt();
        int seat = scan.nextInt();
        matrixCreator(row, col, r, seat);
    }


    public static void matrixCreator(int row, int col, int r, int seat) {
        String[][] grid = new String[row][col];
        System.out.println("Cinema:");
        String column = " ";
        for (int i = 1; i <= col; i++) {
            column += " " + i;

        }
        System.out.print(column);
        System.out.println();

        for (int i = 1; i <= row; i++) {
            System.out.print(i);
            for (int j = 1; j <= col; j++) {
                if (i == r && j == seat) {
                    System.out.print(" B");
                } else {
                    System.out.print(" S");
                }
            }
            System.out.println();
        }




        /*for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == r && j == seat) {
                    grid[i][j].replace("S", "B");
                }
            }
        }
        System.out.println(Arrays.toString(grid));*/
    }
}
