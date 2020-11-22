package multiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();          // Get the dimension of the Matrix

        int[][] matrix = new int[size][size];   // Create the 2 dimensional matrix

        // Fill the matrix
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        boolean match = true;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col] != matrix[col][row]) {
                    match = false;
                    break;
                }
            }
        }

        if (match) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
