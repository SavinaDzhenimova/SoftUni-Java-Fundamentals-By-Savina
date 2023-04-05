package Exercise;

import java.util.Scanner;

public class p03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startChar = scanner.nextLine().charAt(0);
        char endChar = scanner.nextLine().charAt(0);

        printChars(startChar, endChar);
    }

    public static void printChars(char startChar, char endChar) {
        if (startChar < endChar) {
            for (int i = startChar + 1; i < endChar; i++) {
                System.out.printf("%c ", i);
            }
        } else {
            for (int i = endChar + 1; i < startChar; i++) {
                System.out.printf("%c ", i);
            }
        }
    }
}