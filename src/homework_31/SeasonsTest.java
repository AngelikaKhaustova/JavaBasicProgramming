package homework_31;

public class SeasonsTest {
    public static void main(String[] args) {
        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons.getRussian() + " средняя температура: "+ seasons.getAvgTemp());

        }
    }
}
