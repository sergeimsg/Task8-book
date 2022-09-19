package by.itacademy.hw8.classes.task3student;

public class MainSt {
    public static void main(String[] args) {

        Student st1 = new Student("МельникС.Г.", 100, new int[]{10, 10, 6, 8, 9});
        Student st2 = new Student("Иванов В.В.", 122, new int[]{10, 9, 10, 10, 9});
        Student st3 = new Student("Петров В.В.", 124, new int[]{8, 9, 10, 10, 9});
        Student st4 = new Student("Сидоров В.В.", 122, new int[]{8, 9, 10, 10, 10});
        Student st5 = new Student("Васечкина В.В.", 124, new int[]{8, 9, 5, 6, 9});
        Student st6 = new Student("Сыроежкин В.В.", 110, new int[]{8, 9, 10, 10, 9});
        Student st7 = new Student("Дроздов В.В.", 121, new int[]{8, 9, 10, 8, 9});
        Student st8 = new Student("Сорока В.В.", 125, new int[]{8, 9, 10, 7, 9});
        Student st9 = new Student("Гузик В.В.", 126, new int[]{9, 9, 10, 10, 9});
        Student st10 = new Student("Иванов В.В.", 127, new int[]{8, 9, 10, 10, 9});
        Student[] listSt = new Student[10];
        listSt[0]=st1;
        listSt[1]=st2;
        listSt[2]=st3;
        listSt[3]=st4;
        listSt[4]=st5;
        listSt[5]=st6;
        listSt[6]=st7;
        listSt[7]=st8;
        listSt[8]=st9;
        listSt[9]=st10;

        // two version of displaying
        System.out.println("Through method in student");

        for (int i = 0; i < listSt.length; i++) {
            listSt[i].display10();
        }

        System.out.println("through mix");
        for (int i = 0; i < listSt.length; i++) {

            if (listSt[i].displayHighMarks())
                System.out.println("student - " + listSt[i].getFIO() + " group number" + listSt[i].getGroupNumber());
        }
    }
}
