package JavaBasics.ForLoopL;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int countNumber = Integer.parseInt(scanner.nextLine());
        
        int sum = 0;

        for (int number = 1; number <= countNumber ; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum = sum + value;
        }
        System.out.println(sum);
    }
}
