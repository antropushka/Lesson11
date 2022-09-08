package by.epam.lesson11.task4.train;
//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train.
// добавьте возможность сортировки элементов массива по номерам поездов.
//        Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//        Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
//        быть упорядочены по времени отправления.

import java.util.Scanner;

public class Train {

    private String destination;
    private int trainNumber;
    private String timeOfDeparture;

    public Train(String destination, int trainNumber, String timeOfDeparture) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public static Train findTrainByNumber(Train[] trains) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter train number");
        int num = scanner.nextInt();
        for (int i = 0; i < trains.length; i++) {
            if (num == trains[i].getTrainNumber()) {
                return trains[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Train " +
                "number: " + trainNumber +
                " TO " + destination +
                ", time Of Departure: " + timeOfDeparture;
    }
}
