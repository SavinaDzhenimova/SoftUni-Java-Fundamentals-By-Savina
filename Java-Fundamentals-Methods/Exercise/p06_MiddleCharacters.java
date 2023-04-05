package Exercise;

import java.util.Scanner;

public class p06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(printMiddleCharacters(input));
    }

    public static String printMiddleCharacters(String input) {
        String middleChars = "";
        if (input.length() % 2 == 0) {
            for (int i = input.length() / 2 - 1; i <= input.length() / 2; i++) {
                char currentChar = input.charAt(i);
                middleChars += currentChar;
            }
        } else {
            char currentChar = input.charAt(input.length() / 2);
            middleChars += currentChar;
        }

        return middleChars;
    }
}