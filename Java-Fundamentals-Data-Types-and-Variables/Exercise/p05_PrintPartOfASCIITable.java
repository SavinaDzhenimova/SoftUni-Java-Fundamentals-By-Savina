package Exercise;

import java.util.Scanner;

public class p05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startChar = Integer.parseInt(scanner.nextLine());
        int finalChar = Integer.parseInt(scanner.nextLine());

        for (int i = startChar; i <= finalChar; i++) {
            System.out.printf("%c ", i);
        }
    }
}
