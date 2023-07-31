package JavaBasics.slojniProverkiExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String mouth = scanner.nextLine();
        int overnightStays = Integer.parseInt(scanner.nextLine());

        //Май и октомври      Юни и септември                 Юли и август
        //Студио – 50 лв./      нощувка Студио – 75.20 лв./    нощувка Студио – 76 лв./нощувка
        //Апартамент – 65 лв.   /нощувка Апартамент – 68.70 лв.  /нощувка Апартамент – 77 лв./нощувка
        double priceInStudio = 0;
        double priceInApartment = 0;
        //studio
        switch (mouth) {
            case "May":
            case "October":
                priceInStudio = overnightStays * 50.0;
                break;

            case "June":
            case "September":
                priceInStudio = overnightStays * 75.20;
                break;

            case "July":
            case "August":
                priceInStudio = overnightStays * 76.0;
                break;

        }
        if (overnightStays > 7 && overnightStays < 14 && (mouth.equals("May") || mouth.equals("October"))) {
            priceInStudio = priceInStudio - (priceInStudio * 0.05);
        } else if (overnightStays > 14 && mouth.equals("May") || mouth.equals("October")){
            priceInStudio = priceInStudio - (priceInStudio * 0.30);
        }
        if (overnightStays > 14 && mouth.equals("June") || mouth.equals("September")) {
            priceInStudio = priceInStudio - (priceInStudio * 0.20);
        }

        //apartment
        switch (mouth) {
            case "May":
            case "October":
                priceInApartment = overnightStays * 65.0;
                break;

            case "June":
            case "September":
                priceInApartment = overnightStays * 68.70;
                break;

            case "July":
            case "August":
                priceInApartment = overnightStays * 77.0;
                break;
        }
        if (overnightStays > 14) {
            priceInApartment = priceInApartment - (priceInApartment * 0.10);
        }
        System.out.printf("Apartment: %.2f lv. %n", priceInApartment);
        System.out.printf("Studio: %.2f lv.", priceInStudio);
    }
}
