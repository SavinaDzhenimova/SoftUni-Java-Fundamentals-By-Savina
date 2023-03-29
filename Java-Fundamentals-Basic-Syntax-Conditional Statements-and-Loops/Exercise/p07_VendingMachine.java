package Exercise;

import java.util.Scanner;

public class p07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalMoney = 0.0;
        double price = 0.0;
        boolean invalid = false;

        while (!input.equals("Start")) {
            double money = Double.parseDouble(input);
            if (money == 2.00 || money == 1.00 || money == 0.50 || money == 0.20 || money == 0.10) {
                totalMoney += money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!product.equals("End")) {
            if (product.equals("Nuts")) {
                price = 2.00;
            } else if (product.equals("Water")) {
                price = 0.70;
            } else if (product.equals("Crisps")) {
                price = 1.50;
            } else if (product.equals("Soda")) {
                price = 0.80;
            } else if (product.equals("Coke")) {
                price = 1.00;
            } else {
                invalid = true;
            }

            if (totalMoney < price) {
                System.out.println("Sorry, not enough money");
            } else if (invalid) {
                System.out.println("Invalid product");
            } else {
                System.out.printf("Purchased %s%n", product);
                totalMoney -= price;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);
    }
}
