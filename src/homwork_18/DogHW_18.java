package homwork_18;

public class DogHW_18 {
    private String name;
    private int jumpHeight;
    private int firstJump;

    public DogHW_18(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        firstJump = jumpHeight;
    }

    public void jump() {
        System.out.println("Я прыгнула на высоту " + jumpHeight);
    }

    public void train() {
        if (jumpHeight + 10 > firstJump * 2) {
            System.out.println("Я выше прыгать не научусь");
        } else {
            jumpHeight = jumpHeight + 10;
        }
    }

    public void jumpBarrier(int barrierHeight) {
        if (barrierHeight < jumpHeight) {
            jump();
            System.out.println("Я перепрыгнула барьер");
        } else if (barrierHeight <= firstJump * 2) {
            System.out.println("Мне нужно тренироваться чтобы перепрыгнуть этот барьер");
            while (jumpHeight < firstJump * 2) {
                System.out.println("Я тренируюсь");
                train();
                jump();
            }
            System.out.println("Я перепрыгнула барьер");
        } else {
            System.out.println("Барьер слишком высокий");
        }
    }


}
