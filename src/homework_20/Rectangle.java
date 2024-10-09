package homework_20;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        System.out.println("Площадь прямоугольника:" + width * height);
    }

}
