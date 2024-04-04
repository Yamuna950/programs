package org.example;
//1

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] originalMatrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                originalMatrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transposedMatrix = transpose(originalMatrix);

        // Display the original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(originalMatrix);

        // Display the transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposedMatrix);

        scanner.close();
    }

    // Function to transpose a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
