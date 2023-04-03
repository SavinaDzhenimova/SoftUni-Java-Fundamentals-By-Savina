package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class p03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumEvenNumbers = 0;
        for (int item : numbersArr) {
            if (item % 2 == 0) {
                sumEvenNumbers += item;
            }
        }
        System.out.println(sumEvenNumbers);
    }
}
