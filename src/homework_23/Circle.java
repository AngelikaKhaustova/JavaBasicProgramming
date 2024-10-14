package homework_23;

public class Circle extends Shape {
    private double r;

    @Override
    double countArea() {
        return Math.PI * r * r;
    }

    @Override
    double countCircumference() {
        return Math.PI * 2 * r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
