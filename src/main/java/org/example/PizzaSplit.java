package org.example;
import java.util.*;
//16
public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of people and pieces per pizza
        System.out.println("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();

        System.out.println("Enter the number of pieces per pizza: ");
        int piecesPerPizza = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate the minimum number of pizzas needed
        int minimumPizzas = calculateMinimumPizzas(numberOfPeople, piecesPerPizza);

        // Print the result
        System.out.println("Minimum number of pizzas needed: " + minimumPizzas);
    }

    // Method to calculate the minimum number of pizzas needed
    private static int calculateMinimumPizzas(int numberOfPeople, int piecesPerPizza) {
        // Calculate the total number of slices needed
        int totalSlices = numberOfPeople * piecesPerPizza;

        // Calculate the minimum number of pizzas using integer division
        int minimumPizzas = (totalSlices + piecesPerPizza - 1) / piecesPerPizza;

        return minimumPizzas;

    }
}
