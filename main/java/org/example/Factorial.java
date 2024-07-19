package org.example;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Factorial of " + number + " is " + factorial(number));
    }

    public static long factorial(int number) {
        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
