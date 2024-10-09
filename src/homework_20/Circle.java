package homework_20;

    public class Circle extends Shape {
        private double radius;

        public Circle(String name, double radius) {
            super(name);
            this.radius=radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void calculateArea() {
            System.out.println("Площадь круга:" + Math.PI*radius*radius);
        }
    }
