package JavaBasics.whileLoopL;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double sum = 0;
        int year = 1;
        int poorGradeCount = 0;
        while (year <= 12) {
            if (poorGradeCount > 1) {
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4) {
                poorGradeCount++;
                continue;
            }

            sum = sum + currentGrade;

            year++;
        }

        if (poorGradeCount > 1) {
            System.out.printf("%s has been excluded at %d grade%n", name, year);
        } else {
            double avgGrade = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f%n", name, avgGrade);
        }

    }
}
