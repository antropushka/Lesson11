package by.epam.lesson11.task4.comparator;

import by.epam.lesson11.task4.train.Train;

import java.util.Comparator;

public class ByDestinationAndTimeComparator implements Comparator<Train> {
    @Override
    public int compare(Train train1, Train train2) {
        if (train1.getDestination().equals(train2.getDestination())) {
            return  (train1.getTimeOfDeparture().compareTo(train2.getTimeOfDeparture()));
        }
        return train1.getDestination().compareTo(train2.getDestination());
    }

}
