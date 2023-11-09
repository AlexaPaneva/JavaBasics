package javaBasics.preExam;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Опаковъчна хартия - 5.80 лв. за ролка
        //•	Плат - 7.20 лв. за ролка
        //•	Лепило - 1.20 лв. за литър

        int rollsOfWrappingPaperCount = Integer.parseInt(scanner.nextLine());
        int  rollsOfFabricCount = Integer.parseInt(scanner.nextLine());
        double glueInLiters = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double rollsOfWrappingPaperPrice = rollsOfWrappingPaperCount * 5.80;
        double rollsOfFabricPrice = rollsOfFabricCount * 7.20;
        double glueInLitersPrice = glueInLiters * 1.20;

        double totalPrice = rollsOfWrappingPaperPrice + rollsOfFabricPrice + glueInLitersPrice;
        double result = totalPrice - (totalPrice * percent/100) ;
        System.out.printf("%.3f", result);
    }
}
