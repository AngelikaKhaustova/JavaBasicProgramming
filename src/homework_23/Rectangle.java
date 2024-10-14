package homework_23;

public class Rectangle extends Shape {
    private double a, b;

    @Override
    double countArea() {
        return a * b;
    }

    @Override
    double countCircumference() {
        return (a + b) * 2;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
