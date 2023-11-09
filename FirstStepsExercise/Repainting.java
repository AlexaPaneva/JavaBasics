package javaBasics.firstStepsExercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workerHours = Integer.parseInt(scanner.nextLine());

        //· Предпазен найлон - 1.50 лв. за кв. метъr
        //· Боя - 14.50 лв. за литър
        //· Разредител за боя - 5.00 лв. за литър

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint * 1.10) * 14.50;
        double thinnerPrice = thinner * 5.00;

        double materialPrice = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double workerPrice = (materialPrice * 0.30) * workerHours;

        System.out.println(materialPrice + workerPrice);



    }
}
