package org.example;
import java.util.OptionalInt;
import java.util.Scanner;

public class OptionalMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] values = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at position " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        OptionalInt result = max(values);

        if (result.isPresent()) {
            System.out.println("Maximum value in the array: " + result.getAsInt());
        } else {
            System.out.println("Input array is empty or null.");
        }

        scanner.close();
    }

    public static OptionalInt max(int[] values) {
        if (values == null || values.length == 0) {
            return OptionalInt.empty();
        }

        int max = values[0];

        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }

        return OptionalInt.of(max);
    }

}
