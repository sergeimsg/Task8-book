package by.itacademy.hw8.classes.task7triangle;

public class MainTr {
    public static void main(String[] args) {


        TrianglePoint a = new TrianglePoint(0, 3);
        TrianglePoint b = new TrianglePoint(4, 0);
        TrianglePoint c = new TrianglePoint(5, 10);

        Triangle abc = new Triangle(a,b,c);
        System.out.printf("AB = %.2f  AC = %.2f BC = %.2f", abc.ab.sideLenth(), abc.ac.sideLenth(),
                abc.bc.sideLenth());

        System.out.println();
        System.out.printf("Perimeter %.2f",abc.perimeter());
        System.out.println();
        System.out.printf("Area = %.2f", abc.area());
    }
}
