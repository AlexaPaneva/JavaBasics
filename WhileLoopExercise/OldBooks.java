package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String theBookOfAnnie = scanner.nextLine();

        boolean isFound = false;
        int checkedBooks = 0;

        String input = scanner.nextLine();
        while (!input.equals("No More Books")) {

            if (input.equals(theBookOfAnnie)) {
                isFound = true;
                break;
            }
            checkedBooks ++;

            input = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", checkedBooks);
        } else {
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.", checkedBooks);
        }
    }
}

