package Lab;

import java.util.Scanner;

public class p10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvenAndOdds(Math.abs(number)));
    }

    public static int getMultipleOfEvenAndOdds(int number) {
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);
        return evenSum * oddSum;
    }

    public static int getEvenSum(int number) {
        int evenSum = 0;
        while (number != 0) {
            int digits = number % 10;
            if(digits % 2 ==0) {
                evenSum += digits;
            }
            number /=10;

        }
        return evenSum;
    }

    public static int getOddSum(int number) {
        int oddSum = 0;
        while (number != 0) {
            int digits = number % 10;
            if(digits % 2 ==1) {
                oddSum += digits;
            }
            number /=10;

        }
        return oddSum;
    }
}
