package MoreExercise;

import java.util.Scanner;

public class p01_DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int num = Integer.parseInt(scanner.nextLine());
                System.out.println(getDataType(num));
                break;
            case "real":
                double number = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f", getDataType(number));
                break;
            case "string":
                String text = scanner.nextLine();
                System.out.println(getDataType(text));
                break;
        }
    }

    public static int getDataType(int num) {
        return num * 2;
    }

    public static double getDataType(double num) {
        return num * 1.5;
    }

    public static String getDataType(String text) {
        return "$" + text + "$";
    }
}