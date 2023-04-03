package MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class p01_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int sum = 0;
            int vowel = 0;
            int consonant = 0;
            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);
                if (currentChar == 'a' || currentChar == 'o' || currentChar == 'e' || currentChar == 'i' || currentChar == 'u' ||
                        currentChar == 'A' || currentChar == 'O' || currentChar == 'E' || currentChar == 'I' || currentChar == 'U') {
                    vowel += currentChar * input.length();
                } else {
                    consonant += currentChar / input.length();
                }
            }
            sum = vowel + consonant;
            numbers[i] = sum;
        }
        Arrays.sort(numbers);
        for (int print : numbers) {
            System.out.println(print);
        }
    }
}