package MoreExercise;

import java.util.Scanner;

public class p04_RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int finalNumber = Integer.parseInt(scanner.nextLine());
        for (int divisible = 2; divisible <= finalNumber; divisible++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor < divisible; divisor++) {
                if (divisible % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", divisible, isPrime);
        }
    }
}
