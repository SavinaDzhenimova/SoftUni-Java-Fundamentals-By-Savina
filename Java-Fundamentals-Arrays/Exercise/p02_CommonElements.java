package Exercise;

import java.util.Scanner;

public class p02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");
        String commonElements = "";

        for (String currentElement : secondArr) {
            for (String elementFirstArr : firstArr) {
                if (elementFirstArr.equals(currentElement)) {
                    commonElements += currentElement + " ";
                }
            }
        }
        System.out.println(commonElements);
    }
}