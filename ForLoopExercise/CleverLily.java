package JavaBasics.ForLoopExercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lilyAge = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());


        int toys = 0;
        double lilyMoney = 0.00;
        double birthdayMoney = 10.00;

        for (int i = 1; i <= lilyAge; i++) {
            if (i % 2 == 0) {
                lilyMoney += birthdayMoney;
                birthdayMoney += 10.00;
                lilyMoney -= 1.00;
            } else {
                toys++;

            }

        }
        lilyMoney += toys * toyPrice;

        if (lilyMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", lilyMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - lilyMoney);
        }

    }
}
