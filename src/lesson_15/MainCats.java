package lesson_15;

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.sayMeow();
        cat.run();
        cat.sleep();
        String catName = cat.name;
        System.out.println("Name " + catName);
        System.out.println(cat.age);
        System.out.println("=============\n");

        Cat cat1 = new Cat("Max");
        System.out.println("color" + cat1.color);
        System.out.println("name" + cat1.name);


    }
}
