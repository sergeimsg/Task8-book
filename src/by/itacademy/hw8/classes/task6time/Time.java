package by.itacademy.hw8.classes.task6time;

import java.io.Serializable;
import java.util.Objects;

public class Time implements Serializable {

    public static final long serialVersionUID = 1;

   private int hour;
    private int minut;
    private int sec;

    public Time() {
    }

    public Time(int hour, int minut, int sec) {
        if (hour > 24 || hour < 0) {
            hour = 0;
        }
        if (minut > 60 || minut < 0) {
            minut = 0;
        }
        if (sec > 60 || sec < 0) {
            sec = 0;
        }


        this.hour = hour;
        this.minut = minut;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 24 || hour < 0) {
            hour = 0;
        }
        this.hour = hour;
    }

    public int getMinut() {
        return minut;
    }

    public void setMinut(int minut) {
        if (minut < 0) {
            minut = 0;
        }
        this.minut = minut;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (sec < 0) {
            sec = 0;
        }
        this.sec = sec;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Time)) return false;
        Time time = (Time) o;
        return getHour() == time.getHour() && getMinut() == time.getMinut() && getSec() == time.getSec();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHour(), getMinut(), getSec());
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minut=" + minut +
                ", sec=" + sec +
                '}';
    }
}
