package homework_38;

import lesson_38.Car;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {
        Sportsman[] sportsmen = new Sportsman[5];
        sportsmen[0] = new Sportsman("Johnson", 25, 88);
        sportsmen[1] = new Sportsman("Straus", 48, 60);
        sportsmen[2] = new Sportsman("Ivanov", 32, 70);
        sportsmen[3] = new Sportsman("Tihonovskii", 27, 80);
        sportsmen[4] = new Sportsman("Superman", 80, 130);

        System.out.print("Оригинальный ");
        System.out.println(Arrays.toString(sportsmen));
        Arrays.sort(sportsmen);

        System.out.print("По имени     ");
        System.out.println(Arrays.toString(sportsmen));

        SportsmanScoreComparator sportsmanScoreComparator = new SportsmanScoreComparator();
        Arrays.sort(sportsmen, sportsmanScoreComparator);

        System.out.print("По очкам     ");
        System.out.println(Arrays.toString(sportsmen));

        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman sportsman1, Sportsman sportsman2) {
                return sportsman1.getAge() - sportsman2.getAge();
            }
        });

        System.out.print("По возврасту ");
        System.out.println(Arrays.toString(sportsmen));
    }
}
