package by.epam.lesson11.task6;
//Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//        изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//        недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное
//        количество часов, минут и секунд.

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public Time() {
        this(0,0,0);
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    public void setHour(int hour_) {
       if (hour_ < 0 || hour_ > 23) {
           hour = 0;
       } else {
           hour = hour_;
       }
    }

    public void setMinute(int minute_) {
       if (minute_ < 0 || minute_ > 59) {
           minute = 0;
       } else {
           minute = minute_;
       }
    }

    public void setSecond(int second_) {
        if (second_ < 0 || second_ > 59) {
            second = 0;
        } else {
            second= second_;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void printTime() {
        System.out.println(toString());

    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void addSecond(int second_) {
        second += second_;
        minute += second / 60;
        second = second % 60;
        hour += minute / 60;
        minute = minute % 60;
        hour = hour % 24;

    }

    public void addMinute(int minute_) {
        addSecond(minute_ * 60);
    }

    public void addHour(int hour_) {
        addSecond(hour_ * 3600);

    }

}
