package javaBasics.conditionalStatmentsExercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        int videoCarts = Integer.parseInt(scanner.nextLine());
        double processors = Double.parseDouble(scanner.nextLine());
        double ramMemories = Double.parseDouble(scanner.nextLine());


        double videoCartsPrice = videoCarts * 250;
        double processorPrice = processors * (videoCartsPrice * 0.35);
        double ramMemoriesPrice = ramMemories * (videoCartsPrice * 0.10);


        double finalPrice = videoCartsPrice + processorPrice + ramMemoriesPrice;

//        double totalSum = 0;

        if (videoCarts > processors) {
            finalPrice = finalPrice - (finalPrice * 0.15);
//
        }

        if (budget >= finalPrice) {
            System.out.printf("You have %.2f leva left!", budget - finalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", finalPrice - budget);

        }
    }
}
