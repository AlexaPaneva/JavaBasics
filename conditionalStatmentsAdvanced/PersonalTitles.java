package javaBasics.conditionalStatmentsAdvanced;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (gender.equals("f")) {

            if( age >= 16){
                System.out.println("Ms.");
            } else if( age < 16) {      // else {} -> same thing
                System.out.println("Miss");
            }

            System.out.println();
        }else if (gender.equals("m")) {

            if( age >= 16){
                System.out.println("Mr.");
            } else if( age < 16) {      // else {} -> same thing
                System.out.println("Master");
            }

        }


    }
}
