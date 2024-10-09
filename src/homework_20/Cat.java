package homework_20;

public class Cat extends Animal{
    String myPersonalAction;

    public Cat(String type, String name, String voice, String action) {
        super(type, name, voice);
        myPersonalAction = action;
    }

    public String action(){
        return myPersonalAction;
    }
}
