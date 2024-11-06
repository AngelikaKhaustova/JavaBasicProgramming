package homework_40;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));
        System.out.println(union(set1, set2));
        System.out.println(intersection(set1, set2));
        System.out.println(difference(set1, set2));
    }

    static Collection<String> intersection(Set<String> set1, Set<String> set2) {
        Collection result = new ArrayList();
        result.addAll(set1);
        result.retainAll(set2);
        return result;
    }

    static Collection<String> union(Set<String> set1, Set<String> set2) {
        Set<String> result = new LinkedHashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    static Collection<String> difference(Set<String> set1, Set<String> set2) {
        Collection result = new ArrayList();
        result.addAll(set1);
        result.removeAll(set2);
        return result;

    }
}
