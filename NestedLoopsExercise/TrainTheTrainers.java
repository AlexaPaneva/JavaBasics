package JavaBasics.NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int presentationCount = 0;
        double totalGradeSum = 0.00;

        String presentationName = scanner.nextLine();
        while (!presentationName.equals("Finish")) {

            presentationCount++;

            double currentPresentationGrades = 0.00;
            for (int i = 0; i < n; i++) {
                double currentJudgeAssessment = Double.parseDouble(scanner.nextLine());
                currentPresentationGrades += currentJudgeAssessment;
                totalGradeSum += currentJudgeAssessment;
            }

            double averagePresentationGrade = currentPresentationGrades / n;

            System.out.printf("%s - %.2f.\n", presentationName, averagePresentationGrade);

            presentationName = scanner.nextLine();
        }

        double averageGrade = totalGradeSum / (presentationCount * n);
        System.out.printf("Student's final assessment is %.2f.", averageGrade);

    }
}
