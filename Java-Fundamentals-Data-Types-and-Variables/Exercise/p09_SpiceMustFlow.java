package Exercise;

import java.util.Scanner;

public class p09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int allSpices = 0;
        int workDays = 0;

        while (startingYield >= 100) {
            workDays++;
            int extractedSpices = startingYield - 26;
            allSpices += extractedSpices;
            startingYield -= 10;
        }
        if (allSpices > 26) {
            allSpices -= 26;
        }
        System.out.println(workDays);
        System.out.println(allSpices);
    }
}