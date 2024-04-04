package org.example;
//3
import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        solveQuadraticEquation(a, b, c);

        scanner.close();
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two roots: " + root1 + " " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One root: " + root);
        } else {
            System.out.println("No roots");
        }
    }

}
