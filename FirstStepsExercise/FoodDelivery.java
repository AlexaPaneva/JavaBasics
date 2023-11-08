package JavaBasics.firstStepsExercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double vegetarianMenuPrice = vegetarianMenu * 8.15;

        double sumMenuPrice = chickenMenuPrice + fishMenuPrice + vegetarianMenuPrice;
        double desertPrice = sumMenuPrice * 0.20;

        double deliveryPrice = 2.50;
    // double totalPrice = sumMenuPrice + desertPrice + deliveryPrice;
        // System.out.println(totalPrice);
        System.out.println(sumMenuPrice + desertPrice + deliveryPrice);



    }
}
