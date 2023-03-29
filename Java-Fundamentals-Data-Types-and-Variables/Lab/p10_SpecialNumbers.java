package Lab;

import java.util.Scanner;

public class p10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            int checkNumber = number;
            int sumDigits = 0;

            while (checkNumber != 0) {
                int currentDigit = checkNumber % 10;
                sumDigits += currentDigit;
                checkNumber /= 10;
            }

            if (sumDigits == 5 || sumDigits == 7 || sumDigits == 11) {
                System.out.printf("%d -> True%n", number);
            } else {
                System.out.printf("%d -> False%n", number);
            }
        }
    }
}
