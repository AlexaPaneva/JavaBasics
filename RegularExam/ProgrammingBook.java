package JavaBasics.RegularExam;

import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Начална сума за отпечатване: 0.01 лв. * 899 стр. + 1 лв.* 2 корици = 10.99 лв.
        //10% намаление:
        // 10.99 - 10% = 9.891 лв. са разходите за отпечатване след намалението
        //Трябва да се заплати на дизайнер -> 20 лв.
        // 9.891 + 20 = 29.891 лв. са разходите с дизайнер
        //Екипът поема 20% от цената на копието
        // 29.891 – 20% = 23.9128 лв. е крайната сума

        double pricePage = Double.parseDouble(scanner.nextLine());
        double priceCover = Double.parseDouble(scanner.nextLine());
        int percentSale = Integer.parseInt(scanner.nextLine());
        double sumForDesigner = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double firstSum = pricePage * 899 + priceCover * 2;
        double secondSum = firstSum - (firstSum * percentSale / 100);
        double thirdSum = secondSum + sumForDesigner;
        double totalSum = thirdSum - (thirdSum * percent/100)  ;

        System.out.printf("Avtonom should pay %.2f BGN.", totalSum);




    }
}
