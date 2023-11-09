package javaBasics.conditionalStatmentsAdvancedExercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Първи ред - дни за престой - цяло число в интервала [0...365]
        //· Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
        //· Трети ред - оценка - "positive" или "negative"

        int spentDay = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.next();

        double price = 0;
        double totalPrice = 0;

        switch (roomType){
            case "room for one person":
                price = (spentDay - 1) * 18.00;
                break;
            case "apartment":
                price = (spentDay - 1) * 25.00;
                break;
            case "president apartment":
                price = (spentDay - 1) * 35.00;
                break;
        }
        //discount for apartment
        if(spentDay < 10 && roomType.equals("apartment")){
            price = price - (price * 0.30);
        } else if (spentDay > 10 && spentDay < 15 && roomType.equals("apartment")){
            price = price - (price * 0.35);
        } else if (spentDay > 15 && roomType.equals("apartment")){
            price = price - (price * 0.50);
        }
        //discount for president apartment
        if (spentDay < 10 && roomType.equals("president apartment")){
            price = price - (price * 0.10);
        } else if (spentDay > 10 && spentDay < 15 && roomType.equals("president apartment")){
            price = price - (price * 0.15);
        } else if (spentDay > 15 && roomType.equals("president apartment")){
            price = price - (price * 0.20);
        }

        if (rating.equals("positive")){
            totalPrice = price + (price * 0.25);
        } else if (rating.equals("negative")){
            totalPrice = price - (price * 0.10);
        }
        System.out.printf("%.2f", totalPrice);
    }
}
