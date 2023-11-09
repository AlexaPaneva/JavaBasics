package javaBasics.forLoopExercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int browsersTabsCount = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < browsersTabsCount; i++) {

            String browsersTabName = scanner.nextLine();

            switch (browsersTabName) {

                case "Facebook":
                    salary -= 150;
                    break;

                case "Instagram":
                    salary -= 100;
                    break;

                case "Reddit":
                    salary -= 50;
                    break;


            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }

        }
        if (salary > 0) {
            System.out.println(salary);
        }

    }
}
