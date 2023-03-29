package MoreExercise;

import java.util.Scanner;

public class p06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < numberOfLines; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                openCount++;
            } else if (input.equals(")")) {
                closeCount++;
                if (openCount - closeCount != 0) {
                    System.out.println("UNBALANCED");
                    return;
                }
            }
        }
        if (openCount==closeCount) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}