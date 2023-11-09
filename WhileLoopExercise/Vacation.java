package javaBasics.whileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int consecutiveSpends = 0;
        int daysCount = 0;

        while (currentMoney < vacationPrice) {

            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            daysCount++;

            switch (action) {
                case "spend":
                    currentMoney -= sum;
                    if (currentMoney < 0) {
                        currentMoney = 0;
                    }
                    consecutiveSpends++;
                    break;
                case "save":
                    currentMoney += sum;
                    consecutiveSpends = 0;
                    break;
            }

            if (consecutiveSpends == 5) {
                //"You can't save the money."
                System.out.println("You can't save the money.");
                //"{Общ брой изминали дни}"
                System.out.println(daysCount);
                break;
            }
        }

        //Ако Джеси е спеситла пари за екскурзията
        if (currentMoney >= vacationPrice) {
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}