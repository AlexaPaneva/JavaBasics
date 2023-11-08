package JavaBasics.firstSteps;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        double sumAfterDogFood = dogFood * 2.50;

        int catFood = Integer.parseInt(scanner.nextLine());
        double sumAfterCatFood = catFood * 4;

        double sumAll = sumAfterDogFood + sumAfterCatFood;

        System.out.printf("Final price is:  %f  lv.", sumAll);

    }
}
