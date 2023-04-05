package Lab;

import java.util.Scanner;

public class p11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (operator) {
            case "+":
                System.out.println(addNumbers(firstNum, secondNum));
                break;
            case "-":
                System.out.println(subtractNumbers(firstNum, secondNum));
                break;
            case "*":
                System.out.println(multiplyNumbers(firstNum, secondNum));
                break;
            case "/":
                System.out.println(divideNumbers(firstNum, secondNum));
                break;
        }
    }

    public static int addNumbers(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static int subtractNumbers(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public static int multiplyNumbers(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static int divideNumbers(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
}
