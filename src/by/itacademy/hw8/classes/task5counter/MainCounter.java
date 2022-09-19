package by.itacademy.hw8.classes.task5counter;

import java.util.Random;
import java.util.Scanner;

public class MainCounter {
    public static void main(String[] args) {

        System.out.println("By default initialization");
        Counter counter1 = new Counter();
        while (counter1.addition1())
        {
        System.out.printf("  %d",counter1.getCounter());
        }
        System.out.println();
        while (counter1.subtraction())
        {
            System.out.printf(" %d", counter1.getCounter());
        }

        Random random = new Random();
        int min =  random.nextInt(100);
        int max = random.nextInt(100);
        int counter = random.nextInt(100);
        if (min>max) {
            int x = max;
            max = min;
            min = x;
        }
        System.out.println();
        System.out.println("Random parameters "+ ": counter "+ counter+ "; min = " + min + "; max = " + max);
        Counter counter2 = new Counter(counter,min,max);
        while (counter2.addition1()) {
            System.out.printf(" %d", counter2.getCounter());
        }
        System.out.println();
        while (counter2.subtraction()) {
            System.out.printf(" %d", counter2.getCounter());
        }
        }


    }

