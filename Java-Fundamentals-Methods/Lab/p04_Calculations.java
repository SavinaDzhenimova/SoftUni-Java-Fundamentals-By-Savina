package Lab;

import java.util.Scanner;

public class p04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                printAddNumbers(firstNum, secondNum);
                break;
            case "multiply":
                printMultiplyNumbers(firstNum, secondNum);
                break;
            case "subtract":
                printSubtractNumbers(firstNum, secondNum);
                break;
            case "divide":
                printDivideNumbers(firstNum, secondNum);
                break;
        }
    }

    public static void printAddNumbers(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }

    public static void printMultiplyNumbers(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void printSubtractNumbers(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    public static void printDivideNumbers(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}
