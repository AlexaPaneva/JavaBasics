package JavaBasics.conditionalStatmentsExercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String seriesName = scanner.nextLine();

        int episodeDuration = Integer.parseInt(scanner.nextLine());
        double lunchBreak = Double.parseDouble(scanner.nextLine());

        double eatingTime = lunchBreak / 8.00;
        double restTime = lunchBreak / 4.00;

        lunchBreak = lunchBreak - (eatingTime + restTime);

        if ( lunchBreak >= episodeDuration){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(lunchBreak - episodeDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(episodeDuration - lunchBreak));
        }

    }
}
