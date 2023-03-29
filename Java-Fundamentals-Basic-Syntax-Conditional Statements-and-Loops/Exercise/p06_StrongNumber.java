package Exercise;

import java.util.Scanner;

public class p06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        int checkNum = inputNum;
        int factorialSum = 0;

        while (checkNum > 0) {
            int lastDigit = checkNum % 10;

            int factorial = 1;
            for (int i = 1; i <= lastDigit; i++) {
                factorial *= i;
            }
            factorialSum += factorial;
            checkNum = checkNum / 10;
        }

        if (factorialSum == inputNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
