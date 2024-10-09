package homework_20;


import java.util.concurrent.Callable;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle("Прямоугольник", 5, 7);
        rec.displayInfo();
        rec.calculateArea();
        rec.setDimension(2,8);
        rec.displayInfo();
        rec.calculateArea();

        Circle circle=new Circle("Круг",10);
        circle.displayInfo();
        circle.calculateArea();
        circle.setRadius(2);
        circle.displayInfo();
        circle.calculateArea();


    }
}
