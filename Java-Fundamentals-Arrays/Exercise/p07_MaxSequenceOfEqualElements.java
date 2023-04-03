package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class p07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxCount = 0;
        int numberOfSequence = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            int currentNumber = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int nextNumber = numbers[j];
                if (currentNumber == nextNumber) {
                    count++;
                    if (maxCount < count) {
                        maxCount = count;
                        numberOfSequence = currentNumber;
                    }
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i <= maxCount; i++) {
            System.out.printf("%d ", numberOfSequence);
        }
    }
}