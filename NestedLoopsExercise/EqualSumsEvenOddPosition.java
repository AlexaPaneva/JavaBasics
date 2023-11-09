package javaBasics.nestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());


        for (int currentNumber = firstNumber; currentNumber <= secondNumber; currentNumber++) {

            String textNumber = "" + currentNumber;

            int evenDigitSum = 0;
            int oddDigitSum = 0;

            for (int currentDigit = 0; currentDigit < textNumber.length() ; currentDigit++) {

                int digit = Integer.parseInt(textNumber.charAt(currentDigit) + "");

                if (currentDigit % 2 == 0) {
                    evenDigitSum += digit;
                } else {
                    oddDigitSum += digit;
                }

            }

            if (oddDigitSum == evenDigitSum) {
                System.out.print(currentNumber + " ");
            }
            
        }
    }
}
