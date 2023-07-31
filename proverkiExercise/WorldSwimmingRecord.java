package JavaBasics.proverkiExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecondsPerMeter = Double.parseDouble(scanner.nextLine());

        double swimmingTimeInSeconds = distanceInMeters * timeInSecondsPerMeter;

        double delayedTimes = Math.floor(distanceInMeters / 15);

        swimmingTimeInSeconds = swimmingTimeInSeconds + (delayedTimes * 12.5);

        if (swimmingTimeInSeconds < worldRecordInSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", swimmingTimeInSeconds);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(swimmingTimeInSeconds - worldRecordInSeconds));
        }




    }
}
