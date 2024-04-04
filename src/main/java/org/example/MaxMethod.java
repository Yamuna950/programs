package org.example;
import java.util.*;
//6
public class MaxMethod {
    public static int max(int[] values) {
        int max = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] vals = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            vals[i] = scanner.nextInt();
        }

        int result = MaxMethod.max(vals);
        System.out.println("The maximum value in the array is: " + result);

        scanner.close();
    }
}
