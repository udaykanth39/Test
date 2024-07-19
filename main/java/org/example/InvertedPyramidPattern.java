package org.example;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the inverted pyramid

        for (int i = rows; i >= 1; i--) {
            // Printing spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

