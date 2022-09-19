package by.itacademy.hw8.classes.task4train;

import java.util.Objects;

public class Train {
    private String arrivalPoint;
    private int trainNumber;
    private double startTime;

    public Train() {
    }

    public Train(String arrivalPoint, int trainNumber, double startTime) {
        this.arrivalPoint = arrivalPoint;
        this.trainNumber = trainNumber;
        this.startTime = startTime;
    }



    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
        return getTrainNumber() == train.getTrainNumber() && Double.compare(train.getStartTime(), getStartTime()) == 0 && Objects.equals(getArrivalPoint(), train.getArrivalPoint());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArrivalPoint(), getTrainNumber(), getStartTime());
    }

    @Override
    public String toString() {
        return "Train{" +
                "arrivalPoint='" + arrivalPoint + '\'' +
                ", trainNumber=" + trainNumber +
                ", startTime=" + startTime +
                '}';
    }
}
