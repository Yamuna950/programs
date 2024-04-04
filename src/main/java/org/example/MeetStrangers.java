package org.example;
//4
import java.util.Scanner;

public class MeetStrangers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strangers to meet: ");
        int strangersCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        if (strangersCount == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (strangersCount < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
            System.out.println("Enter stranger names:");

            for (int i = 0; i < strangersCount; i++) {
                String strangerName = scanner.nextLine().trim();

                if (!strangerName.isEmpty()) {
                    System.out.println("Hello, " + strangerName);
                } else {
                    System.out.println("Invalid input for stranger name. Please enter a non-empty name.");
                    i--; // Decrement i to repeat the current iteration
                }
            }
        }

        scanner.close();
    }

}
