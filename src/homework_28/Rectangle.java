package homework_28;

import java.util.Objects;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public String toString() {
        return "Прямоугольник [длинна = " + length + ", ширина = " + width + "]";
    }
     @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Rectangle)) return false;
        Rectangle rectangle=(Rectangle) obj;

         return Objects.equals(length, rectangle.length) &&
                 Objects.equals(width, rectangle.width);
     }
    }

