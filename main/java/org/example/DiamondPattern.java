package org.example;

public class DiamondPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
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


        for (int i = rows - 1; i >= 1; i--) {
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
