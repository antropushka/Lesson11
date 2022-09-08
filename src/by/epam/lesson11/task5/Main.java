package by.epam.lesson11.task5;

public class Main {
    public static void main (String[] args) {
        Counter counter = new Counter(0, 10, 3);
        Counter counter2 = new Counter(1, 20, 45);
        Counter counter3 = new Counter(50,5,1);
        System.out.println("counter: " + counter.getCurrentValue() + "\n"
                + "counter2: " + counter2.getCurrentValue() + "\n"
                + "counter3: " + counter3.getMaxValue() + "\n" );




    }
}
