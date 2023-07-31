package JavaBasics.proverkiExercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double orderPrice = (puzzles * 2.60) + (dolls * 3.00 ) + (teddyBears * 4.10) + (minions * 8.20) + (trucks * 2);

        int toyCounts = puzzles + dolls + teddyBears + minions + trucks;
        if (toyCounts >= 50){
            orderPrice = orderPrice - (orderPrice * 0.25);
        }
        orderPrice = orderPrice - (orderPrice * 0.10);

        if (tripPrice <= orderPrice){
            System.out.printf("Yes! %.2f lv left.", orderPrice - tripPrice);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - orderPrice);

        }
    }
}
