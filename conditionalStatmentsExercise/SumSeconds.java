package JavaBasics.conditionalStatmentsExercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstPlayerSecond = Integer.parseInt(scanner.nextLine());
        int secondPlayerSecond = Integer.parseInt(scanner.nextLine());
        int thirdPlayerSecond = Integer.parseInt(scanner.nextLine());

        int totalSecond = firstPlayerSecond + secondPlayerSecond + thirdPlayerSecond;

        int minutes = totalSecond / 60;
        int seconds = totalSecond % 60;

        if (seconds < 10){
            System.out.printf("%d:0%d", minutes, seconds);
        }else{
            System.out.printf("%d:%d", minutes, seconds);
        }

    }
}
