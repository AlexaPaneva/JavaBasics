package JavaBasics.firstStepsExercise;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
    //        Пакет химикали - 5.80 лв.
    //
    //• Пакет маркери - 7.20 лв.
    //
    //• Препарат - 1.20 лв (за литър)

        Scanner scanner = new Scanner(System.in);
        int pencilsPackages = Integer.parseInt(scanner.nextLine());
        int markersPackages = Integer.parseInt(scanner.nextLine());
        int cleanersLiters = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double materialPrice = (pencilsPackages * 5.80) + (markersPackages * 7.20) + (cleanersLiters * 1.20);
        double discount = materialPrice * (percentDiscount / 100.0);


        System.out.println(materialPrice - discount);



    }
}
