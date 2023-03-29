package Exercise;

import java.util.Scanner;

public class p05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int failures = 0;

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position); //extracts each character
            password += currentSymbol; //adds each character in front of the existing string
        }

        String input = scanner.nextLine();
        while (!input.equals(password)) {
            failures++;
            if (failures == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }

        if (input.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
