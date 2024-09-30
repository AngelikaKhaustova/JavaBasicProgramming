package homework_15;

public class Daughter {
    String name;
    String hair;
    int age;
    int height;
    int weight;

    public void play() {
        System.out.println("I like to play with my toys");
    }

    public void sing() {
        System.out.println("I like to sing songs");
    }

    public Daughter() {

    }

    public Daughter(String name) {
        this.name = name;
    }

    public void whoIam() {
        System.out.printf("I'm daughter. My name is %s. I am %d old. I weigh %d kg and I am %d cm tall and my hair is: %s.\n", name, age, weight, height, hair);
    }
}
