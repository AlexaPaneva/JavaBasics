package JavaBasics.FirstStepsExercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double annualFee = Double.parseDouble(scanner.nextLine());

        //Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //• Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //• Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //• Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double sneakersPrice = annualFee - (annualFee * 0.40);
        double equipPrice = sneakersPrice - (sneakersPrice * 0.20);
        double ballPrice = equipPrice / 4;
        double accessoriesPrice = ballPrice / 5;



        System.out.println(annualFee + sneakersPrice + equipPrice + ballPrice + accessoriesPrice);



    }
}
