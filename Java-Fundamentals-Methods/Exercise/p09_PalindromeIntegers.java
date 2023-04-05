package Exercise;

import java.util.Scanner;

public class p09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals("END")) {
            System.out.println(isPalindrome(input));
            input = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            char current = input.charAt(i);
            reversed += current;
        }

        if (reversed.equals(input)) {
            return true;
        } else {
            return false;
        }
    }
}