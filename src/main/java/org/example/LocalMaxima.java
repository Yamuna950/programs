package org.example;
import java.util.*;
//7  nw
public class LocalMaxima {
    public static int[] removeLocalMaxima(int[] values) {
        int[] result = Arrays.copyOf(values, values.length);

        for (int i = 1; i < values.length - 1; i++) {
            if (values[i] > values[i - 1] && values[i] > values[i + 1]) {
                result = removeElement(result, i);
            }
        }

        return result;
    }

    private static int[] removeElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
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

        int[] result = LocalMaxima.removeLocalMaxima(vals);
        System.out.println("Array after removing local maxima: " + Arrays.toString(result));

        scanner.close();
    }
}
