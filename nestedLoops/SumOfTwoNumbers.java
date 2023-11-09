package javaBasics.nestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int countCombination = 0;

        boolean validCombination = false;

        for (int i = firstNumber; i <= secondNumber; i++) {
            for (int j = firstNumber; j <= secondNumber; j++) {
                countCombination++;
                int sum = i + j;

                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", countCombination, i, j, magicNumber);
                   validCombination = true;
                    break;
                }

            }
            if (validCombination) {
                break;
            }
        }
        if (!validCombination){
            System.out.printf("%d combinations - neither equals %d%n", countCombination, magicNumber);
        }
    }
}
