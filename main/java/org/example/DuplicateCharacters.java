package org.example;

import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        findDuplicates(input);
    }

    public static void findDuplicates(String str) {
        int[] charCount = new int[256];

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        System.out.println("Duplicate characters:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }
}
