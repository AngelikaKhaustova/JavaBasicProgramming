package homework_22;

public class Human {
    protected String restTime;

    public Human() {
        this.restTime = "15";
    }

    public void run() {
        System.out.println("Я обычный человек, я бегу со скоростью 10 км в час и мне нужно " + restTime() + " минут отдохнуть после пробежки");
    }

    protected String restTime() {
        return restTime;
    }
}
