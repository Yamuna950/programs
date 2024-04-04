package org.example;
import java.util.*;
//19
public class GoDutch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for bill total amount
        System.out.println("Enter the bill total amount: ");
        int billTotal = scanner.nextInt();

        // Checking if the bill total amount is negative
        if (billTotal < 0) {
            System.out.println("Bill total amount cannot be negative");
            // Exiting the program
            System.exit(1);
        }

        // Taking user input for the number of friends
        System.out.println("Enter the number of friends: ");
        int numberOfFriends = scanner.nextInt();

        // Checking if the number of friends is negative or zero
        if (numberOfFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
            // Exiting the program
            System.exit(1);
        }

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate the total payment including tips
        double totalPayment = billTotal * 1.10;

        // Calculate the part to pay for each friend using integer division
        int partToPay = (int) (totalPayment / numberOfFriends);

        // Print the result
        System.out.println("Each friend needs to pay: " + partToPay);
    }
}
