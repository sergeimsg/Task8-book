package by.itacademy.hw8.classes.task7triangle;

import java.io.Serializable;
import java.util.Objects;

public class Side implements Serializable {
    public static final long serialVersionUID = 1L;
    private TrianglePoint point1;
    private TrianglePoint point2;


    public Side() {
    }

    public Side(TrianglePoint point1, TrianglePoint point2) {
        this.point1 = point1;
        this.point2 = point2;
    }


    public double sideLenth() {

        double x = point1.getX() - point2.getX();
        double y = point1.getY() - point2.getY();
        double sideLenth = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return sideLenth;
    }

    public TrianglePoint getPoint1() {
        return point1;
    }

    public void setPoint1(TrianglePoint point1) {
        this.point1 = point1;
    }

    public TrianglePoint getPoint2() {
        return point2;
    }

    public void setPoint2(TrianglePoint point2) {
        this.point2 = point2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Side)) return false;
        Side side = (Side) o;
        return Objects.equals(getPoint1(), side.getPoint1()) && Objects.equals(getPoint2(), side.getPoint2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoint1(), getPoint2());
    }

    @Override
    public String toString() {
        return "Side{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }
}
