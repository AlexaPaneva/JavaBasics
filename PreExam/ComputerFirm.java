package JavaBasics.preExam;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalSales = 0;
        double totalRating = 0;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            int rating = input % 10;
            int sales = input / 10;

            double commission = 0;
            switch (rating) {
                case 3:
                    commission = 0.5;
                    break;
                case 4:
                    commission = 0.7;
                    break;
                case 5:
                    commission = 0.85;
                    break;
                case 6:
                    commission = 1.0;
                    break;
            }

            double madeSales = sales * commission;
            totalSales += madeSales;
            totalRating += rating;
        }

        double averageRating = totalRating / n;
        System.out.printf("%.2f%n", totalSales);
        System.out.printf("%.2f", averageRating);
    }
}


