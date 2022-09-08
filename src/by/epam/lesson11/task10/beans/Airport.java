package by.epam.lesson11.task10.beans;

import by.epam.lesson11.task10.beans.Airline;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airport implements Serializable {

    private ArrayList<Airline> airlines;

    public Airport(ArrayList<Airline> airlines) {
        this.airlines = airlines;
    }

    public Airport() {

    }

    public List<Airline> airlinesByDestination(Scanner scanner) { //        a) список рейсов для заданного пункта назначения;
        List <Airline> airlinesByDestination = new ArrayList<Airline>();
        System.out.println("Enter destination");
        String usersDestination = scanner.nextLine();
        for (int i = 0; i < airlines.size(); i++) {
            if (airlines.get(i).getDestination().equals(usersDestination)) {
                airlinesByDestination.add(airlines.get(i));
            }
        }
        return airlinesByDestination;
    }

    public List<Airline> airlinesByTheDayOfWeek(Scanner scanner) { //        b) список рейсов для заданного дня недели;
        List<Airline> airlinesByTheDayOfWeek = new ArrayList<Airline>();
        System.out.println("Enter the day of week");
        String usersDayOfTheWeek = scanner.nextLine();
        for (int i = 0; i < airlines.size(); i++) {
            if (usersDayOfTheWeek.equals(airlines.get(i).getDayOfTheWeek())) {
                airlinesByTheDayOfWeek.add(airlines.get(i));
            }
        }
        return airlinesByTheDayOfWeek;
    }


    public List<Airline>  airlinesByTheDayOfWeekAndTime(Scanner scanner) { //        c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
        List<Airline> airlinesByTheDayOfWeekAndTime = new ArrayList<Airline>();
        System.out.println("Enter the day of the week and time after which you would like to depart");
        String usersDayOfTheWeek = scanner.nextLine();
        LocalTime usersTime = LocalTime.parse(scanner.nextLine());

        for (int i = 0; i < airlines.size(); i++) {
            if (usersDayOfTheWeek.equals(airlines.get(i).getDayOfTheWeek())) {
                if (airlines.get(i).getDepartureЕime().isAfter(usersTime)) {
                    airlinesByTheDayOfWeekAndTime.add(airlines.get(i));
                }
            }
        }
        return airlinesByTheDayOfWeekAndTime;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airlines=" + airlines +
                '}';
    }
}





