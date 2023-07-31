package JavaBasics.whileLoopL;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            int currentNumber = Integer.parseInt(input);

            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }

            input = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
