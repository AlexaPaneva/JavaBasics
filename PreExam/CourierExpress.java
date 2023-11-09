package javaBasics.preExam;

import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double shipmentKg = Double.parseDouble(scanner.nextLine());
        String serviceType = scanner.nextLine();
        double kilometers = Double.parseDouble(scanner.nextLine());

        double price = 0;
        double overestimationForKg = 0;
        double overestimationForKlm = 0;
        double totalOverestimation = 0;

        if (serviceType.equals("standard")) {
            if (shipmentKg < 1) {
                price = kilometers  * 0.03;
            } else if (shipmentKg < 10) {
                price = kilometers * 0.05;
            } else if (shipmentKg < 40) {
                price = kilometers * 0.10;
            } else if (shipmentKg < 90) {
                price = kilometers * 0.15;
            } else {
                price = kilometers * 0.20;
            }

        }
        if (serviceType.equals("express")) {
            if (shipmentKg < 1) {
                price = kilometers * 0.03;
                overestimationForKg = 0.8 * 0.03;
                overestimationForKlm = shipmentKg * overestimationForKg;
                totalOverestimation = kilometers * overestimationForKlm;
                price = price + totalOverestimation;
            } else if (shipmentKg < 10) {
                price = kilometers * 0.05;
                overestimationForKg = 0.4 * 0.05;
                overestimationForKlm = shipmentKg * overestimationForKg;
                totalOverestimation = kilometers * overestimationForKlm;
                price = price + totalOverestimation ;
            } else if (shipmentKg < 40) {
                price = kilometers * 0.10;
                overestimationForKg = 0.05 * 0.10;
                overestimationForKlm = shipmentKg * overestimationForKg;
                totalOverestimation = kilometers * overestimationForKlm;
                price =  price +  totalOverestimation;
            } else if (shipmentKg < 90) {
                price = kilometers * 0.15;
                overestimationForKg = 0.02 * 0.15;
                overestimationForKlm = shipmentKg * overestimationForKg;
                totalOverestimation = kilometers * overestimationForKlm;
                price = price + totalOverestimation ;
            } else {
                price = kilometers * 0.20;
                overestimationForKg = 0.01 * 0.20;
                overestimationForKlm = shipmentKg * overestimationForKg;
                totalOverestimation = kilometers * overestimationForKlm;
                price = price + totalOverestimation;
            }

        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", shipmentKg, price);

    }
}
