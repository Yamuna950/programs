package org.example;

import java.util.Scanner;

public class Snail14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking user input for a, b, and h
        System.out.println("Enter the distance the snail travels up each day (a): ");
        int a = scanner.nextInt();

        System.out.println("Enter the distance the snail slides down each night (b): ");
        int b = scanner.nextInt();

        System.out.println("Enter the height of the tree (h): ");
        int h = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate the number of days for the snail to reach the top of the tree
        int days = calculateDays(a, b, h);

        // Print the result
        if (days != -1) {
            System.out.println("Number of days for the snail to reach the top: " + days);
        } else {
            System.out.println("Impossible");
        }
    }

    // Method to calculate the number of days for the snail to reach the top
    private static int calculateDays(int a, int b, int h) {
        // If the snail cannot reach the top, return -1
        if (a <= b) {
            return -1;
        }
        int days = (h - b - 1) / (a - b) + 1;
        return days;
    }
}
