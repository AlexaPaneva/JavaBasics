package JavaBasics.forLoopExercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int tournamentsPoints = 0;
        int winCount = 0;

        for (int i = 0; i < tournaments; i++) {

            String placeInCurrentTournament = scanner.nextLine();

            switch (placeInCurrentTournament) {
                case "W":
                    tournamentsPoints += 2000;
                    winCount++;
                    break;
                case "F":
                    tournamentsPoints += 1200;
                    break;
                case "SF":
                    tournamentsPoints += 720;
                    break;
            }
        }

        int totalPoints = initialPoints + tournamentsPoints;
        double averagePoints = Math.floor(tournamentsPoints * 1.0 / tournaments);
        double percentWinning = winCount * 1.0 / tournaments * 100;

        System.out.printf("Final points: %d\n", totalPoints);
        System.out.printf("Average points: %.0f\n", averagePoints);
        System.out.printf("%.2f%%\n", percentWinning);


    }
}
