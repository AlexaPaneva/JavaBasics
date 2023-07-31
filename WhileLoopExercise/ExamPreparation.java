package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int failedScoreAvailability = Integer.parseInt(scanner.nextLine());

        int failedTasks = 0;
        int sumOfScores = 0;
        int countOfScores = 0;
        String lastTaskName = "";

        String input = scanner.nextLine();

        while (!input.equals("Enough")) {

            lastTaskName = input;

            int score = Integer.parseInt(scanner.nextLine());
            countOfScores++;
            sumOfScores += score;

            if (score <= 4) {
                failedTasks++;
            }

            if (failedTasks == failedScoreAvailability){
                System.out.printf("You need a break, %d poor grades.", failedTasks);
                break;
            }

            input = scanner.nextLine();
        }

        double averageScore = (sumOfScores * 1.0) / countOfScores;

        if (input.equals("Enough")){
            System.out.printf("Average score: %.2f\n", averageScore);
            System.out.printf("Number of problems: %d\n", countOfScores);
            System.out.printf("Last problem: %s\n", lastTaskName);
        }


    }
}
