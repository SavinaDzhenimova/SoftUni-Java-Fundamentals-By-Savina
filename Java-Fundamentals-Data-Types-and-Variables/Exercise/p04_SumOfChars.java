package Exercise;

import java.util.Scanner;

public class p04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumOfCharacters = 0;
        for (int i = 0; i < n; i++) {
            char character = scanner.nextLine().charAt(0);
            sumOfCharacters += character;
        }
        System.out.printf("The sum equals: %d", sumOfCharacters);
    }
}
