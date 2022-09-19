

package by.itacademy.hw8.classes.task3student;


import java.io.Serializable;

public class Student implements Serializable {
    private String FIO;
    private int groupNumber;
    private int[] point = new int[5];
    private final static int HIGH_MARK9 = 9;
    private final static int HIGH_MARK10 = 10;


    public Student() {
    }

    public Student(String FIO, int groupNumber, int[] point) {
        this.FIO = FIO;
        this.groupNumber = groupNumber;
        this.point = point;

    }

    public boolean displayHighMarks() {
        for (int mark : point) {
            if (mark < HIGH_MARK9) {
                return false;
            }
        }
        return true;
    }

    public void display10() {
        int x = 0;
        for (int i = 0; i < point.length; i++) {

            if (point[i] == HIGH_MARK9 || point[i] == HIGH_MARK10) {
                x++;
            }
        }
        if (x == 5) {
            System.out.println("student - " + getFIO() + "group number" + getGroupNumber());

        }


    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getPoint() {
        return point;
    }

    public void setPoint(int[] point) {
        this.point = point;
    }
}
