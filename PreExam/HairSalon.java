package JavaBasics.PreExam;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int goalForTheDay = Integer.parseInt(scanner.nextLine());
        int gain = 0;
        boolean isClosed = false;


        while (!isClosed && gain < goalForTheDay) {
            String input = scanner.nextLine();
            switch (input) {
                case "haircut":
                    String haircutType = scanner.nextLine();
                    switch (haircutType) {
                        case "mens":
                            gain += 15;
                            break;

                        case "ladies":
                            gain += 20;
                            break;

                        case "kids":
                            gain += 10;
                            break;
                    }
                    break;
                case "color":
                    String colorType = scanner.nextLine();
                    switch (colorType) {
                        case "touch up":
                            gain += 20;
                            break;

                        case "full color":
                            gain += 30;
                            break;
                    }
                    break;

                case "closed":
                    isClosed = true;
                    break;
            }
        }
        if (gain >= goalForTheDay) {
            System.out.println("You have reached your target for the day!");
        } else {
            System.out.printf("Target not reached! You need %.0flv. more.%n", (goalForTheDay - gain) * 1.0);
        }
        System.out.printf("Earned money: %.0flv.", gain * 1.0);
    }
}
