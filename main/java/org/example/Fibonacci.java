package org.example;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int firstTerm = 0, secondTerm = 1;

        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);

        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

