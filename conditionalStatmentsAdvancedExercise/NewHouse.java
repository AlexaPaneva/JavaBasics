package javaBasics.conditionalStatmentsAdvancedExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flowersTypes= scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;
//Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
//· Ако Нели купи повече от 90 Далии - 15% отстъпка от крайната цена
//· Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
//· Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
//· Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
        switch (flowersTypes) {
            case "Roses":
                price = flowersCount * 5.00;
                if (flowersCount > 80){
                    price = price - (price * 0.10);
                }
                break;
            case "Dahlias":
                price = flowersCount * 3.80;
                if (flowersCount > 90){
                    price = price - (price * 0.15);
                }
                break;
            case "Tulips":
                price = flowersCount * 2.80;
                if (flowersCount > 80){
                    price = price - (price * 0.15);
                }
                break;
            case "Narcissus":
                price = flowersCount * 3.00;
                if (flowersCount < 120){
                    price = price + (price * 0.15);
                }
                break;
            case "Gladiolus":
                price = flowersCount * 2.50;
                if (flowersCount < 80){
                    price = price + (price * 0.20);
                }
                break;
        }
        if (price <= budget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowersTypes, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}
