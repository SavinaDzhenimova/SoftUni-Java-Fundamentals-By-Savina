package Exercise;

import java.util.Scanner;

public class p07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int totalLiters = 0;

        for (int i = 0; i < n; i++) {
            int litersOfWater = Integer.parseInt(scanner.nextLine());
            if (litersOfWater <= capacity) {
                capacity -= litersOfWater;
                totalLiters += litersOfWater;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(totalLiters);
    }
}
