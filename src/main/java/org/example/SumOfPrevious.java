package org.example;
import java.util.*;
public class SumOfPrevious {
    public static boolean[] getSumCheckArray(int[] values) {
        boolean[] result = new boolean[values.length];

        // First two elements are always false
        result[0] = false;
        result[1] = false;

        for (int i = 2; i < values.length; i++) {
            // Check if the current element is a sum of two previous elements
            result[i] = (values[i] == values[i - 1] + values[i - 2]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        boolean[] result = SumOfPrevious.getSumCheckArray(array);

        // Print the output array
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
