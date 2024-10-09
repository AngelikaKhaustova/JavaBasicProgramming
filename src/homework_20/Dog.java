package homework_20;

public class Dog extends Animal {
    String dogImportant;

    public Dog (String type, String name, String voice, String job) {
        super(type, name, voice);
        dogImportant = job;
    }

    public String job(){
        return dogImportant;
    }

}
