package MoreExercise;

import java.util.Scanner;

public class p04_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reversed = "";
        char ch;

        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i); //extracts each character
            reversed = ch + reversed; //adds each character in front of the existing string
        }
        System.out.println(reversed);
    }
}
