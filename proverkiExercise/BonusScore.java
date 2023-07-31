package JavaBasics.proverkiExercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ако числото е до 100 включително, бонус точките са 5.
        //· Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        //· Ако числото е по-голямо от 1000, бонус точките са 10% от числото.

        int number = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;


        if (number <= 100){
           bonusPoints = 5;
        } else if( number <= 1000){
            bonusPoints = number * 0.20;
        } else {
            bonusPoints = number * 0.10;
        }
        if( number % 2 ==0 ){
            bonusPoints = bonusPoints + 1;
        }
        if ( number % 10 == 5){
            bonusPoints = bonusPoints + 2;
        }
        System.out.println(bonusPoints);
        System.out.println(number + bonusPoints);
    }
}
