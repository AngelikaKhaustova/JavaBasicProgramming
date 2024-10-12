package homework_22;

public class SportsMan extends FitHuman {
    public SportsMan() {
        this.restTime = "5";
    }

    @Override
    public void run() {
        System.out.println("Я спортсмен-профи, я бегу со скоростью 25 км в час и мне нужно " + restTime() + " минут отдохнуть после пробежки");

    }
}
