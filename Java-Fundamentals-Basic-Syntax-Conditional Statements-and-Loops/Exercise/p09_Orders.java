package Exercise;

import java.util.Scanner;

public class p09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(scanner.nextLine());
        double totalPerOrder = 0.0;
        double total = 0.0;

        for (int i = 1; i <= countOfOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            totalPerOrder = ((days * capsulesCount) * pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f%n", totalPerOrder);
            total += totalPerOrder;
        }
        System.out.printf("Total: $%.2f", total);
    }
}
