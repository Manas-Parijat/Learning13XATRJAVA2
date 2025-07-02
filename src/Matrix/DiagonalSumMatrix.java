package Matrix;

import java.util.Scanner;

public class DiagonalSumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of square matrix
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int diagonalSum = 0;

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                if (i == j) {
                    diagonalSum += matrix[i][j];  // primary diagonal
                }
            }
        }

        // Display the matrix
        System.out.println("\nMatrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.println("\nSum of primary diagonal: " + diagonalSum);

        sc.close();
    }
}

