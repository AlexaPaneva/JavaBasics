package JavaBasics.ForLoopL;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int position = 0; position <= text.length() - 1; position ++) {
            System.out.println(text.charAt(position));

        }
    }
}
