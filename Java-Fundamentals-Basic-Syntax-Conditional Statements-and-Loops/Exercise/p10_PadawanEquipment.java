package Exercise;

import java.util.Scanner;

public class p10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double totalLightsabers = Math.ceil((countOfStudents * 1.10)) * lightsaberPrice;
        double totalRobes = countOfStudents * robePrice;
        int freeBelts = countOfStudents / 6;
        double totalBelts = (countOfStudents - freeBelts) * beltPrice;
        double totalMoney = totalLightsabers + totalRobes + totalBelts;

        if (totalMoney <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalMoney);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalMoney - amountOfMoney);
        }
    }
}
