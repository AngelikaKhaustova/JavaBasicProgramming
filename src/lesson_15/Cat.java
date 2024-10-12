package lesson_15;

public class Cat { // cat
    public String name;
    public String color;
    public int age;

    public Cat(){

    }

    public Cat(String catName){
        name=catName;


    }

    public void whoAmI() {
        System.out.printf("Я котик %s, мой возраст: %d, мой окрас: %s\n", this.name, age, color);
    }

    public void sleep(){
        System.out.println(" I m sleep");
    }
    public void run(){
        System.out.println(" I m run");
    }
    public void sayMeow(){
        System.out.println(" Meow");
    }
}
