package homework_43;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(-1, 12, 20, 5, 1, -15, 24, 140);
        System.out.println(task1(integers));
    }

    private static List<Integer> task1(List<Integer> originalList){
        return originalList.stream().filter(i -> i > 10 && i < 100 && i % 2 == 0).collect(Collectors.toList());
    }
}
