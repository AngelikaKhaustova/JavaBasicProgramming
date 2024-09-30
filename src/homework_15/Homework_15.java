package homework_15;

public class Homework_15 {
    public static void main(String[] args) {
        Husband firstHusband = new Husband("Michael");
        firstHusband.age = 39;
        firstHusband.hair = "None";
        firstHusband.height = 170;
        firstHusband.weight = 95;
        firstHusband.whoIam();
        firstHusband.eat();
        firstHusband.weight = 96;
        firstHusband.whoIam();
        firstHusband.sleep();

        Neighbour neighbour1 = new Neighbour("Leo", 35);
        neighbour1.hair = "Brown";
        neighbour1.height = 175;
        neighbour1.weight = 75;
        neighbour1.whoIam();
        neighbour1.doSport();
        neighbour1.play();

        Daughter daughter1 = new Daughter("Pat");
        daughter1.age = 10;
        daughter1.hair = "Brown";
        daughter1.height = 140;
        daughter1.weight = 30;
        daughter1.whoIam();
        daughter1.sing();
        daughter1.play();
    }


}
