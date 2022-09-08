package by.epam.lesson11.task6;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time time = new Time();
        System.out.println("hour: ");
        time.setHour(scanner.nextInt());
        System.out.println("minute: ");
        time.setMinute(scanner.nextInt());
        System.out.println("second: ");
        time.setSecond(scanner.nextInt());
        time.printTime();
        time.addSecond(56);
        time.printTime();
    }
}

