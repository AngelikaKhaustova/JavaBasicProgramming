package homework_23;

public class Triangle extends Shape {
    private double a, b, c;

    @Override
    double countArea() {
        return Math.sqrt(countCircumference() * (countCircumference() - a) * (countCircumference() - b) * (countCircumference() - c));
    }

    @Override
    double countCircumference() {
        return a + b + c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}
