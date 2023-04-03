package Exercise;

import java.util.Scanner;

public class p01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] passengersArr = new int[n];
        int sum = 0;

        for (int i = 0; i < passengersArr.length; i++) {
            passengersArr[i] = Integer.parseInt(scanner.nextLine());
            System.out.print(passengersArr[i] + " ");
            sum += passengersArr[i];
        }
        System.out.printf("%n%d", sum);
    }
}