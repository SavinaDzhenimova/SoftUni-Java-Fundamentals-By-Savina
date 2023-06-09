package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class p08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int nextNum = numbers[j];
                if (currentNum + nextNum == magicSum) {
                    System.out.printf("%d %d%n", currentNum, nextNum);
                }
            }
        }
    }
}