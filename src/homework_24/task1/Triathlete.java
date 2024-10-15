package homework_24.task1;

public class Triathlete implements Swimmer, Runner{
    @Override
    public void run() {
        System.out.println("I am running");
    }

    @Override
    public void swimm() {
        System.out.println("I am swimming");

    }
}
