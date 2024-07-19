package org.example;

public class LeftTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Printing spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
