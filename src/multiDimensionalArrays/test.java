package multiDimensionalArrays;

import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Math.abs(j - i) + " ");
            }
            System.out.println();
        }

    }}
