package javaBasics.conditionalStatments;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ако фигурата е квадрат (square): на следващия ред се чете едно дробно число - дължина на страната му
        //· Ако фигурата е правоъгълник (rectangle): на следващите два реда четат две дробни числа - дължините на страните му
        //· Ако фигурата е кръг (circle): на следващия ред чете едно дробно число - радиусът на кръга
        //· Ако фигурата е триъгълник (triangle): на следващите два реда четат две дробни числа - дължината на страната му и дължината на височината към нея

        String typeFigure = scanner.nextLine();

        double area = 0;
        if (typeFigure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());

            area = side * side;

        } else if (typeFigure.equals("rectangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());

            area = sideA * sideB;

        } else if (typeFigure.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());

            area = Math.PI * radius * radius;

        } else if (typeFigure.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            area = (a * h) / 2;

        }
        System.out.printf("%.3f", area);
    }
}
