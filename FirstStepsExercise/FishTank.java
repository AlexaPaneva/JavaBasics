package JavaBasics.FirstStepsExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Дължина в см – цяло число в интервала [10 … 500]
        //2. Широчина в см – цяло число в интервала [10 … 300]
        //3. Височина в см – цяло число в интервала [10… 200]
        //4. Процент – реално число в интервала [0.000 … 100.000]

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeInCm = length * width * height;
        double volumeInLiters = volumeInCm / 1000;

        volumeInLiters = volumeInLiters - (volumeInLiters * (percent / 100));

        System.out.println(volumeInLiters);





    }
}
