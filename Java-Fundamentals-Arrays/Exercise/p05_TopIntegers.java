package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class p05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean topInteger = false;

        for (int i = 0; i < numbersArr.length; i++) {
            int currentNumber = numbersArr[i];
            topInteger = true;
            for (int j = i + 1; j < numbersArr.length; j++) {
                int nextNumber = numbersArr[j];
                if (currentNumber <= nextNumber) {
                    topInteger = false;
                    break;
                }
            }
            if (topInteger) {
                System.out.printf("%d ", currentNumber);
            }
        }
    }
}