package org.example;
import java.util.*;

public class Snail {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int h = scanner.nextInt();
                scanner.close();
                int days = calculateDays(a, b, h);
                if (days != -1) {
                    System.out.println(days);
                } else {
                    System.out.println("Impossible");
                }
            }
            private static int calculateDays(int a, int b, int h) {
                if (a <= b) {
                    return -1;
                }

                int days = (h - b - 1) / (a - b) + 1;

                return days;

    }
}
