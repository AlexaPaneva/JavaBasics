package JavaBasics.slojniProverkiExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;
        String oddOrEven = "";
        boolean isSecondNumberZero = false;

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                isSecondNumberZero = true;
            } else {
                result = (num1 * 1.0) / num2;
            }
        } else if (operator.equals("%")){
            if (num2 == 0){
                isSecondNumberZero = true;
            } else {
                result = num1 % num2;
            }
        }
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")){
            if (result % 2 == 0){
                oddOrEven = "even";
            } else {
                oddOrEven = "odd";
            }
        }
        switch (operator){
            case "+":
            case "-":
            case "*":
                System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, result, oddOrEven);
                break;

            case "/":
                if (isSecondNumberZero){
                    System.out.printf("Cannot divide %d by zero", num1);
                } else{
                    System.out.printf("%d / %d = %.2f", num1, num2, result);
                }
                break;

            case "%":
                if (isSecondNumberZero){
                    System.out.printf("Cannot divide %d by zero", num1);
                } else{
                    System.out.printf("%d %s %d = %.0f", num1, operator, num2, result);
                }
                break;
        }
    }
}
