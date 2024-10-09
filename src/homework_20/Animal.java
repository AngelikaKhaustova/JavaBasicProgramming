package homework_20;

public class Animal {
    private String type;
    private String name;
    private String voice;

    public Animal(String type, String name, String voice) {
        this.type = type;
        this.name = name;
        this.voice = voice;
    }


    public void displayInfo() {
        System.out.println("Я - " + type + ", меня зовут: " + name + ", я говорю: " + voice);
    }
}
