package JavaBasics.regularExam;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//•	Закупеното количество храна за кученцето в килограми – цяло число в интервала [1 …100]
//•	На всеки следващ ред до получаване на команда Adopted ще получавате колко грама изяжда кученцето на всяко хранене - цяло число в интервала [10 …1000]

        int dogFoodInKg = Integer.parseInt(scanner.nextLine());
        int totalEaten = 0;

        dogFoodInKg = dogFoodInKg * 1000;

        String input = scanner.nextLine();
        while (!input.equals("Adopted")) {
            int eaten = Integer.parseInt(input);
            totalEaten += eaten;
            input = scanner.nextLine();
        }
        if (dogFoodInKg >=  totalEaten) {
            System.out.printf("Food is enough! Leftovers: %d grams.", dogFoodInKg - totalEaten);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(totalEaten - dogFoodInKg));
        }
    }
}
