package homework_22;

public class FitHuman extends Human {
    public FitHuman() {
        this.restTime = "10";
    }

    @Override
    public void run() {
        System.out.println("Я спортсмен-любитель, я бегу со скоростью 15 км в час и мне нужно " + restTime() + " минут отдохнуть после пробежки");
    }


}
