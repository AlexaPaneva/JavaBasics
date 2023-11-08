package JavaBasics.preExam;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double maidenPartPrice = Double.parseDouble(scanner.nextLine());
        int loveMessagesCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int keysHoldersCount = Integer.parseInt(scanner.nextLine());
        int caricaturesCount = Integer.parseInt(scanner.nextLine());
        int luckySurpriseCount = Integer.parseInt(scanner.nextLine());



        double loveMessagesPrice = loveMessagesCount * 0.60;
        double rosesPrice = rosesCount * 7.20;
        double keysHoldersPrice = keysHoldersCount * 3.60;
        double caricaturesPrice = caricaturesCount * 18.20;
        double luckySurprisePrice = luckySurpriseCount * 22.0;

        int countOfProducts = loveMessagesCount + rosesCount + keysHoldersCount + caricaturesCount + luckySurpriseCount;
        double totalPrice = loveMessagesPrice + rosesPrice + keysHoldersPrice + caricaturesPrice + luckySurprisePrice;



        if (countOfProducts >= 25) {
            totalPrice = totalPrice - (totalPrice * 0.35);

        }

        totalPrice = totalPrice - (totalPrice * 0.10);

        if (totalPrice >= maidenPartPrice) {
            System.out.printf("Yes! %.2f lv left.", totalPrice - maidenPartPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(maidenPartPrice - totalPrice));
        }


    }
}
