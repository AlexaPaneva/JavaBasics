package javaBasics.conditionalStatmentsAdvanced;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        double result = 0;

        if (town.equals("Sofia")) {

            if(product.equals("coffee")){
                price = 0.5;
            } else if(product.equals("water")){
                price = 0.8;
            } else if (product.equals("beer")){
                price = 1.2;
            } else if (product.equals("sweets")){
                price = 1.45;
            } else if (product.equals("peanuts")){
                price = 1.60;
            }

        } else if (town.equals("Plovdiv")) {

            if(product.equals("coffee")){
                price = 0.4;
            } else if(product.equals("water")){
                price = 0.7;
            } else if (product.equals("beer")){
                price = 1.15;
            } else if (product.equals("sweets")){
                price = 1.30;
            } else if (product.equals("peanuts")){
                price = 1.50;
            }
        } else if (town.equals("Varna")) {

            if(product.equals("coffee")){
                price = 0.45;
            } else if(product.equals("water")){
                price = 0.70;
            } else if (product.equals("beer")){
                price = 1.10;
            } else if (product.equals("sweets")){
                price = 1.35;
            } else if (product.equals("peanuts")){
                price = 1.55;
            }
        }
              result = price * quantity;
        System.out.println(result);
    }
}
