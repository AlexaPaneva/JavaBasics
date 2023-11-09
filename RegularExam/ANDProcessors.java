package javaBasics.regularExam;

import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Планувани: 500 процесора
        //8 служители работят 20 дни по 8 часа  8 * 20 * 8 = 1280 часа общо
        //За това време изработват 1280 / 3 = 426.66  -> закръгляме към по-малкото цяло число и получаваме изработени 426 процесора
        //426 < 500  по-малко от плануваните 500 – 426 = 74 процесора по-малко
        //Загубите са  74 * 110.10 =  8147.40 лв

        int processorsCount = Integer.parseInt(scanner.nextLine());
        int employeesCount = Integer.parseInt(scanner.nextLine());
        int workDays = Integer.parseInt(scanner.nextLine());

        int totalHours = employeesCount * workDays * 8;
        double producedProcessors = Math.floor(totalHours / 3.0);

        double difference = Math.abs(processorsCount - producedProcessors);

        double sum = difference * 110.10;


        if (producedProcessors >= processorsCount) {
            System.out.printf("Profit: -> %.2f BGN", sum);
        } else {
            System.out.printf("Losses: -> %.2f BGN", sum);
        }

    }
}
