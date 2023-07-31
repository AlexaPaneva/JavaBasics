package JavaBasics.slojniProverkiExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCount = Integer.parseInt(scanner.nextLine());

        double priceBoat = 0.00;

        switch (season) {
            case "Spring":
                priceBoat = 3000.00;
                break;

            case "Summer":
            case "Autumn":
                priceBoat = 4200.00;
                break;

            case "Winter":
                priceBoat = 2600.00;
                break;
        }
        if (fishersCount <= 6) {
            priceBoat = priceBoat - (priceBoat * 0.10);
        } else if (fishersCount <= 11) {
            priceBoat = priceBoat - (priceBoat * 0.15);
        } else {
            priceBoat = priceBoat - (priceBoat * 0.25);
        }
        if (fishersCount % 2 == 0 && !season.equals("Autumn")) {
            priceBoat = priceBoat - (priceBoat * 0.05);
        }
        if (priceBoat <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - priceBoat);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", priceBoat - budget);
        }
    }
}
