package MoreExercise;

import java.util.Scanner;

public class p05_DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int i = 0; i < numberOfLines; i++) {
            char character = scanner.nextLine().charAt(0);
            char currentSymbol = (char) (key + character);
            message += currentSymbol;
        }
        System.out.println(message);
    }
}
