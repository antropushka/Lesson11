package by.epam.lesson11.task5;
//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на
//        единицу в заданном диапазоне.
//        Предусмотрите инициализацию счетчика значениями по умолчанию и
//        произвольными значениями.
//        Счетчик имеет методы увеличения и уменьшения состояния, и метод
//        позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class Counter {

    private int minValue;
    private int maxValue;
    private int currentValue;

    public Counter(int minValue, int maxValue, int currentValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.currentValue = currentValue;

        if (minValue > maxValue) {
            int temp = maxValue;
            maxValue = minValue;
            minValue = temp;
        }
        if (currentValue < minValue) {
            currentValue = minValue;
        }
        if (currentValue > maxValue) {
            currentValue = maxValue;
        }
    }

    public Counter() {
        this(0,100,0);
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int increaseValue() {
        currentValue++;
        if (currentValue > maxValue) {
            currentValue = minValue;
        }
        return currentValue;
    }
    public int reduceValue() {
        currentValue--;
        if (currentValue < minValue) {
            currentValue = maxValue;
        }
        return currentValue;
    }

}
