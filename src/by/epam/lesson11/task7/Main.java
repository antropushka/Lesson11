package by.epam.lesson11.task7;


import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point a = new Point();
        Point b = new Point();
        Point c = new Point();

        a.getPointCoordinates(scanner);
        b.getPointCoordinates(scanner);
        c.getPointCoordinates(scanner);

        Triangle triangle = new Triangle(a, b, c);

        System.out.println("perimeter" + triangle.trianglePerimeter());
        System.out.println("square" + triangle.triangleSquare());
        System.out.println("centroid coordinate" + triangle.triangleCentroid());

    }




}
