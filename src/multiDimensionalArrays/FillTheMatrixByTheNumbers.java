package multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrixByTheNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.abs(j - i);
            }
        }
        for (int i = 0; i < n; i++) {
            String str = Arrays.toString(matrix[i]);
            str = str.replace("[", "").replace(",", "").replace("]", "");
            System.out.println(str);
        }

        matrixCreator(n);
    }


    // Another Methods to create a matrix...
    public static void matrixCreator(int n){
        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();*/
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Math.abs(j - i) + " ");
            }
            System.out.println();
        }

    }
}
