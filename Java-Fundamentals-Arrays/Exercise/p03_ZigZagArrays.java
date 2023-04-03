package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class p03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 0; i < n; i++) {
            String[] currentArr = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArr[i] = currentArr[0];
                secondArr[i] = currentArr[1];
            } else {
                secondArr[i] = currentArr[0];
                firstArr[i] = currentArr[1];
            }
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}