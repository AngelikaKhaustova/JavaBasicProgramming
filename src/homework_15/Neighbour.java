package homework_15;

public class Neighbour {
    String name;
    String hair;
    int age;
    int height;
    int weight;

    public Neighbour() {

    }

    public Neighbour(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void play() {
        System.out.println("I am playing guitar");
    }

    public void doSport() {
        System.out.println("I am fit and strong ;)");
    }

    public void whoIam() {
        System.out.printf("I'm neighbour. My name is %s. I am %d old. I weigh %d kg and I am %d cm tall and my hair is: %s.\n", name, age, weight, height, hair);
    }
}
