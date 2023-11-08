package JavaBasics.conditionalStatmentsAdvancedExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        double totalIncome = 0;
        int totalSeats = rows * cols;

        switch (projection)
        {
            case "Premiere":
                totalIncome = totalSeats * 12.00;
                break;
            case "Normal":
                totalIncome = totalSeats * 7.50;
                break;
            case "Discount":
                totalIncome = totalSeats * 5.00;
                break;
        }
        System.out.printf("%.2f leva " , totalIncome);
    }
}
