package homework_21;

public class Component {
    private String brand;
    private String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Brand: ").append(brand).append(". Model: ").append(model);
        return sb.toString();
    }
}
