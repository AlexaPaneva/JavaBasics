package javaBasics.regularExam;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int locationsCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < locationsCount; i++) {
            double expectedGoldPerDay = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double totalGold = 0;

            for (int j = 0; j < days; j++) {
                double goldPerDay = Double.parseDouble(scanner.nextLine());
                totalGold += goldPerDay;
            }

            double averageGoldPerDay = totalGold / days;
            if (averageGoldPerDay >= expectedGoldPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldPerDay);
            }
            else if (averageGoldPerDay < expectedGoldPerDay) {
                double neededGold = expectedGoldPerDay - averageGoldPerDay;
                System.out.printf("You need %.2f gold.%n", neededGold);
            } else  {
                double neededGold = ((expectedGoldPerDay * days) - totalGold) / 2;
                System.out.printf("You need %.2f gold.%n", neededGold);
            }


        }
    }
}


