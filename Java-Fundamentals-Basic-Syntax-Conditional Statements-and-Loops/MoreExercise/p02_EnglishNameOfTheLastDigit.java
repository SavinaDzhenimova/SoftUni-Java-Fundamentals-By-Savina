package MoreExercise;

import java.util.Scanner;

public class p02_EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = Long.parseLong(scanner.nextLine());
        long lastD = FindLastDigits(num);

        if (num == 1) {
            System.out.println("one");
        }
        else if (lastD == 2) {
            System.out.println("two");
        }
        else if (lastD == 3) {
            System.out.println("three");
        }
        else if (lastD == 4) {
            System.out.println("four");
        }
        else if (lastD == 5) {
            System.out.println("five");
        }
        else if (lastD == 6) {
            System.out.println("six");
        }
        else if (lastD == 7) {
            System.out.println("seven");
        }
        else if (lastD == 8) {
            System.out.println("eight");
        }
        else if (lastD == 9) {
            System.out.println("nine");
        }
        else if (lastD == 0) {
            System.out.println("zero");
        }
    }

    private static long FindLastDigits(long num)
    {
        return Math.abs(num % 10);
    }
}
