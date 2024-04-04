package org.example;
import java.util.*;
//9
public class Spiral {
        public static int[][] spiral(int rows, int columns) {
            int[][] result = new int[rows][columns];

            int startRow = 0, endRow = rows - 1;
            int startCol = 0, endCol = columns - 1;
            int counter = 1;

            while (startRow <= endRow && startCol <= endCol) {
                // Fill top row
                for (int i = startCol; i <= endCol; i++) {
                    result[startRow][i] = counter++;
                }
                startRow++;

                // Fill right column
                for (int i = startRow; i <= endRow; i++) {
                    result[i][endCol] = counter++;
                }
                endCol--;

                // Fill bottom row
                if (startRow <= endRow) {
                    for (int i = endCol; i >= startCol; i--) {
                        result[endRow][i] = counter++;
                    }
                    endRow--;
                }

                // Fill left column
                if (startCol <= endCol) {
                    for (int i = endRow; i >= startRow; i--) {
                        result[i][startCol] = counter++;
                    }
                    startCol++;
                }
            }

            return result;
        }



        public static void main(String[] args) {
            int rows = 3;
            int columns = 4;
            int[][] result = spiral(rows, columns);

            // Print the result
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }


}
