package Exercise;

import java.util.Scanner;

public class p03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String typeOfHoliday = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        switch (typeOfHoliday) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16.00;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = 15.00;
                        break;
                    case "Saturday":
                        price = 20.00;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }
                break;
        }

        double total = number * price;
        if (typeOfHoliday.equals("Students")) {
            if (number >= 30) {
                total -= total * 0.15;
            }
        } else if (typeOfHoliday.equals("Business")) {
            if (number >= 100) {
                total -= 10 * price;
            }
        } else if (typeOfHoliday.equals("Regular")) {
            if (number >= 10 && number <= 20) {
                total -= total * 0.05;
            }
        }

        System.out.printf("Total price: %.2f", total);
    }
}
