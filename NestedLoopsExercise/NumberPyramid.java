package JavaBasics.nestedLoopsExercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int count = 1;
        boolean isEnough = false;

        for (int row = 1; row <= n; row++) {

            for (int i = 1; i <= row; i++) {

                System.out.print(count + " ");

                if (count == n) {
                    isEnough = true;
                    break;

                }
                count++;
            }
            if (isEnough) {
                break;
            }
            System.out.println();
        }


    }
}
