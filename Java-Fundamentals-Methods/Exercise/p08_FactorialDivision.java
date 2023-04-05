package Exercise;

import java.util.Scanner;

public class p08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstNum = Long.parseLong(scanner.nextLine());
        long secondNum = Long.parseLong(scanner.nextLine());

        double factorialDivision = getFirstNumFactorial(firstNum) / getSecondNumFactorial(secondNum);
        System.out.printf("%.2f", factorialDivision);
    }

    public static double getFirstNumFactorial(long firstNum) {
        long factorialFirstNum = 1;
        for (int i = 1; i <= firstNum; i++) {
            factorialFirstNum *= i;
        }
        return factorialFirstNum;
    }

    public static double getSecondNumFactorial(long secondNum) {
        long factorialSecondNum = 1;
        for (int i = 1; i <= secondNum; i++) {
            factorialSecondNum *= i;
        }
        return factorialSecondNum;
    }
}