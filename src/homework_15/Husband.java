package homework_15;

public class Husband {
    String name;
    String hair;
    int age;
    int height;
    int weight;

    public void sleep() {
        System.out.println("I'm sleeping");
    }

    public void eat() {
        System.out.println("I'm eating");
    }

    public Husband() {

    }

    public Husband(String name) {
        this.name = name;
    }

    public void whoIam() {
        System.out.printf("I'm husband. My name is %s. I am %d old. I weigh %d kg and I am %d cm tall and my hair is: %s.\n", name, age, weight, height, hair);
    }
}
