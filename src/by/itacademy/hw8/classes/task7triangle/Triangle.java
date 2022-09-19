package by.itacademy.hw8.classes.task7triangle;

public class Triangle {
    private final TrianglePoint a;
    private final TrianglePoint b;
    private final TrianglePoint c;

//        Side ab = new Side(a, b);
//        Side ac = new Side(a, c);
//        Side bc = new Side(b, c);

    Side ab;
    Side ac;
    Side bc;

    public Triangle(TrianglePoint a, TrianglePoint b, TrianglePoint c) {
        this.a = a;
        this.b = b;
        this.c = c;
        ab = new Side(a, b);
        ac = new Side(a, c);
        bc = new Side(b, c);


    }


    double perimeter() {

        double perimeter = ab.sideLenth() + ac.sideLenth() + bc.sideLenth();

        return perimeter;
    }

    double area() {
        double area;
        double halfPer = perimeter()/2;
        area = Math.sqrt(halfPer*(halfPer- ab.sideLenth())*(halfPer- ac.sideLenth())*(halfPer- bc.sideLenth()));

        return area;
    }

    //System.out.printf("abb %.2f", perimeter);

//        public static void area ( int a, int b){
//            double areaT = Math.pow(a, 2) + Math.pow(b, 2);
//            System.out.println("area = " + areaT);
//
//        }
//
//        public static void perimetr ( int a, int b, int c){
//            double perimetrT = a + b + c;
//            System.out.println("perimetr = " + perimetrT);
//
//        }
//
//        public static void mediana ( int a, int b, int c){
//            double mA = Math.sqrt((2 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - Math.pow(a, 2) / 4));
//            System.out.println("mediana for a = " + mA);
//        }


//    public static void area() {
//        area = Math.sqrt(abSide);
//        // return area;
//    }
}
