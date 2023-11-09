package javaBasics.firstSteps;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int count = hours * 3;


        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, count, hours);


    }
}
