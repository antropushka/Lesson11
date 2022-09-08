package by.epam.lesson11.task4.comparator;

import by.epam.lesson11.task4.train.Train;

import java.util.Comparator;

public class ByTrainNumberComparator implements Comparator<Train> {
    @Override
    public int compare(Train train1, Train train2) {
        if (train1.getTrainNumber() > train2.getTrainNumber()) {
            return 1;
        }
        if (train1.getTrainNumber() == train2.getTrainNumber()) {
            return 0;

        }
        return -1;
    }
}
