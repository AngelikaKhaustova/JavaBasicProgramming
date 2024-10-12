package homework_22;

public class HumanTest {
    public static void main(String[] args) {
        Human[]humans=new Human[3];
        humans[0]=new Human();
        humans[1]=new FitHuman();
        humans[2]=new SportsMan();

        for (int i = 0; i < humans.length; i++) {
            humans[i].run();

        }
    }
}
