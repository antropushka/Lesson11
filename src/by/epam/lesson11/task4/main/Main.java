package by.epam.lesson11.task4.main;

import by.epam.lesson11.task4.comparator.ByDestinationAndTimeComparator;
import by.epam.lesson11.task4.comparator.ByTrainNumberComparator;
import by.epam.lesson11.task4.train.Train;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Train[] trains = new Train[5];
        trains[0] = new Train("Minsk", 710, "07:08");
        trains[1] = new Train("Minsk", 860, "05:12");
        trains[2] = new Train("Gomel", 500, "23:00");
        trains[3] = new Train("Grodno", 690, "07:20");
        trains[4] = new Train("Brest", 150, "07:40");

        System.out.println("Please make a choice"+
                    "1. sort by train number" + "\n" +
                    "2. print information about the train by number" + "\n" +
                    "3. sort by destination" + "\n" +
                    "0. exit" + "\n");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Please, mame your choice again");
        }

        switch (userChoice) {
            case 1:
                Arrays.sort(trains, new ByTrainNumberComparator());
                System.out.println(Arrays.toString(trains));
                break;
            case 2:
                Train.findTrainByNumber(trains);
                break;
            case 3:
                Arrays.sort(trains, new ByDestinationAndTimeComparator());
                System.out.println(Arrays.toString(trains));
                break;
            case 0:
                System.out.println("GOOD BUY!");
                break;
            default:
                System.out.println("Invalid choice. Please, mame your choice again");
                while (!scanner.hasNextInt()) {
                    scanner.nextLine();
                    System.out.println("Please, mame your choice again");
                }
                break;
        }
    }
}

