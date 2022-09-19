package by.itacademy.hw8.classes.task6time;

public class MainTime {
    public static void main(String[] args) {

        Time time1 = new Time(23, 20, 32);
        changeSec(20, 30, 40, 600);


        changeMin(25, 35, 45, 20);

        changeHour(25, 30, 45, 40);

    }

    public static void changeSec(int hour, int min, int sec, int secN) {
        System.out.println(" hour " + hour + " min " + min + " sec" + sec + "  secN " + secN);
        int currentSec = sec + secN;
        int newSec = currentSec % 60;
        int currentMin = min + currentSec / 60;
        int newMin = currentMin % 60;
        int currentHour = hour + currentMin / 60;
        int newHour = currentHour % 24;

        System.out.println("New time:" + "hour:" + newHour + " min " + newMin + " sec " + newSec);
    }

    public static void changeMin(int hour, int min, int sec, int minN) {
        System.out.println(" hour "+ hour  + " min "+min+" sec" +sec+"  minN "+minN);

        int currentMin = min+minN;
        int newMin=currentMin%60;
        int currentHour=hour+currentMin/60;
        int newHour=currentHour%24;

        System.out.println("New time:" + "hour:" + newHour + " min " + newMin + " sec " + sec);

    }
    public static void changeHour(int hour, int min, int sec, int minH) {
        System.out.println(" hour "+ hour  + " min "+min+" sec" +sec+"  minH "+minH);

        int currentHour=hour+minH;
        int newHour=currentHour%24;

        System.out.println("New time:" + "hour:" + newHour + " min " + min + " sec " + sec);

    }

}
