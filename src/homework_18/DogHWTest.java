package homework_18;

public class DogHWTest {
    public static void main(String[] args) {
        DogHW_18 myDog = new DogHW_18("Puh", 30);
        myDog.jump();
        myDog.train();
        System.out.println("Попытаться перепрыгнуть барьер в 60 см");
        myDog.jumpBarrier(60);
    }

}
