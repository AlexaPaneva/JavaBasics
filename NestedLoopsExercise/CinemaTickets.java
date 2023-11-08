package JavaBasics.nestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String movieName = scanner.nextLine();


//o	Типа на закупения билет - текст ("student", "standard", "kids")
        int student = 0;
        int standard = 0;
        int kids = 0;


        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine()); //int capacity = Integer.parseInt(scanner.nextLine());
            int tickets = 0;

            String ticketsType = scanner.nextLine();
            while (!ticketsType.equals("End")) {

                switch (ticketsType) {
                    case "student":
                        student++;
                        break;

                    case "standard":
                        standard++;
                        break;

                    case "kid":
                        kids++;
                        break;
                }

                tickets++;

                if (tickets == freeSeats) {
                    break;
                }
                ticketsType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.\n", movieName, tickets * 100.0 / freeSeats);
            movieName = scanner.nextLine();
        }

        int totalTickets = student + standard + kids;


        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", student * 100.0 / totalTickets);
        System.out.printf("%.2f%% standard tickets.\n", standard * 100.0 / totalTickets);
        System.out.printf("%.2f%% kids tickets.\n", kids * 100.0 / totalTickets);


    }
}
