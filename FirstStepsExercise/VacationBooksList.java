package javaBasics.firstStepsExercise;

import java.util.Scanner;

public class VacationBooksList {

    public static void main(String[] args) {

        //1. Брой страници в текущата книга – цяло число в интервала [1…1000]
        //
        //2. Страници, които прочита за 1 час – цяло число в интервала [1…1000]
        //
        //3. Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]

        Scanner scanner = new Scanner(System.in);

        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalHours = pagesInBook / pagesPerHour;
        int hoursPerDay = totalHours / days;

        System.out.println(hoursPerDay);
    }
}
