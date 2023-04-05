package Exercise;

import java.util.Scanner;

public class p01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printTheSmallestNumber(firstNum, secondNum, thirdNum);
    }

    public static void printTheSmallestNumber(int firstNum, int secondNum, int thirdNum) {
        int smallestNum;
        if (firstNum <= secondNum && firstNum <= thirdNum) {
            smallestNum = firstNum;
        } else if (secondNum <= firstNum && secondNum <= thirdNum) {
            smallestNum = secondNum;
        } else {
            smallestNum = thirdNum;
        }
        System.out.println(smallestNum);
    }
}