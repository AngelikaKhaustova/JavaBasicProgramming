package homework_23;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setR(3.5);

        Rectangle rectangle = new Rectangle();
        rectangle.setA(4);
        rectangle.setB(5.5);

        Triangle triangle = new Triangle();
        triangle.setA(5);
        triangle.setB(6);
        triangle.setC(7);

        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = triangle;

        double s = 0;
        double p = 0;

        System.out.printf("Площадь круга = %s, периметр круга = %s\n", circle.countArea(), circle.countCircumference());
        System.out.printf("Площадь прямоугольника = %s, периметр прямоугольника = %s\n", rectangle.countArea(), rectangle.countCircumference());
        System.out.printf("Площадь треугольника = %s, периметр треугольника = %s\n", triangle.countArea(), triangle.countCircumference());

        for (int i = 0; i < shapes.length; i++) {
            s = s + shapes[i].countArea();
            p = p + shapes[i].countCircumference();
        }
        System.out.println("Суммарная площадь фигур = " + s + ", суммарный периметр фигур = "+ p);

    }
}
