package Exercise;

import java.util.Scanner;

public class p02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        int count = 0;

        printCountOfVowels(inputText, count);
    }

    public static void printCountOfVowels(String inputText, int count) {
        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);
            if (currentChar == 'a' || currentChar == 'o' || currentChar == 'e' || currentChar == 'i' || currentChar == 'u' ||
                    currentChar == 'A' || currentChar == 'O' || currentChar == 'E' || currentChar == 'I' || currentChar == 'U') {
                count++;
            }
        }
        System.out.println(count);
    }
}