package homework_31;

public enum Seasons {
    WINTER("Зима", -2.2),
    SPRING("Весна", 10.5),
    SUMMER("Лето", 25.7),
    AUTUMN("Весна", 8.0);

    private String russian;
    private double avgTemp;

    Seasons(String russian, double avgTemp) {
        this.avgTemp = avgTemp;
        this.russian = russian;
    }

    public String getRussian() {
        return russian;
    }

    public double getAvgTemp() {
        return avgTemp;
    }
}
