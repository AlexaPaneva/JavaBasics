package JavaBasics.forLoop;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        //всяка позиция от 0 до последната (дължина - 1)
        //повтарям: взимам символа на позицията + проверка
        //начало: 0
        //край: дължина - 1
        //промяна: ++
        int sum = 0; //сума от гласните букви
        for (int position = 0; position <= text.length() - 1; position++) {
            char currentSymbol = text.charAt(position);
            //a, e, i, o, u
            switch (currentSymbol) {
                case 'a':
                    sum = sum + 1;
                    //sum += 1;
                    break;
                case 'e':
                    sum = sum + 2;
                    //sum += 2;
                    break;
                case 'i':
                    sum = sum + 3;
                    //sum += 3;
                    break;
                case 'o':
                    sum = sum + 4;
                    //sum += 4;
                    break;
                case 'u':
                    sum = sum + 5;
                    //sum += 5;
                    break;
            }
        }
        System.out.println(sum);

    }
}
