package by.epam.lesson11.task7;
//Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//        площади, периметра и точки пересечения медиан.


public class Triangle {

   private Point a;
   private Point b;
   private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double trianglePerimeter() {
        double ab = Point.segmentLength(a, b);
        double bc = Point.segmentLength(b, c);
        double ac = Point.segmentLength(a, c);
        return ab + bc + ac;
    }

    public double triangleSquare() {
        double ab = Point.segmentLength(a, b);
        double bc = Point.segmentLength(b, c);
        double ac = Point.segmentLength(a, c);
        double p = trianglePerimeter() / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));

    }

    public Point triangleCentroid() {
        return new Point(((a.getX() + b.getX() + c.getX())) / 3, ((a.getY() + b.getY()+ c.getY())) / 3);
    }

}
