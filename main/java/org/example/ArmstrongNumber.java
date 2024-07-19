package org.example;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0;
        int n = 0;

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;
        System.out.println(originalNumber);

        for (;originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            System.out.println(originalNumber);
        }

        return result == number;
    }
}

