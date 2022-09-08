package by.epam.lesson11.task10.main;

import by.epam.lesson11.print.Print;
import by.epam.lesson11.task10.beans.Airline;
import by.epam.lesson11.task10.beans.Airport;
import by.epam.lesson11.task10.enums.AircraftType;
import by.epam.lesson11.task10.enums.DayOfTheWeek;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Airline> airlines = new ArrayList<Airline>();
        Airport airport = new Airport(airlines);

        Airline airline1 = new Airline("Moskow", 340, AircraftType.Airbus_A220,
                LocalTime.of(07, 0, 0), DayOfTheWeek.THURSDAY);
        Airline airline2 = new Airline("Istanbul", 190, AircraftType.Boeing_737NG,
                LocalTime.of(12, 0, 0), DayOfTheWeek.MONDAY);
        Airline airline3 = new Airline("Dubai", 520, AircraftType.Airbus_A220,
                LocalTime.of(05, 15, 0), DayOfTheWeek.SATURDAY);
        Airline airline4 = new Airline("Butumi", 100, AircraftType.Boeing_747,
                LocalTime.of(19, 0, 0), DayOfTheWeek.SUNDAY);
        Airline airline5 = new Airline("Butumi", 790, AircraftType.Boeing_747,
                LocalTime.of(15, 30, 0), DayOfTheWeek.WEDNESDAY);
        Airline airline6 = new Airline("Butumi", 100, AircraftType.Boeing_747,
                LocalTime.of(12, 0, 0), DayOfTheWeek.WEDNESDAY);
        Airline airline7 = new Airline("Butumi", 790, AircraftType.Boeing_747,
                LocalTime.of(9, 30, 0), DayOfTheWeek.WEDNESDAY);
        airlines.add(airline1);
        airlines.add(airline2);
        airlines.add(airline3);
        airlines.add(airline4);
        airlines.add(airline5);
        airlines.add(airline6);
        airlines.add(airline7);

        System.out.println(
                "Please make your choice:\n" +
                        "1. print a list of flights for a given destination\n" +
                        "2. print a list of flights for a given day of the week\n" +
                        "3. a list of flights for a given day of the week( a departure time greater than the given one)\n" +
                        "4. exit: "
        );

        while (true) {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Please, mame your choice again");
            }
            int userChoice = scanner.nextInt();
            if (userChoice == 4) {
                break;
            }
            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Please, make your choice again");
                continue;
            }
            switch (userChoice) {
                case 1:
                    Print.printSomeList(airport.airlinesByDestination(scanner));
                    break;
                case 2:
                    Print.printSomeList(airport.airlinesByTheDayOfWeek(scanner));
                    break;
                case 3:
                    Print.printSomeList(airport.airlinesByTheDayOfWeekAndTime(scanner));
                    break;
            }
        }
    }
}
