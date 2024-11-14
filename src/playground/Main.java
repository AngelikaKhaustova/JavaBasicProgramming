package playground;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(task1());
        System.out.println(task2());
        System.out.println(task3());

    }



    private static List<Integer> task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0, 42, 44, 80, 77, 90);

        List<Integer> result = integers.stream().filter(i -> i > 10).sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return (int) n1 % 10 - (int) n2 % 10;
            }
        }).collect(Collectors.toList());

        return result;
    }


    private static List<String> task2() {
        String str = "Быстрая лиса прыгнула через ленивую собаку. Это текст для проверки подсчета слов разных длин. Один два три один два три четыре пять.";
        List<String> words = Arrays.asList(str.toLowerCase().trim().replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+"));
        List<String> result = words.stream().min( (s1, s2) -> s1.length() - s2.length()).stream().toList();
        return result;
    }

    private static List<Integer> task3() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0, 42, 44, 80, 77, 90);
        List<Integer> result = integers.stream().filter(i -> i % 2 == 0).map(n -> n * 2).collect(Collectors.toList());
        return result;
    }


}
