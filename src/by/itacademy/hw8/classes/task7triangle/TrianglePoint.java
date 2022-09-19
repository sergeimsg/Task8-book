package by.itacademy.hw8.classes.task7triangle;

import java.util.Objects;

public class TrianglePoint {
    private int x;
    private int y;

    public TrianglePoint() {
    }

    public TrianglePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TrianglePoint)) return false;
        TrianglePoint that = (TrianglePoint) o;
        return getX() == that.getX() && getY() == that.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    @Override
    public String toString() {
        return "TrianglePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

