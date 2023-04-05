package Lab;

import java.util.Scanner;

public class p05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int countOfProducts = Integer.parseInt(scanner.nextLine());

        switch (product) {
            case "coffee":
                printCoffeeOrder(countOfProducts);
                break;
            case "water":
                printWaterOrder(countOfProducts);
                break;
            case "coke":
                printCokeOrder(countOfProducts);
                break;
            case "snacks":
                printSnacksOrder(countOfProducts);
                break;
        }
    }

    public static void printCoffeeOrder(int count) {
        double price = 1.50;
        double totalPrice = price * count;
        System.out.printf("%.2f%n", totalPrice);
    }

    public static void printWaterOrder(int count) {
        double price = 1.00;
        double totalPrice = price * count;
        System.out.printf("%.2f%n", totalPrice);
    }

    public static void printCokeOrder(int count) {
        double price = 1.40;
        double totalPrice = price * count;
        System.out.printf("%.2f%n", totalPrice);
    }

    public static void printSnacksOrder(int count) {
        double price = 2.00;
        double totalPrice = price * count;
        System.out.printf("%.2f%n", totalPrice);
    }
}