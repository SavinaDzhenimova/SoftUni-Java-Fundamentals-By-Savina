package Exercise;

import java.util.Scanner;

public class p10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int curNum = 1; curNum <= num; curNum++) {
            if (isDivisibleBy8(curNum) && isWithOddDigit(curNum)) {
                System.out.println(curNum);
            }
        }
    }

    public static boolean isDivisibleBy8(int curNum) {
        int digitsSum = 0;
        while (curNum > 0) {
            int curDigit = curNum % 10;
            digitsSum += curDigit;
            curNum /= 10;
        }

        if (digitsSum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isWithOddDigit(int curNum) {
        while (curNum > 0) {
            int curDigit = curNum % 10;
            if (curDigit == 1 || curDigit == 3 || curDigit == 5 || curDigit == 7 || curDigit == 9) {
                return true;
            }
            curNum /= 10;
        }
        return false;
    }
}