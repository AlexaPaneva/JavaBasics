package JavaBasics.forLoopExercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());

        int groupOne = 0;
        int groupTwo = 0;
        int groupThree = 0;
        int groupFour = 0;
        int groupFive = 0;

        int totalPeople = 0;

        for (int currentGroup = 0; currentGroup < groupsCount; currentGroup++) {
             int membersInTheGroup = Integer.parseInt(scanner.nextLine());

              totalPeople += membersInTheGroup;

              if (membersInTheGroup <= 5) {
                  groupOne += membersInTheGroup;
              } else if (membersInTheGroup <= 12) {
                  groupTwo += membersInTheGroup;
              } else if (membersInTheGroup <= 25) {
                  groupThree += membersInTheGroup;
              } else if (membersInTheGroup <= 40) {
                  groupFour += membersInTheGroup;
              } else {
                  groupFive += membersInTheGroup;
              }

        }
        System.out.printf("%.02f%%%n", groupOne * 1.0 / totalPeople * 100);
        System.out.printf("%.02f%%%n", groupTwo * 1.0 / totalPeople * 100);
        System.out.printf("%.02f%%%n", groupThree * 1.0 / totalPeople * 100);
        System.out.printf("%.02f%%%n", groupFour * 1.0 / totalPeople * 100);
        System.out.printf("%.02f%%%n", groupFive * 1.0 / totalPeople * 100);

    }
}
