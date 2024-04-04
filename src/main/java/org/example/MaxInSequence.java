package org.example;
//5
import java.util.Scanner;

public class MaxInSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sequence of integer values, ending with 0:");

        int maxValue = max(scanner);

        System.out.println("Maximum value in the sequence: " + maxValue);

        scanner.close();
    }

    public static int max(Scanner scanner) {
        int maxValue = Integer.MIN_VALUE; // Initialize with the smallest possible integer value

        while (true) {
            int currentValue = scanner.nextInt();

            if (currentValue == 0) {
                break; // End of the input sequence
            }

            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }

        return maxValue;
    }

}
