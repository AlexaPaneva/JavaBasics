package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int totalCakePieces = width * length;

        String input = scanner.nextLine();
        while (!input.equals("STOP")) {

            int currentCakePieces = Integer.parseInt(input);
            totalCakePieces -= currentCakePieces;

            if (totalCakePieces <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalCakePieces));
                break;
            }

        input = scanner.nextLine();
        }
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", totalCakePieces);
        }
    }
}
