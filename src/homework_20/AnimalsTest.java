package homework_20;

public class AnimalsTest {
    public static void main(String[] args) {
        Cat pushistic = new Cat("Кот", "Пушистик", "Мяу", "ловить мышей");
        pushistic.displayInfo();
        System.out.println("Моё любимое занятие - " + pushistic.action() );

        Dog rex=new Dog("Собака","Рекс","Гав-гав","я охраняю дом");
        rex.displayInfo();
        System.out.println("У меня очень важная работа - "+ rex.job());
    }

}
