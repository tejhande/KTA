package a_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

// ArrayExceptionHandling.java
public class ArrayExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        
        // Input values for the array
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < array.length; i++) {
            while (true) {
                try {
                    array[i] = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // Clear the invalid input
                }
            }
        }

        // Print all elements
        System.out.println("Array elements:");
        for (int value : array) {
            System.out.println(value);
        }

        // Sort the array
        Arrays.sort(array);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int value : array) {
            System.out.println(value);
        }

        // Handle exception for accessing beyond array size
        System.out.println("Enter an index to access (0 to 4):");
        try {
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter a valid index between 0 and 4.");
        } finally {
            scanner.close();
        }
    }
}
