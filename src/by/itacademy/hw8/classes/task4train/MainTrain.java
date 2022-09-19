package by.itacademy.hw8.classes.task4train;

import java.util.Scanner;

public class MainTrain {
    public static void main(String[] args) {
        Train train1 = new Train("Pinsk", 887, 15.15);
        Train train2 = new Train("Kiev", 128, 10.25);
        Train train3 = new Train("Minsk", 152, 11.25);
        Train train4 = new Train("Pinsk", 825, 15.25);
        Train train5 = new Train("Brest", 109, 19.55);

        System.out.println("Time table before any actions");

        Train[] trains = new Train[5];
        trains[0] = train1;
        trains[1] = train2;
        trains[2] = train3;
        trains[3] = train4;
        trains[4] = train5;
        for (int i = 0; i < trains.length; i++) {
            System.out.println("Train number " + trains[i].getTrainNumber() + "  to " + trains[i].getArrivalPoint()
                    + " at " + trains[i].getStartTime());
        }

        System.out.println("Sorted by train numbers");

        sortByTrainNumber(trains);
        for (int i = 0; i < trains.length; i++) {
            System.out.println("Train number " + trains[i].getTrainNumber() + "  to " + trains[i].getArrivalPoint()
                    + " at " + trains[i].getStartTime());
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the train number");
        int number = scanner.nextInt();
        int x = 0;

        for (int i = 0; i < trains.length; i++) {
            if (number == trains[i].getTrainNumber()) {
                System.out.println("Train number " + trains[i].getTrainNumber() + "  to " + trains[i].getArrivalPoint()
                        + " at " + trains[i].getStartTime());
                x++;
            }
        }
        if (x == 0) {
            System.out.println("Not the right train number");
        }

        System.out.println("Sorted by arrival point and time ");
        sortByArrivalPoint(trains);
        for (int i = 0; i < trains.length; i++) {
            System.out.println("Train number " + trains[i].getTrainNumber() + "  to " + trains[i].getArrivalPoint()
                    + " at " + trains[i].getStartTime());
        }


    }

    private static void sortByTrainNumber(Train[] trains) {
        Train tempTr;
        int min;
        for (int i = 0; i < trains.length - 1; i++) {

            min = i;
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[j].getTrainNumber() < trains[min].getTrainNumber()) {
                    min = j;
                }
            }
            tempTr = trains[i];
            trains[i] = trains[min];
            trains[min] = tempTr;

        }



    }

    public static void sortByArrivalPoint(Train[] trains) {
        int minAr;
        String tempAr;
        Train tempArTr;
        for (
                int i = 0; i < (trains.length - 1); i++) {
            minAr = i;
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[j].getArrivalPoint().compareTo(trains[minAr].getArrivalPoint()) < 0) {
                    minAr = j;
                }

                if ((trains[j].getArrivalPoint().compareTo(trains[minAr].getArrivalPoint()) == 0)) {

                    if ((trains[j].getStartTime() < trains[minAr].getStartTime())) {

                        tempArTr = trains[j];
                        trains[j] = trains[minAr];
                        trains[minAr] = tempArTr;

                    }


                }

            }

            tempArTr = trains[i];
            trains[i] = trains[minAr];
            trains[minAr] = tempArTr;

        }

        }
    }
