package by.itacademy.hw8.classes.task5counter;

public class Counter {
    private int counter;
    private int min;
    private int max;


    public Counter() {
        counter = 0;
        min = 0;
        max = 99;
    }

    public Counter(int counter, int min, int max) {
        this.counter = counter;
        this.min = min;
        this.max = max;
    }

    public boolean addition1() {

        if (counter < max) {
            counter++;
            return true;
        }

        return false;
    }

    public boolean subtraction() {

        if (counter > min) {
            counter--;
            return true;
            }
        return false;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
