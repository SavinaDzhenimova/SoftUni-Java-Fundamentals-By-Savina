package Lab;

import java.util.Scanner;

public class p04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startHours = Integer.parseInt(scanner.nextLine());
        int startMinutes = Integer.parseInt(scanner.nextLine());

        int totalTime = startHours * 60 + startMinutes + 30;
        int hours = totalTime / 60;
        int minutes = totalTime % 60;

        if (hours > 23) {
            System.out.printf("0:%02d", minutes);
        } else {
            System.out.printf("%d:%02d", hours, minutes);
        }
    }
}
