package JavaBasics.RegularExam;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String typeSouvenirs = scanner.nextLine();
        int souvenirsCount = Integer.parseInt(scanner.nextLine());


        double price = 0;

        if (team.equals("Argentina")) {
            if (typeSouvenirs.equals("flags")) {
                price = 3.25;
            }
            if (typeSouvenirs.equals("caps")) {
                price = 7.20;
            }
            if (typeSouvenirs.equals("posters")) {
                price = 5.10;
            }
            if (typeSouvenirs.equals("stickers")) {
                price = 1.25;
            }

        }

        if (team.equals("Brazil")) {
            if (typeSouvenirs.equals("flags")) {
                price = 4.20;
            }
            if (typeSouvenirs.equals("caps")) {
                price = 8.50;
            }
            if (typeSouvenirs.equals("posters")) {
                price = 5.35;
            }
            if (typeSouvenirs.equals("stickers")) {
                price = 1.20;
            }

        }
        if (team.equals("Croatia")) {
            if (typeSouvenirs.equals("flags")) {
                price = 2.75;
            }
            if (typeSouvenirs.equals("caps")) {
                price = 6.90;
            }
            if (typeSouvenirs.equals("posters")) {
                price = 4.95;
            }
            if (typeSouvenirs.equals("stickers")) {
                price = 1.10;
            }

        }
        if (team.equals("Denmark")) {
            if (typeSouvenirs.equals("flags")) {
                price = 3.10;
            }
            if (typeSouvenirs.equals("caps")) {
                price = 6.50;
            }
            if (typeSouvenirs.equals("posters")) {
                price = 4.80;
            }
            if (typeSouvenirs.equals("stickers")) {
                price = 0.90;
            }

        }


       double totalPrice = souvenirsCount * price;

        if (!team.equals("Argentina") && !team.equals("Brazil") && !team.equals("Croatia") && !team.equals("Denmark")) {
            System.out.println("Invalid country!");
        } else if (!typeSouvenirs.equals("flags") && !typeSouvenirs.equals("caps") && !typeSouvenirs.equals("posters")  && !typeSouvenirs.equals("stickers")) {
            System.out.println("Invalid stock!");
        } else {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirsCount, typeSouvenirs, team, totalPrice);
        }
    }
}
