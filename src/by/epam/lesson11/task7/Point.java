package by.epam.lesson11.task7;

import java.util.Scanner;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }



    public void getPointCoordinates(Scanner scanner) {
        System.out.println("Enter X value");
        x = scanner.nextDouble();
        System.out.println("Enter Y value");
        y = scanner.nextDouble();

    }

    public static double segmentLength(Point a, Point b) {
        double segmentLength = Math.sqrt(((b.getX() - a.getX()) * (b.getX() - a.getX())) +
                ((b.getY() - a.getY()) * (b.getY() - a.getY())));
        return segmentLength;

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
