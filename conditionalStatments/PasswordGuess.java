package javaBasics.conditionalStatments;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String passwordGuess = scanner.nextLine();

        if (passwordGuess.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }

    }
}
