package JavaBasics.conditionalStatmentsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHours = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = (examHours * 60) + examMinutes;
        int arrivalTimeInMinutes = (arrivalHours * 60) + arrivalMinutes;

        int diff = Math.abs(examTimeInMinutes - arrivalTimeInMinutes);

        if (examTimeInMinutes < arrivalTimeInMinutes){
            System.out.println("Late");
            int hour = diff / 60;
            int min = diff % 60;
            if (diff < 60){
                System.out.printf("%d minutes after the start", min);
            } else {
                System.out.printf("%d:%02d hours after the start", hour, min);
            }
        }
        if (examTimeInMinutes >= arrivalTimeInMinutes && diff <=30){
            if (examTimeInMinutes == arrivalTimeInMinutes){
                System.out.println("On Time");
            } else {
                System.out.println("On Time");
                System.out.printf("%d minutes before the start", diff);
            }
        }
        if (examTimeInMinutes > arrivalTimeInMinutes && diff > 30){
            System.out.println("Early");
            int hour = diff / 60;
            int min = diff % 60;
            if (diff < 60){
                System.out.printf("%d minutes before the start", min);
            } else {
                System.out.printf("%d:%02d hours before the start", hour, min);
            }
        }

    }
}
