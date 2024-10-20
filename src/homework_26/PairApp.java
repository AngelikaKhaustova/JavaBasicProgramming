package homework_26;

public class PairApp {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("a", "b");

        System.out.println(pair);
        pair.swap();

        System.out.println(pair);
    }
}
