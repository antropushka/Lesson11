package by.epam.lesson11.task10.beans;
//Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//        метод toString(). Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//        Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//        методами.
//        Задать критерии выбора данных и вывести эти данные на консоль.
//        Найти и вывести:
//        a) список рейсов для заданного пункта назначения;
//        b) список рейсов для заданного дня недели;
//        c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import by.epam.lesson11.task10.enums.AircraftType;
import by.epam.lesson11.task10.enums.DayOfTheWeek;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

public class Airline implements Serializable {

    private String destination;
    private int flightNumber;
    private AircraftType aircraftType;
    private LocalTime departureTime;
    private DayOfTheWeek dayOfTheWeek;

    public Airline(String destination,
                   int flightNumber,
                   AircraftType aircraftType,
                   LocalTime departureTime,
                   DayOfTheWeek dayOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalTime getDepartureЕime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfTheWeek getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(DayOfTheWeek dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airline)) return false;
        Airline airline = (Airline) o;
        return getFlightNumber() == airline.getFlightNumber() && Objects.equals(getDestination(), airline.getDestination())
                && getAircraftType() == airline.getAircraftType() && Objects.equals(departureTime, airline.departureTime)
                && getDayOfTheWeek() == airline.getDayOfTheWeek();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDestination(), getFlightNumber(), getAircraftType(), departureTime, getDayOfTheWeek());
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType=" + aircraftType +
                ", departureTime='" + departureTime + '\'' +
                ", dayOfTheWeek=" + dayOfTheWeek +
                '}';
    }
}
