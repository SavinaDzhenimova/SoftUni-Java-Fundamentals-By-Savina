package Lab;

import java.util.Scanner;

public class p07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(textInput, n));
    }

    public static String repeatString(String text, int count) {
        String result = "";
        for (int i = 1; i <= count; i++) {
            result += text;
        }
        return result;
    }
}
