package Lab;

import java.util.Scanner;

public class p12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;

        for (int num = 1; num <= n; num++) {
            int check = num;
            while (check > 0) {
                sumOfDigits += check % 10;
                check = check / 10;
            }
            boolean isSpecialNumber = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11);
            if (isSpecialNumber) {
                System.out.printf("%d -> True%n", num);
            } else {
                System.out.printf("%d -> False%n", num);
            }
            sumOfDigits = 0;
        }
    }
}
