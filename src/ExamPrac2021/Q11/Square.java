package ExamPrac2021.Q11;

import java.util.Objects;

public class Square {
    private int number; // Square number
    private float sides; // Side length
    private float x; // Ordinate
    private float y; // Abscissa

    public Square(int number, int sides) {
        assert (number > 0);
        assert (sides > 0);
        this.number = number;
        this.sides = sides;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getSides() {
        return sides;
    }

    public void setSides(float sides) {
        this.sides = sides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return getNumber() == square.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }

    // Move square by x horizontally and y vertically.
    public void move(float x, float y) {
        setX(getX() + x);
        setY(getY() + y);
    }

    // Scale current square by factor.
    public void scale(float factor) {
        setSides(getSides() * factor);
    }
}