package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(getMathPower(number, power)));
    }

    public static double getMathPower(double num, double power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result *= num;
        }
        return result;
    }
}
